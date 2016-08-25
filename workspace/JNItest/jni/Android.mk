LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := JNItest
LOCAL_SRC_FILES := JNItest.cpp

include $(BUILD_SHARED_LIBRARY)
