package com.bs.create_life.service;

import com.bs.create_life.base.BaseService;
import com.bs.create_life.po.FilePO;

public interface FileService extends BaseService<FilePO> {

    Boolean insert(FilePO po);
}
