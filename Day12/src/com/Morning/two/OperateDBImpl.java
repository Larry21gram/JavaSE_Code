package com.Morning.two;

import com.Morning.one.DatebaseUUtil;

public class OperateDBImpl<T> implements OperataDB<T> {
    @Override
    public T operate(T t) {
        DatebaseUUtil<T> datebaseUUtil = new DatebaseUUtil<>();
        datebaseUUtil.save(t);
        return null;
    }

}
