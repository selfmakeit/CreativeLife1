package com.bs.create_life.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<E extends BaseEntity> {
    E findOne(String id);

    E delete(String id);

    Boolean insert(E e);
}
