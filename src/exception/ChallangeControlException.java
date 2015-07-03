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

    /**
     * Creates a new instance of <code>ChallangeControlException</code> without
     * detail message.
     */
    public ChallangeControlException() {
    }

    /**
     * Constructs an instance of <code>ChallangeControlException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ChallangeControlException(String msg) {
        super(msg);
    }
}
