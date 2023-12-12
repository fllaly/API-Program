package com.fll.project.common;

/**
 * 返回工具类
 *
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.fll.project.common.BaseResponse<T> success(T data) {
        return new com.fll.project.common.BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static com.fll.project.common.BaseResponse error(com.fll.project.common.ErrorCode errorCode) {
        return new com.fll.project.common.BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static com.fll.project.common.BaseResponse error(int code, String message) {
        return new com.fll.project.common.BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static com.fll.project.common.BaseResponse error(com.fll.project.common.ErrorCode errorCode, String message) {
        return new com.fll.project.common.BaseResponse(errorCode.getCode(), null, message);
    }
}
