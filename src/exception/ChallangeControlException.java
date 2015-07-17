/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Logan
 */
public class ChallangeControlException extends Exception {

    public ChallangeControlException() {

    }

    public ChallangeControlException(String message) {
        super(message);
    }

    public ChallangeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChallangeControlException(Throwable cause) {
        super(cause);
    }

    public ChallangeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
