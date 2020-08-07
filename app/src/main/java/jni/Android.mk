LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := NDKTool
LOCAL_SRC_FILES := com_lt_myapplication_NDKTool.c

include $(BUILD_SHARED_LIBRARY)
APP_ABI := all