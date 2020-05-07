/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.28 : Database - jnxaread
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jnxaread` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `jnxaread`;

/*Table structure for table `Access` */

DROP TABLE IF EXISTS `Access`;

CREATE TABLE `Access` (
  `id` int(11) NOT NULL COMMENT '主键自增',
  `total` int(11) NOT NULL COMMENT '总访问量',
  `PC` int(11) NOT NULL COMMENT 'PC端访问量',
  `Android` int(11) NOT NULL COMMENT '安卓端访问量',
  `iOS` int(11) NOT NULL COMMENT 'iOS端访问量',
  `others` int(11) NOT NULL COMMENT '其他',
  `createTime` datetime(6) NOT NULL COMMENT '保存时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Access` */

/*Table structure for table `Authority` */

DROP TABLE IF EXISTS `Authority`;

CREATE TABLE `Authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `role` varchar(8) NOT NULL COMMENT '角色',
  `banAccount` tinyint(1) NOT NULL COMMENT '封禁账号',
  `banTopic` tinyint(1) NOT NULL COMMENT '禁止发帖',
  `banReply` tinyint(1) NOT NULL COMMENT '禁止回复',
  `banMessage` tinyint(1) NOT NULL COMMENT '禁止私信',
  `banFiction` tinyint(1) NOT NULL COMMENT '禁止发布作品',
  `banComment` tinyint(1) NOT NULL COMMENT '禁止评论',
  `deleteOwnTopic` tinyint(1) NOT NULL COMMENT '删除自己的帖子',
  `deleteOwnReply` tinyint(1) NOT NULL COMMENT '删除自己的回复',
  `deleteOwnFiction` tinyint(1) NOT NULL COMMENT '删除自己的作品',
  `deleteOwnChapter` tinyint(1) NOT NULL COMMENT '删除自己的章节',
  `deleteOwnComment` tinyint(1) NOT NULL COMMENT '删除自己的评论',
  `deleteTopic` tinyint(1) NOT NULL COMMENT '删除别人的帖子',
  `deleteReply` tinyint(1) NOT NULL COMMENT '删除别人的回复',
  `deleteFiction` tinyint(1) NOT NULL COMMENT '删除别人的作品',
  `deleteChapter` tinyint(1) NOT NULL COMMENT '删除别人的章节',
  `deleteComment` tinyint(1) NOT NULL COMMENT '删除别人的评论',
  `lockTopic` tinyint(1) NOT NULL COMMENT '锁定别人的帖子',
  `lockFiction` tinyint(1) NOT NULL COMMENT '锁定别人的作品',
  `lockChapter` tinyint(1) NOT NULL COMMENT '锁定别人的章节',
  `lockNotice` tinyint(1) NOT NULL COMMENT '锁定公告',
  `lockContentOfTopic` tinyint(1) NOT NULL COMMENT '锁定帖子的内容',
  `lockContentOfFiction` tinyint(1) NOT NULL COMMENT '锁定作品的章节',
  `lockContentOfChapter` tinyint(1) NOT NULL COMMENT '锁定章节的内容',
  `lockCommentOfOwnFiction` tinyint(1) NOT NULL COMMENT '锁定自己的作品评论',
  `lockCommentOfOwnChapter` tinyint(1) NOT NULL COMMENT '锁定自己的章节评论',
  `lockCommentOfFiction` tinyint(1) NOT NULL COMMENT '锁定作品的评论',
  `lockCommentOfChapter` tinyint(1) NOT NULL COMMENT '锁定章节的评论',
  `hideOwnTopic` tinyint(1) NOT NULL COMMENT '隐藏自己的帖子',
  `hideOwnFiction` tinyint(1) NOT NULL COMMENT '隐藏自己的作品',
  `hideOwnChapter` tinyint(1) NOT NULL COMMENT '隐藏自己的章节',
  `hideOwnComment` tinyint(1) NOT NULL COMMENT '隐藏自己的评论',
  `hideTopic` tinyint(1) NOT NULL COMMENT '隐藏别人的帖子',
  `hideFiction` tinyint(1) NOT NULL COMMENT '隐藏别人的作品',
  `hideChapter` tinyint(1) NOT NULL COMMENT '隐藏别人的章节',
  `hideComment` tinyint(1) NOT NULL COMMENT '隐藏别人的评论',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `Authority` */

insert  into `Authority`(`id`,`role`,`banAccount`,`banTopic`,`banReply`,`banMessage`,`banFiction`,`banComment`,`deleteOwnTopic`,`deleteOwnReply`,`deleteOwnFiction`,`deleteOwnChapter`,`deleteOwnComment`,`deleteTopic`,`deleteReply`,`deleteFiction`,`deleteChapter`,`deleteComment`,`lockTopic`,`lockFiction`,`lockChapter`,`lockNotice`,`lockContentOfTopic`,`lockContentOfFiction`,`lockContentOfChapter`,`lockCommentOfOwnFiction`,`lockCommentOfOwnChapter`,`lockCommentOfFiction`,`lockCommentOfChapter`,`hideOwnTopic`,`hideOwnFiction`,`hideOwnChapter`,`hideOwnComment`,`hideTopic`,`hideFiction`,`hideChapter`,`hideComment`) values 
(1,'超级管理员',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),
(2,'普通用户',0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,0);

/*Table structure for table `Category` */

DROP TABLE IF EXISTS `Category`;

CREATE TABLE `Category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `name` varchar(8) NOT NULL COMMENT '类别名称',
  `description` varchar(255) NOT NULL COMMENT '类别说明',
  `fictionCount` int(11) NOT NULL DEFAULT '0' COMMENT '作品数量',
  `chapterCount` int(11) NOT NULL DEFAULT '0' COMMENT '章节数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Category` */

/*Table structure for table `Chapter` */

DROP TABLE IF EXISTS `Chapter`;

CREATE TABLE `Chapter` (
  `id` int(11) NOT NULL COMMENT '主键自增',
  `fictionId` int(11) NOT NULL COMMENT '外键，作品ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `number` int(11) NOT NULL COMMENT '章节号',
  `title` varchar(35) NOT NULL COMMENT '章节标题',
  `wordCount` int(11) NOT NULL COMMENT '字数',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `viewCount` int(11) NOT NULL DEFAULT '0' COMMENT '点击量',
  `content` text NOT NULL COMMENT '章节内容',
  `hided` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `lockedContent` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定章节内容',
  `lockedComment` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定评论',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `chapter_fiction_id` (`fictionId`),
  KEY `chapter_user_id` (`userId`),
  CONSTRAINT `chapter_fiction_id` FOREIGN KEY (`fictionId`) REFERENCES `Fiction` (`id`),
  CONSTRAINT `chapter_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Chapter` */

/*Table structure for table `Comment` */

DROP TABLE IF EXISTS `Comment`;

CREATE TABLE `Comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `fictionId` int(11) NOT NULL COMMENT '外键，作品ID',
  `chapterId` int(11) NOT NULL COMMENT '外键，章节ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `content` text NOT NULL COMMENT '回复内容',
  `hided` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `comment_fiction_id` (`fictionId`),
  KEY `comment_chapter_id` (`chapterId`),
  KEY `comment_user_id` (`userId`),
  CONSTRAINT `comment_chapter_id` FOREIGN KEY (`chapterId`) REFERENCES `Chapter` (`id`),
  CONSTRAINT `comment_fiction_id` FOREIGN KEY (`fictionId`) REFERENCES `Fiction` (`id`),
  CONSTRAINT `comment_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Comment` */

/*Table structure for table `Fiction` */

DROP TABLE IF EXISTS `Fiction`;

CREATE TABLE `Fiction` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `categoryId` int(11) NOT NULL COMMENT '外键，类别ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `title` varchar(18) NOT NULL COMMENT '书名',
  `introduction` varchar(255) NOT NULL COMMENT '小说简介',
  `chapterCount` int(11) NOT NULL DEFAULT '0' COMMENT '章节数量',
  `wordCount` int(11) NOT NULL DEFAULT '0' COMMENT '字数',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `viewCount` bigint(20) NOT NULL DEFAULT '0' COMMENT '点击量',
  `hided` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `lockedContent` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定作品内容',
  `lockedComment` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定评论',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `fiction_user_id` (`userId`),
  KEY `fiction_category_id` (`categoryId`),
  CONSTRAINT `fiction_category_id` FOREIGN KEY (`categoryId`) REFERENCES `Category` (`id`),
  CONSTRAINT `fiction_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Fiction` */

/*Table structure for table `Label` */

DROP TABLE IF EXISTS `Label`;

CREATE TABLE `Label` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `fictionId` int(11) NOT NULL COMMENT '外键，作品ID',
  `userId` int(11) NOT NULL COMMENT '外键，用户ID',
  `label` varchar(15) NOT NULL COMMENT '作品标签',
  `createTime` datetime(6) NOT NULL COMMENT '添加时间',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `label_fiction_id` (`fictionId`),
  KEY `label_user_id` (`userId`),
  CONSTRAINT `label_fiction_id` FOREIGN KEY (`fictionId`) REFERENCES `Fiction` (`id`),
  CONSTRAINT `label_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Label` */

/*Table structure for table `Login` */

DROP TABLE IF EXISTS `Login`;

CREATE TABLE `Login` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `userId` int(11) NOT NULL COMMENT '外键，用户ID',
  `createTime` datetime NOT NULL COMMENT '登录时间',
  `IP` varchar(128) NOT NULL COMMENT 'IP地址',
  `terminal` varchar(255) NOT NULL COMMENT '登录终端',
  `system` int(1) NOT NULL COMMENT '登录系统',
  PRIMARY KEY (`id`),
  KEY `login_user_id` (`userId`),
  CONSTRAINT `login_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Login` */

/*Table structure for table `Notice` */

DROP TABLE IF EXISTS `Notice`;

CREATE TABLE `Notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `lastUserId` int(11) NOT NULL COMMENT '最后编辑者ID',
  `lastTime` datetime(6) NOT NULL COMMENT '最后修改时间',
  `label` varchar(4) NOT NULL COMMENT '公告标签',
  `title` varchar(35) NOT NULL COMMENT '公告标题',
  `content` mediumtext NOT NULL COMMENT '公告内容',
  `position` int(11) NOT NULL COMMENT '公告位置',
  `viewCount` int(11) NOT NULL COMMENT '查看次数',
  `updateCount` int(11) NOT NULL COMMENT '编辑次数',
  `locked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定',
  `hided` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `notice_user_id` (`userId`),
  KEY `notice_lastUser_id` (`lastUserId`),
  CONSTRAINT `notice_lastUser_id` FOREIGN KEY (`lastUserId`) REFERENCES `User` (`id`),
  CONSTRAINT `notice_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Notice` */

/*Table structure for table `Project` */

DROP TABLE IF EXISTS `Project`;

CREATE TABLE `Project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `version` varchar(16) NOT NULL COMMENT '工程版本',
  `versionInfo` varchar(255) NOT NULL COMMENT '版本信息',
  `userId` int(11) NOT NULL COMMENT '发布用户',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`),
  KEY `project_user_id` (`userId`),
  CONSTRAINT `project_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Project` */

/*Table structure for table `Reply` */

DROP TABLE IF EXISTS `Reply`;

CREATE TABLE `Reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `topicId` int(11) NOT NULL COMMENT '外键，帖子ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `floor` int(11) NOT NULL COMMENT '楼层数',
  `quote` int(11) NOT NULL DEFAULT '0' COMMENT '引用楼层',
  `content` mediumtext NOT NULL COMMENT '回复内容',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `reply_topic_id` (`topicId`),
  KEY `reply_user_id` (`userId`),
  CONSTRAINT `reply_topic_id` FOREIGN KEY (`topicId`) REFERENCES `Topic` (`id`),
  CONSTRAINT `reply_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Reply` */

/*Table structure for table `Topic` */

DROP TABLE IF EXISTS `Topic`;

CREATE TABLE `Topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `label` varchar(4) NOT NULL COMMENT '帖子标签',
  `title` varchar(35) NOT NULL COMMENT '帖子标题',
  `content` mediumtext NOT NULL COMMENT '帖子内容',
  `replyCount` int(11) NOT NULL DEFAULT '0' COMMENT '回复数量',
  `viewCount` int(11) NOT NULL DEFAULT '0' COMMENT '查看数量',
  `locked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定',
  `hided` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `topic_user_id` (`userId`),
  CONSTRAINT `topic_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `Topic` */

/*Table structure for table `User` */

DROP TABLE IF EXISTS `User`;

CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `account` varchar(20) NOT NULL COMMENT '用户账号',
  `password` varchar(32) NOT NULL COMMENT '用户密码',
  `username` varchar(12) NOT NULL COMMENT '用户昵称',
  `countryCode` varchar(8) NOT NULL DEFAULT '+86' COMMENT '国际电话区号',
  `mobile` varchar(11) NOT NULL DEFAULT '00000000000' COMMENT '手机号',
  `email` varchar(32) NOT NULL COMMENT '电子邮箱',
  `gender` int(1) NOT NULL DEFAULT '0' COMMENT '性别【0：女性；1：男性】',
  `authorityId` int(11) NOT NULL DEFAULT '2' COMMENT '外键，权限ID',
  `bannedTopic` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止发帖',
  `bannedReply` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止回复',
  `bannedMessage` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止私信',
  `bannedFiction` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止发布作品',
  `bannedChapter` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止发布章节',
  `bannedComment` tinyint(1) NOT NULL DEFAULT '0' COMMENT '禁止评论',
  `locked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否封禁',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `topicCount` int(11) NOT NULL DEFAULT '0' COMMENT '发帖数量',
  `replyCount` int(11) NOT NULL DEFAULT '0' COMMENT '回复数量',
  `fictionCount` int(11) NOT NULL DEFAULT '0' COMMENT '作品数量',
  `chapterCount` int(11) NOT NULL DEFAULT '0' COMMENT '章节数量',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `loginCount` int(11) NOT NULL DEFAULT '0' COMMENT '登录次数',
  `createTime` datetime(6) NOT NULL COMMENT '注册时间',
  `photo` varchar(255) DEFAULT NULL COMMENT '头像路径',
  `comeFrom` varchar(128) DEFAULT NULL COMMENT '来自于',
  `signature` varchar(128) DEFAULT NULL COMMENT '个性签名',
  `introduction` varchar(255) DEFAULT NULL COMMENT '自我介绍',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `user_authority_id` (`authorityId`),
  CONSTRAINT `user_authority_id` FOREIGN KEY (`authorityId`) REFERENCES `Authority` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `User` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
