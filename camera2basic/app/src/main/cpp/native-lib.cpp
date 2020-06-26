#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_jeongari_camera2_1basic_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_jeongari_camera2_1basic_CameraActivity_stringFromJNI(JNIEnv *env, jobject thiz) {

}