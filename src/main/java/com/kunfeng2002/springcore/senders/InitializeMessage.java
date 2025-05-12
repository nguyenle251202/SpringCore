package com.kunfeng2002.springcore.senders;

public class InitializeMessage implements Cloneable {

    private String message;

    public InitializeMessage(String message) {
        this.message = message;
    }

    @Override
    public InitializeMessage clone() {
        try {
            return (InitializeMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InitializeMessage{" + "message=" + message + '}';
    }
}
