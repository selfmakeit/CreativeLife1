package com.bs.create_life.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<E> {
    /**
     * 添加
     *
     * @param e
     * @return
     */
    int insert(E e);

    /**
     * 删除
     *
     * @param e
     * @return
     */
    int delete(E e);

    /**
     * 修改
     *
     * @param e
     * @return
     */
    int update(E e);

    /**
     * 查询一条记录
     *
     * @param e
     * @return
     */
    E selectOne(E e);

    /**
     * 根据条件查询所有
     *
     * @return
     */
    List<E> selectList(E e);

    /**
     * 根据ID来删除一条记录
     *
     * @param id
     */
    int deleteById(@Param("id") String id);

    /**
     * 根据ID查询一条记录
     *
     * @param id
     * @return
     */
    E selectById(@Param("id") String id);
}
