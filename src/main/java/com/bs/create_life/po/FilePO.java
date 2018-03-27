package com.bs.create_life.po;

import com.bs.create_life.base.BaseEntity;

import java.util.Date;

/**
 * 文件类。全局通用
 */
public class FilePO extends BaseEntity {
    private String realPath;//文件路径

    private String type;//文件类型

    private Date upLoadTime = new Date();//上传时间

    private String netPath;//网络路径

    public String getNetPath() {
        return netPath;
    }

    public void setNetPath(String netPath) {
        this.netPath = netPath;
    }

    public String getRealPath() {
        return realPath;
    }

    public void setRealPath(String realPath) {
        this.realPath = realPath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpLoadTime() {
        return upLoadTime;
    }

    public void setUpLoadTime(Date upLoadTime) {
        this.upLoadTime = upLoadTime;
    }
}
