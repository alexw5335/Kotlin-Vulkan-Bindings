#ifndef UNICODE
#define UNICODE
#endif

#include <windows.h>



typedef struct {
	HWND hwnd;
	int x;
	int y;
	int width;
	int height;
} Window;



WNDCLASS windowClass = {};

Window globalWindow = {};



LRESULT CALLBACK windowProc(HWND hwnd, UINT uMsg, WPARAM wParam, LPARAM lParam) {
	if(uMsg == WM_DESTROY) PostQuitMessage(0);

	if(uMsg == WM_PAINT) {
		PAINTSTRUCT ps;
		HDC hdc = BeginPaint(hwnd, &ps);
		FillRect(hdc, &ps.rcPaint, (HBRUSH) (COLOR_WINDOW+1));
		EndPaint(hwnd, &ps);
		return 0;
	}

	return DefWindowProc(hwnd, uMsg, wParam, lParam);
}



Window* createWindow(const wchar_t* title, int x, int y, int width, int height) {
	windowClass.lpszClassName = L"JNI";
	windowClass.lpfnWndProc = windowProc;
	windowClass.hCursor = LoadCursor(NULL, IDC_ARROW);
	RegisterClass(&windowClass);

	HWND hwnd = CreateWindow(
		windowClass.lpszClassName,
		title,
		WS_OVERLAPPEDWINDOW,
		x,
		y,
		width,
		height,
		NULL,
		NULL,
		NULL,
		NULL
	);

	globalWindow.hwnd = hwnd;
	return &globalWindow;
}



// JNI



#include <jni.h>



JNIEXPORT jlong JNICALL Java_window_winapi_WinApi_createWindow(
	JNIEnv* env,
	jobject obj,
	jlong title,
	jint x,
	jint y,
	jint width,
	jint height
) {
	return (jlong) createWindow((const wchar_t *) title, x, y, width, height);
}



JNIEXPORT jboolean JNICALL Java_window_winapi_WinApi_destroyWindow(
	JNIEnv* env,
	jobject obj
) {
	return DestroyWindow(globalWindow.hwnd);
}



JNIEXPORT jboolean JNICALL Java_window_winapi_WinApi_showWindow(
	JNIEnv* env,
	jobject obj,
	jint code
) {
	return (jboolean) ShowWindow(globalWindow.hwnd, code);
}



JNIEXPORT jint JNICALL Java_window_winapi_WinApi_getSystemMetrics(
	JNIEnv* env,
	jobject obj,
	jint code
) {
	return GetSystemMetrics(code);
}



JNIEXPORT jboolean JNICALL Java_window_winapi_WinApi_peekMessage(
	JNIEnv* env,
	jobject obj,
	jlong msg
) {
	return (jboolean) PeekMessage((MSG*) msg, 0, 0, 0, PM_REMOVE);
}



JNIEXPORT jboolean JNICALL Java_window_winapi_WinApi_translateMessage(
	JNIEnv* env,
	jobject obj,
	jlong pMsg
) {
	return (jboolean) TranslateMessage((MSG*) pMsg);
}



JNIEXPORT jint JNICALL Java_window_winapi_WinApi_dispatchMessage(
	JNIEnv* env,
	jobject obj,
	jlong pMsg
) {
	return (jint) DispatchMessage((MSG*) pMsg);
}



JNIEXPORT void JNICALL Java_window_winapi_WinApi_updateRect(
	JNIEnv* env,
	jobject obj
) {
	RECT rect = {};
	GetWindowRect(globalWindow.hwnd, &rect);
	globalWindow.x = rect.left;
	globalWindow.y = rect.top;
	globalWindow.width = rect.right - rect.left;
	globalWindow.height = rect.bottom - rect.top;
}