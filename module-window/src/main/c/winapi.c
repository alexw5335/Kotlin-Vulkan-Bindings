#ifndef UNICODE
#define UNICODE
#endif

#include <windows.h>
#include <jni.h>



WNDCLASS class = {};

int initialised = FALSE;

JNIEnv* globalEnv;

jclass globalClass;

jmethodID methodID;



LRESULT CALLBACK windowProc(HWND hwnd, UINT uMsg, WPARAM wParam, LPARAM lParam) {
	if(globalEnv == NULL)
		return DefWindowProc(hwnd, uMsg, wParam, lParam);

	int handled = (*globalEnv)->CallBooleanMethod(
		globalEnv,
		globalClass,
		methodID,
		hwnd,
		uMsg,
		wParam,
		lParam
	);

	if(!handled)
		return DefWindowProc(hwnd, uMsg, wParam, lParam);
}



HWND createWindow(const wchar_t* title, int x, int y, int width, int height) {
	if(!initialised) {
		class.lpszClassName = L"JNI";
		class.lpfnWndProc = windowProc;
		class.hCursor = LoadCursor(NULL, IDC_ARROW);
		RegisterClass(&class);
		initialised = TRUE;
	}

	RECT clientArea = { x, y, width, height };
	AdjustWindowRect(&clientArea, WS_OVERLAPPEDWINDOW, FALSE);

	HWND hwnd = CreateWindow(
		class.lpszClassName,
		title,
		WS_OVERLAPPEDWINDOW,
		clientArea.left,
		y,
		clientArea.right - clientArea.left,
		clientArea.bottom - clientArea.top,
		NULL,
		NULL,
		NULL,
		NULL
	);

	return hwnd;
}



// JNI



JNIEXPORT HWND JNICALL Java_kvb_window_winapi_WinApi_createWindow(
	JNIEnv* env,
	jobject obj,
	const wchar_t* title,
	jint x,
	jint y,
	jint width,
	jint height
) {
	globalEnv = env;
	globalClass = (*env)->GetObjectClass(env, obj);
	methodID = (*env)->GetMethodID(env, globalClass, "windowProc", "(JIJJ)Z");
	return createWindow(title, x, y, width, height);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_destroyWindow(
	JNIEnv* env,
	jobject obj,
	HWND hwnd
) {
	return DestroyWindow(hwnd);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_showWindow(
	JNIEnv* env,
	jobject obj,
	HWND hwnd,
	jint code
) {
	return (jboolean) ShowWindow(hwnd, code);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_getSystemMetrics(
	JNIEnv* env,
	jobject obj,
	jint code
) {
	return GetSystemMetrics(code);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_peekMessage(
	JNIEnv* env,
	jobject obj,
	jlong msg
) {
	return (jboolean) PeekMessage((MSG*) msg, 0, 0, 0, PM_REMOVE);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_translateMessage(
	JNIEnv* env,
	jobject obj,
	MSG* msg
) {
	return (jboolean) TranslateMessage(msg);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_dispatchMessage(
	JNIEnv* env,
	jobject obj,
	MSG* msg
) {
	return (jint) DispatchMessage(msg);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_getRect(
	JNIEnv* env,
	jobject obj,
	HWND hwnd,
	RECT* rect
) {
	GetWindowRect(hwnd, rect);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_getClientRect(
	JNIEnv* env,
	jobject obj,
	HWND hwnd,
	RECT* rect
) {
	GetClientRect(hwnd, rect);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_getCursorPos(
	JNIEnv* env,
	jobject obj,
	HWND hwnd,
	POINT* point
) {
	GetCursorPos(point);
	ScreenToClient(hwnd, point);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_getKeyState(
	JNIEnv* env,
	jobject obj,
	jint virtualKey
) {
	return (jint) GetKeyState(virtualKey);
}



JNIEXPORT jlong JNICALL Java_kvb_window_winapi_WinApi_getFocussedWindow(
	JNIEnv* env,
	jobject obj
) {
	return (jlong) GetFocus();
}