#define STB_IMAGE_IMPLEMENTATION

#include <stb_image.h>
#include <jni.h>



typedef struct Image {
	unsigned char* data;
	int width;
	int height;
	int channels;
} Image;



JNIEXPORT void JNICALL Java_kvb_core_FileUtils_loadImage(JNIEnv* env, jobject obj, jlong pFile, jlong pImage, jint desiredChannels) {
	Image* image = (Image*) pImage;
	image->data = stbi_load((const char*) pFile, &image->width, &image->height, &image->channels, desiredChannels);
}



JNIEXPORT void JNICALL Java_kvb_core_FileUtils_freeImageData(JNIEnv* env, jobject obj, jlong pData) {
	free((char*) pData);
}



// gcc -shared c/common/image_reading.c -o native/windows/image_reading.dll -Iinclude/common -Iinclude/windows/jni