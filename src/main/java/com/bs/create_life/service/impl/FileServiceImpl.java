package com.bs.create_life.service.impl;

import com.bs.create_life.mapper.FileMapper;
import com.bs.create_life.po.FilePO;
import com.bs.create_life.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    public FileServiceImpl() {
        System.out.println(fileMapper);
    }

    @Autowired
    FileMapper fileMapper;

    @Override
    public Boolean insert(FilePO po) {
        System.out.println(fileMapper);
        return null;
    }
}
