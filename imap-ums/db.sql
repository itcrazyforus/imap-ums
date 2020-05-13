DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`
(
    `id`         bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
    `username`   varchar(50)         NOT NULL COMMENT '用户名或 AppId',
    `password`   varchar(255)        NOT NULL COMMENT '密码 或 AppSecret',
    `real_name`  varchar(20)                  DEFAULT NULL COMMENT '真实姓名',
    `cellphone`  varchar(20)                  DEFAULT '' COMMENT '手机号码',
    `email`      varchar(127)                 DEFAULT '' COMMENT '邮件地址',
    `type`       int(11)             NOT NULL DEFAULT '1' COMMENT '用户类型 1-普通用户 2-系统用户 3-第三方接入',
    `status`     int(1)                       DEFAULT 1 COMMENT '状态 1-正常 2-禁用',
    `sex`        int(1)                       DEFAULT 0 COMMENT '性别 0-未知 1-男 2-女',
    `province`   varchar(8)                   DEFAULT '' COMMENT '所属省份',
    `city`       varchar(8)                   DEFAULT '' COMMENT '所属城市',
    `area`       varchar(8)                   DEFAULT '' COMMENT '所属区县',
		`company_id` bigint(11)                   DEFAULT 0  COMMENT '所属公司',
    `sign_in_ip` varchar(20)                  DEFAULT '' COMMENT '登录 IP',
    `last_sign_in_time` datetime              DEFAULT NULL COMMENT '最近登录时间',
    `remark`     varchar(255)                 DEFAULT '' COMMENT '备注',
    `deleted`    int(1)                       DEFAULT 1 COMMENT '1-未删除 2-已删除',
    `created_at` datetime            NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` datetime            NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `username_unique_index` (`username`) COMMENT '用户名唯一索引',
    UNIQUE KEY `real_name_unique_index` (`real_name`) COMMENT '真实姓名唯一索引'
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8
  ROW_FORMAT = DYNAMIC COMMENT ='用户信息表';