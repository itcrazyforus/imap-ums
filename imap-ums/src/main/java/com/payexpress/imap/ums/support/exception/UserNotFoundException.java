package com.payexpress.imap.ums.support.exception;

/**
 * {@link Exception} 用户不存在异常
 *
 * @author <a href="563750241@qq.com">liusc</a>
 * @date 5/11/2020
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
