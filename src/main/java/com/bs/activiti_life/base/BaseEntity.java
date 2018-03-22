package com.bs.activiti_life.base;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    protected static final Integer this_page=1;

    protected static final Integer page_size=10;

    public static Integer getThis_page() {
        return this_page;
    }

    public static Integer getPage_size() {
        return page_size;
    }
}
