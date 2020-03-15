/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.AlertMessage.infrastructure;

import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author acer
 */
public class StoreProcParameters {
    private String paramter;
    private Object paramterValue;
    private int dataType;
    private RowMapper instanceClass;

    public StoreProcParameters(String paramter,Object paramterValue, int dataType, RowMapper instanceClass) {
        this.paramter = paramter;
        this.paramterValue = paramterValue;
        this.dataType = dataType;
        this.instanceClass = instanceClass;
    }

    
    public String getParamter() {
        return paramter;
    }

    public Object getParamterValue() {
        return paramterValue;
    }

    public int getDataType() {
        return dataType;
    }

    public RowMapper getInstanceClass() {
        return instanceClass;
    }
    
    
}
