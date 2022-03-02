package org.suai.lab3.Exception;

public class MyException extends RuntimeException {
    private String Message;

    public MyException(String Message){
        this.Message = Message;
    }

    public String getMessage(){
        return this.Message;
    }
}
