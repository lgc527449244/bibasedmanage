package com.jmu.bibasedmanage.exception;

/**
 * Created by ljc on 2017/12/24.
 */
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BusinessException(Object object){
        super(object.toString());
    }
}
