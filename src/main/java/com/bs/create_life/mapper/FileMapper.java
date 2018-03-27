package com.bs.create_life.mapper;

import com.bs.create_life.base.BaseMapper;
import com.bs.create_life.po.FilePO;
import com.bs.create_life.po.UserAccountPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component(value = "fileMapper")
@Mapper
public interface FileMapper extends BaseMapper<FilePO> {

    Boolean insert(FilePO filePO);
}
