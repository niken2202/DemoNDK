#include <jni.h>
#include <string>
#include "PrimeNumber.h"

extern "C"
{
JNIEXPORT jstring Java_com_example_niken_myapplication_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());

}
JNIEXPORT jboolean Java_com_example_niken_myapplication_MainActivity_isPrime(JNIEnv *env,jobject,jint  number/* this */) {
   PrimeNumber primeNumber(number);
    return primeNumber.isPrime();
}

}


