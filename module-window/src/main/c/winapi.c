#ifndef UNICODE
#define UNICODE
#endif

#include <windows.h>



// Structs



typedef struct {
	HWND hwnd;
	RECT rect;
	RECT clientRect;
} Window;



typedef struct {
	Window* array;
	int size;
	int capacity;
} WindowList;



// Functions



void wl_init(WindowList* list, int initialCapacity) {
	list->array = calloc(initialCapacity, sizeof(Window));
	list->capacity = initialCapacity;
	list->size = 0;
}



void wl_resize(WindowList* list, int newCapacity) {
	list->array = realloc(list->array, newCapacity * sizeof(Window));
	list->capacity = newCapacity;
	if(newCapacity < list->size) list->size = newCapacity;
}



void wl_add(WindowList* list, Window* window) {
	if(list->size == list->capacity)
		wl_resize(list, list->capacity * 2);
	list->array[list->size++] = *window;
}



void wl_remove(WindowList* list, int index) {
	if(index < 0 || index >= list->size) return;
	for(int i = index; i < list->size - 1; i++) {
		list->array[i] = list->array[i + 1];
	}
	list->size--;
}



int wl_getIndex(WindowList* list, HWND hwnd) {
	for(int i = 0; i < list->size; i++)
		if(list->array[i].hwnd == hwnd)
			return i;

	return -1;
}



Window* wl_get(WindowList* list, HWND hwnd) {
	for(int i = 0; i < list->size; i++)
		if(list->array[i].hwnd == hwnd)
			return &list->array[i];

	return NULL;
}



// API



WNDCLASS class = {};

WindowList windows = {};

int initialised = FALSE;



LRESULT CALLBACK windowProc(HWND hwnd, UINT uMsg, WPARAM wParam, LPARAM lParam) {
	if(uMsg == WM_DESTROY) {
		PostMessage(NULL, WM_DESTROY, (WPARAM) hwnd, 0);
		return 0;
	}

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
	if(!initialised) {
		class.lpszClassName = L"JNI";
		class.lpfnWndProc = windowProc;
		class.hCursor = LoadCursor(NULL, IDC_ARROW);
		RegisterClass(&class);

		wl_init(&windows, 8);
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

	Window window = {};
	window.hwnd = hwnd;
	wl_add(&windows, &window);
	return &windows.array[windows.size - 1];
}



// JNI



#include <jni.h>



JNIEXPORT jlong JNICALL Java_kvb_window_winapi_WinApi_createWindow(
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



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_removeWindow(
	JNIEnv* env,
	jobject obj,
	jlong hwnd
) {
	wl_remove(&windows, wl_getIndex(&windows, (HWND) hwnd));
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_destroyWindow(
	JNIEnv* env,
	jobject obj,
	jlong hwnd
) {
	return DestroyWindow((HWND) hwnd);
}



JNIEXPORT jboolean JNICALL Java_kvb_window_winapi_WinApi_showWindow(
	JNIEnv* env,
	jobject obj,
	jlong hwnd,
	jint code
) {
	return (jboolean) ShowWindow((HWND) hwnd, code);
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
	jlong pMsg
) {
	return (jboolean) TranslateMessage((MSG*) pMsg);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_dispatchMessage(
	JNIEnv* env,
	jobject obj,
	jlong pMsg
) {
	return (jint) DispatchMessage((MSG*) pMsg);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_updateRect(
	JNIEnv* env,
	jobject obj,
	jlong hwnd
) {
	Window* window = wl_get(&windows, (HWND) hwnd);
	GetWindowRect((HWND) hwnd, &window->rect);
}



JNIEXPORT void JNICALL Java_kvb_window_winapi_WinApi_updateClientRect(
	JNIEnv* env,
	jobject obj,
	jlong hwnd
) {
	Window* window = wl_get(&windows, (HWND) hwnd);
	GetClientRect((HWND) hwnd, &window->clientRect);
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_getCursorX(
	JNIEnv* env,
	jobject obj,
	HWND hwnd
) {
	POINT point = { };
	GetCursorPos(&point);
	ScreenToClient(hwnd, &point);
	return point.x;
}



JNIEXPORT int JNICALL Java_kvb_window_winapi_WinApi_getCursorY(
	JNIEnv* env,
	jobject obj,
	HWND hwnd
) {
	POINT point = { };
	GetCursorPos(&point);
	ScreenToClient(hwnd, &point);
	return point.y;
}



JNIEXPORT jint JNICALL Java_kvb_window_winapi_WinApi_getKeyState(
	JNIEnv* env,
	jobject obj,
	jint virtualKey
) {
	return (jint) GetKeyState(virtualKey);
}