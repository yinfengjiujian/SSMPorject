DROP TABLE IF EXISTS FastDFSFile;
CREATE TABLE FastDFSFile (
  file_id varchar(32) NOT NULL,
  group_name varchar(50) NOT NULL COMMENT 'fastdfs存储组名称',
  file_path varchar(100) NOT NULL  COMMENT 'fastdfs存储的文件地址',
  call_path varchar(200) NOT NULL COMMENT '文件对外http访问地址',
  file_name varchar(100) NOT NULL COMMENT '上传文件原名称',
  is_activate int(3) NOT NULL DEFAULT 1 COMMENT '是否有效，1：有效；2：无效',
  file_date datetime NOT NULL COMMENT '文件数据修改时间或上传时间',
  PRIMARY KEY (file_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='fastdfs文件系统记录表';