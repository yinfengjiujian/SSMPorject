package com.neusoft.pojo;

import java.util.Date;

public class Fastdfsfile {
    private String fileId;

    private String groupName;

    private String filePath;

    private String callPath;

    private String fileName;

    private Integer isActivate;

    private Date fileDate;

    public Fastdfsfile(){

    }

    public Fastdfsfile(String fileId, String groupName, String filePath, String callPath, String fileName, Integer isActivate, Date fileDate) {
        this.fileId = fileId;
        this.groupName = groupName;
        this.filePath = filePath;
        this.callPath = callPath;
        this.fileName = fileName;
        this.isActivate = isActivate;
        this.fileDate = fileDate;
    }

    public Fastdfsfile(String groupName, String filePath, String callPath, String fileName) {
        this.groupName = groupName;
        this.filePath = filePath;
        this.callPath = callPath;
        this.fileName = fileName;
    }

    public Fastdfsfile(String groupName, String filePath, String fileName) {
        this.groupName = groupName;
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getCallPath() {
        return callPath;
    }

    public void setCallPath(String callPath) {
        this.callPath = callPath == null ? null : callPath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Integer isActivate) {
        this.isActivate = isActivate;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }
}