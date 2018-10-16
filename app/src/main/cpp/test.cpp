//
// Created by niken on 10/16/2018.
//

#include <jni.h>
#include <string>

extern "C" {

JNIEXPORT jstring Java_com_example_niken_myapplication_MainActivity_getString(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Day la lib 2 ";
    return env->NewStringUTF(hello.c_str());
}

}


