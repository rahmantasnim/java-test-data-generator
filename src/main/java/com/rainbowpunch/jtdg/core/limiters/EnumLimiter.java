package com.rainbowpunch.jtdg.core.limiters;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class EnumLimiter<T extends Enum<T>> extends ObjectLimiter<T> {

    public static EnumLimiter<?> createEnumLimiter(Class<?> tEnum) {
        return new EnumLimiter(tEnum);
    }

    public EnumLimiter(Class<T> enumType) {
        List<T> enumList = new ArrayList<>();
        for (T t : EnumSet.allOf(enumType)) {
            enumList.add(t);
        }
        this.acceptableObjectList =  enumList;
    }

    @Override
    protected List<T> configureObjectList() {
        return null;
    }
}