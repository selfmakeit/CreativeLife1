package com.bs.create_life.service.impl;

import com.bs.create_life.base.BaseEntity;
import com.bs.create_life.base.BaseMapper;
import com.bs.create_life.base.BaseServiceImpl;
import com.bs.create_life.mapper.FileMapper;
import com.bs.create_life.mapper.UserAccountMapper;
import com.bs.create_life.po.FilePO;
import com.bs.create_life.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl
        extends BaseServiceImpl<FilePO, FileMapper>
        implements FileService {


    @Override
    public void setMapper(FileMapper m) {

    }

    public FileServiceImpl() {
        System.out.println(fileMapper);
    }

    @Autowired
    FileMapper fileMapper;

    @Override
    public Boolean insert(FilePO po) {
        Boolean insert = fileMapper.insert(po);
        return insert;
    }
}
