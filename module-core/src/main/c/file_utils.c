#include <jni.h>
#include <stdio.h>
#include <stdlib.h>



#ifdef WIN32



	#include <fileapi.h>
	#include <handleapi.h>

	typedef HANDLE* File;

	void closeFile(File file) {
		CloseHandle(file);
	}

	File openFileForReading(char* path) {
		return CreateFile(
			path,
			GENERIC_READ,
			0,
			NULL,
			OPEN_EXISTING,
			FILE_ATTRIBUTE_NORMAL,
			NULL
		);
	}

	int getFileSize(File file) {
		return (int) GetFileSize(file, NULL);
	}

	void readFile(File file, int size, void* data) {
		ReadFile(file, data, size, NULL, NULL);
	}



#else



	typedef FILE* File;

	void closeFile(File file) {
		fclose(file);
	}

	File openFileForReading(char* path) {
		return fopen(path, "r");
	}

	int getFileSize(File file) {
		fseeko(file, 0, SEEK_END);
		return ftello(file);
	}

	void readFile(File file, int size, void* data) {
		fread(data, 1, size, file);
	}



#endif



// JNI



JNIEXPORT jlong JNICALL Java_kvb_core_file_FileUtils_openFileForReading(
	JNIEnv* env,
	jobject obj,
	jlong path
) {
	return (jlong) openFileForReading((char*) path);
}



JNIEXPORT jlong JNICALL Java_kvb_core_file_FileUtils_getFileSize(
	JNIEnv* env,
	jobject obj,
	jlong file
) {
	return (jlong) getFileSize((File) file);
}



JNIEXPORT void JNICALL Java_kvb_core_file_FileUtils_readFile(
	JNIEnv* env,
	jobject obj,
	jlong file,
	jlong size,
	jlong data
) {
	readFile((File) file, size, (void*) data);
}