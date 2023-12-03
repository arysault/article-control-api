package com.teamfour.articlecontrol.exception;

import java.io.Serial;

public class BusinnessException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public BusinnessException(String message) {
        super(message);
    }
}
