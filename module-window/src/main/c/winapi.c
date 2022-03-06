#ifndef UNICODE
#define UNICODE
#endif

#include <windows.h>
#include <jni.h>



typedef struct {
	HWND hwnd;
	RECT rect;
	RECT clientRect;
} Window;



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



void createWindow(Window* window, const wchar_t* title, int x, int y, int width, int height) {
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

	window->hwnd = hwnd;
}



// JNI



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_createWindow(
	JNIEnv* env,
	jobject obj,
	Window* window,
	const wchar_t* title,
	jint x,
	jint y,
	jint width,
	jint height
) {
	globalEnv = env;
	globalClass = (*env)->GetObjectClass(env, obj);
	methodID = (*env)->GetMethodID(env, globalClass, "windowProc", "(JIJJ)Z");
	createWindow(window, title, x, y, width, height);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_destroyWindow(
	JNIEnv* env,
	jobject obj,
	Window* window
) {
	return DestroyWindow(window->hwnd);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_showWindow(
	JNIEnv* env,
	jobject obj,
	Window* window,
	jint code
) {
	return (jboolean) ShowWindow(window->hwnd, code);
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



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_updateRect(
	JNIEnv* env,
	jobject obj,
	Window* window
) {
	GetWindowRect(window->hwnd, &window->rect);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_updateClientRect(
	JNIEnv* env,
	jobject obj,
	Window* window
) {
	GetClientRect(window->hwnd, &window->clientRect);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_getCursorX(
	JNIEnv* env,
	jobject obj,
	Window* window
) {
	POINT point = { };
	GetCursorPos(&point);
	ScreenToClient(window->hwnd, &point);
	return point.x;
}



JNIEXPORT int JNICALL Java_kvb_window_winapi_WinApi_getCursorY(
	JNIEnv* env,
	jobject obj,
	Window* window
) {
	POINT point = { };
	GetCursorPos(&point);
	ScreenToClient(window->hwnd, &point);
	return point.y;
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