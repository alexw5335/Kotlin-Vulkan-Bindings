#include <jni.h>



JNIEXPORT jint JNICALL Java_memory_NativeSizes_long() {
	return (jint) sizeof(long);
}

JNIEXPORT jint JNICALL Java_memory_NativeSizes_longLong() {
	return (jint) sizeof(long long);
}

JNIEXPORT jint JNICALL Java_memory_NativeSizes_longDouble() {
	return (jint) sizeof(long double);
}

JNIEXPORT jint JNICALL Java_memory_NativeSizes_pointer() {
	return (jint) sizeof(void*);
}

JNIEXPORT jint JNICALL Java_memory_NativeSizes_sizeT() {
	return (jint) sizeof(size_t);
}