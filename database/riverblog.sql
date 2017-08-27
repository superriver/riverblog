CREATE DATABASE IF NOT EXISTS `riverblog`;

USE `riverblog`;

DROP TABLE IF EXISTS `t_article`;

CREATE TABLE `t_article` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(70) NOT NULL COMMENT '标题',
  `summary` varchar(600) DEFAULT NULL COMMENT '概要',
  `content` text COMMENT '内容',
  `category_ids` varchar(20) DEFAULT NULL COMMENT '类别id,多个,用/分开',
  `tag_ids` varchar(20) DEFAULT NULL COMMENT '标签id,多个,用,分开',
  `status` int(1) NOT NULL COMMENT '文章状态：0-草稿，1-博文',
  `write_time` datetime DEFAULT NULL COMMENT '撰写时间',
  `pub_time` datetime DEFAULT NULL COMMENT '发布时间',
  `hits` int(10) DEFAULT '0',
  `code` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `article_code` (`code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;