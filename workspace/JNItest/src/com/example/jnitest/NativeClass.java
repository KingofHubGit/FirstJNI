package com.example.jnitest;

import android.util.Log;

public class NativeClass {  
	
    public static native int jniArrayAvg(int a, int b);  

    static {  
        Log.i("NativeClass","before load library");  
        System.loadLibrary("JNItest");        //注意这里为自己指定的.so文件，无lib前缀，亦无后缀  
        Log.i("NativeClass","after load library");    
    }  
}  