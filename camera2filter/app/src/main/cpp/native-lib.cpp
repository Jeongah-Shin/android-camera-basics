#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_jeongari_camera2_1filter_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
