	#include <jni.h>
	#include <math.h>
    #include "com_example_jnitest_NativeClass.h"
    #ifdef __cplusplus  //最好有这个，否则被编译器改了函数名字找不到不要怪我
    extern "C" {
    #endif

				JNIEXPORT jint JNICALL Java_com_example_jnitest_NativeClass_jniArrayAvg(
						JNIEnv  *env,  jclass,  jint a, jint b) {

					jint jsum;

					jsum=pow(a,b);

					return jsum;
				}
    #ifdef __cplusplus

    }
    #endif
