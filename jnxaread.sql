-- MySQL dump 10.13  Distrib 5.7.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jnxaread
-- ------------------------------------------------------
-- Server version	5.7.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Access`
--

DROP TABLE IF EXISTS `Access`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Access` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `total` int(11) NOT NULL COMMENT '总访问量',
  `PC` int(11) NOT NULL COMMENT 'PC端访问量',
  `Android` int(11) NOT NULL COMMENT '安卓端访问量',
  `iOS` int(11) NOT NULL COMMENT 'iOS端访问量',
  `others` int(11) NOT NULL COMMENT '其他',
  `createTime` datetime(6) NOT NULL COMMENT '保存时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Access`
--

LOCK TABLES `Access` WRITE;
/*!40000 ALTER TABLE `Access` DISABLE KEYS */;
/*!40000 ALTER TABLE `Access` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Authority`
--

DROP TABLE IF EXISTS `Authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `role` varchar(8) NOT NULL COMMENT '角色',
  `addNotice` tinyint(1) NOT NULL COMMENT '发布公告',
  `addCategory` tinyint(1) NOT NULL COMMENT '添加类别',
  `addBoard` tinyint(1) NOT NULL COMMENT '添加版块',
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
  `lockTopicOfBoard` tinyint(1) NOT NULL DEFAULT '0' COMMENT '锁定版块的帖子',
  `lockReplyOfBoard` tinyint(1) NOT NULL DEFAULT '0' COMMENT '锁定版块的回复',
  `lockFictionOfCategory` tinyint(1) NOT NULL DEFAULT '0' COMMENT '锁定类别的作品',
  `lockChapterOfCategory` tinyint(1) NOT NULL DEFAULT '0' COMMENT '锁定类别的章节',
  `lockCommentOfCategory` tinyint(1) NOT NULL DEFAULT '0' COMMENT '锁定类别的评论',
  `hideOwnTopic` tinyint(1) NOT NULL COMMENT '隐藏自己的帖子',
  `hideOwnFiction` tinyint(1) NOT NULL COMMENT '隐藏自己的作品',
  `hideOwnChapter` tinyint(1) NOT NULL COMMENT '隐藏自己的章节',
  `hideOwnComment` tinyint(1) NOT NULL COMMENT '隐藏自己的评论',
  `hideTopic` tinyint(1) NOT NULL COMMENT '隐藏别人的帖子',
  `hideFiction` tinyint(1) NOT NULL COMMENT '隐藏别人的作品',
  `hideChapter` tinyint(1) NOT NULL COMMENT '隐藏别人的章节',
  `hideComment` tinyint(1) NOT NULL COMMENT '隐藏别人的评论',
  `setAnonymousOfOwnTopic` tinyint(1) NOT NULL COMMENT '将自己的帖子设为匿名状态',
  `setAnonymousOfOwnReply` tinyint(1) NOT NULL COMMENT '将自己的回复设为匿名状态',
  `setAnonymousOfOwnComment` tinyint(1) NOT NULL COMMENT '将自己的评论设为匿名状态',
  `cancelAnonymousOfOwnTopic` tinyint(1) NOT NULL COMMENT '撤销自己的帖子的匿名状态',
  `cancelAnonymousOfOwnReply` tinyint(1) NOT NULL COMMENT '撤销自己回复的匿名状态',
  `cancelAnonymousOfOwnComment` tinyint(1) NOT NULL COMMENT '撤销自己评论的匿名状态',
  `cancelAnonymousTopic` tinyint(1) NOT NULL COMMENT '撤销帖子的匿名状态',
  `cancelAnonymousReply` tinyint(1) NOT NULL COMMENT '撤销回复的匿名状态',
  `cancelAnonymousComment` tinyint(1) NOT NULL COMMENT '撤销评论的匿名状态',
  `restrictOwnFiction` tinyint(1) NOT NULL COMMENT '将自己的作品设为限制性内容',
  `restrictOwnChapter` tinyint(1) NOT NULL COMMENT '将自己的章节设为限制性内容',
  `restrictOwnTopic` tinyint(1) NOT NULL COMMENT '将自己的帖子设为限制性内容',
  `restrictFiction` tinyint(1) NOT NULL COMMENT '将作品设为限制性内容',
  `restrictChapter` tinyint(1) NOT NULL COMMENT '将章节设为限制性内容',
  `restrictTopic` tinyint(1) NOT NULL COMMENT '将帖子设为限制性内容',
  `restrictNotice` tinyint(1) NOT NULL COMMENT '将公告设为限制性内容',
  `restrictCategory` tinyint(1) NOT NULL COMMENT '将作品类别设为限制性内容',
  `restrictBoard` tinyint(1) NOT NULL COMMENT '将版块设为限制性内容',
  `hideCategory` tinyint(1) NOT NULL COMMENT '隐藏类别',
  `hideBoard` tinyint(1) NOT NULL COMMENT '隐藏版块',
  `deleteCategory` tinyint(1) NOT NULL COMMENT '删除类别',
  `deleteBoard` tinyint(1) NOT NULL COMMENT '删除版块',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Authority`
--

LOCK TABLES `Authority` WRITE;
/*!40000 ALTER TABLE `Authority` DISABLE KEYS */;
INSERT INTO `Authority` VALUES (1,'超级管理员',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1),(2,'普通用户',0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `Authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Board`
--

DROP TABLE IF EXISTS `Board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Board` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `name` varchar(8) NOT NULL COMMENT '版块名称',
  `description` varchar(255) NOT NULL COMMENT '版块说明',
  `noticeCount` int(11) NOT NULL DEFAULT '0' COMMENT '公告数量',
  `topicCount` int(11) NOT NULL DEFAULT '0' COMMENT '帖子数量',
  `replyCount` int(11) NOT NULL DEFAULT '0' COMMENT '回复数量',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对自己可见；1：对所有人可见；2：对关注者可见】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `topicLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定帖子，若为true，则本版块不能发帖',
  `replyLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定回复，若为true，则本版块下的所有帖子都不能回复',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除，如果为true，则删除该版块下所有帖子',
  `createTime` datetime(6) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Board`
--

LOCK TABLES `Board` WRITE;
/*!40000 ALTER TABLE `Board` DISABLE KEYS */;
/*!40000 ALTER TABLE `Board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Category`
--

DROP TABLE IF EXISTS `Category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `name` varchar(8) NOT NULL COMMENT '类别名称',
  `description` varchar(255) NOT NULL COMMENT '类别说明',
  `fictionCount` int(11) NOT NULL DEFAULT '0' COMMENT '作品数量',
  `chapterCount` int(11) NOT NULL DEFAULT '0' COMMENT '章节数量',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对管理员可见；1：对所有人可见；】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `fictionLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定作品，如果为true，则该类别不允许发布新作品',
  `chapterLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定章节，如果为true，则该类别下不能发布章节',
  `commentLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定评论，如果为true，则该类别下不能发表评论',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除，如果为true，则删除该类别下的所有作品',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Category`
--

LOCK TABLES `Category` WRITE;
/*!40000 ALTER TABLE `Category` DISABLE KEYS */;
/*!40000 ALTER TABLE `Category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Chapter`
--

DROP TABLE IF EXISTS `Chapter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Chapter` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `fictionId` int(11) NOT NULL COMMENT '外键，作品ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `number` int(11) NOT NULL COMMENT '章节号',
  `title` varchar(35) NOT NULL COMMENT '章节标题',
  `password` varchar(32) DEFAULT NULL COMMENT '访问密码',
  `wordCount` int(11) NOT NULL COMMENT '字数',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `viewCount` int(11) NOT NULL DEFAULT '0' COMMENT '点击量',
  `content` text NOT NULL COMMENT '章节内容',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对作者可见；1：对所有人可见；2：对关注者可见】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `contentLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定章节内容',
  `commentLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定评论',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `chapter_fiction_id` (`fictionId`),
  KEY `chapter_user_id` (`userId`),
  CONSTRAINT `chapter_fiction_id` FOREIGN KEY (`fictionId`) REFERENCES `Fiction` (`id`),
  CONSTRAINT `chapter_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Chapter`
--

LOCK TABLES `Chapter` WRITE;
/*!40000 ALTER TABLE `Chapter` DISABLE KEYS */;
/*!40000 ALTER TABLE `Chapter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Comment`
--

DROP TABLE IF EXISTS `Comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `fictionId` int(11) NOT NULL COMMENT '外键，作品ID',
  `chapterId` int(11) NOT NULL COMMENT '外键，章节ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `content` text NOT NULL COMMENT '回复内容',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对作者可见；1：对所有人可见；2：只对作者和评论者可见；3：只对关注者可见】',
  `anonymous` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否匿名',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `comment_fiction_id` (`fictionId`),
  KEY `comment_chapter_id` (`chapterId`),
  KEY `comment_user_id` (`userId`),
  CONSTRAINT `comment_chapter_id` FOREIGN KEY (`chapterId`) REFERENCES `Chapter` (`id`),
  CONSTRAINT `comment_fiction_id` FOREIGN KEY (`fictionId`) REFERENCES `Fiction` (`id`),
  CONSTRAINT `comment_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Comment`
--

LOCK TABLES `Comment` WRITE;
/*!40000 ALTER TABLE `Comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `Comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Fiction`
--

DROP TABLE IF EXISTS `Fiction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Fiction` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `categoryId` int(11) NOT NULL COMMENT '外键，类别ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `title` varchar(18) NOT NULL COMMENT '书名',
  `introduction` varchar(255) NOT NULL COMMENT '小说简介',
  `password` varchar(32) DEFAULT NULL COMMENT '访问密码',
  `chapterCount` int(11) NOT NULL DEFAULT '0' COMMENT '章节数量',
  `wordCount` int(11) NOT NULL DEFAULT '0' COMMENT '字数',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `viewCount` bigint(20) NOT NULL DEFAULT '0' COMMENT '点击量',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对作者可见；1：对所有人可见；2：只对关注者可见】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `contentLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定作品内容',
  `commentLocked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定评论',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `fiction_user_id` (`userId`),
  KEY `fiction_category_id` (`categoryId`),
  CONSTRAINT `fiction_category_id` FOREIGN KEY (`categoryId`) REFERENCES `Category` (`id`),
  CONSTRAINT `fiction_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Fiction`
--

LOCK TABLES `Fiction` WRITE;
/*!40000 ALTER TABLE `Fiction` DISABLE KEYS */;
/*!40000 ALTER TABLE `Fiction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Label`
--

DROP TABLE IF EXISTS `Label`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Label`
--

LOCK TABLES `Label` WRITE;
/*!40000 ALTER TABLE `Label` DISABLE KEYS */;
/*!40000 ALTER TABLE `Label` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Login`
--

DROP TABLE IF EXISTS `Login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Login`
--

LOCK TABLES `Login` WRITE;
/*!40000 ALTER TABLE `Login` DISABLE KEYS */;
/*!40000 ALTER TABLE `Login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Notice`
--

DROP TABLE IF EXISTS `Notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `boardId` int(11) NOT NULL COMMENT '外键，板块Id',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `lastUserId` int(11) NOT NULL COMMENT '最后编辑者ID',
  `lastTime` datetime(6) NOT NULL COMMENT '最后修改时间',
  `label` varchar(4) NOT NULL COMMENT '公告标签',
  `title` varchar(35) NOT NULL COMMENT '公告标题',
  `content` mediumtext NOT NULL COMMENT '公告内容',
  `position` int(11) NOT NULL COMMENT '公告位置',
  `password` varchar(32) DEFAULT NULL COMMENT '访问密码',
  `viewCount` int(11) NOT NULL COMMENT '查看次数',
  `updateCount` int(11) NOT NULL COMMENT '编辑次数',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对管理员可见；1：对所有人可见；】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `locked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `notice_user_id` (`userId`),
  KEY `notice_lastUser_id` (`lastUserId`),
  KEY `notice_board_id` (`boardId`),
  CONSTRAINT `notice_board_id` FOREIGN KEY (`boardId`) REFERENCES `Board` (`id`),
  CONSTRAINT `notice_lastUser_id` FOREIGN KEY (`lastUserId`) REFERENCES `User` (`id`),
  CONSTRAINT `notice_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Notice`
--

LOCK TABLES `Notice` WRITE;
/*!40000 ALTER TABLE `Notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `Notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Project`
--

DROP TABLE IF EXISTS `Project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Project`
--

LOCK TABLES `Project` WRITE;
/*!40000 ALTER TABLE `Project` DISABLE KEYS */;
/*!40000 ALTER TABLE `Project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reply`
--

DROP TABLE IF EXISTS `Reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `topicId` int(11) NOT NULL COMMENT '外键，帖子ID',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `floor` int(11) NOT NULL COMMENT '楼层数',
  `quote` int(11) NOT NULL DEFAULT '0' COMMENT '引用楼层',
  `content` mediumtext NOT NULL COMMENT '回复内容',
  `anonymous` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否匿名',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `reply_topic_id` (`topicId`),
  KEY `reply_user_id` (`userId`),
  CONSTRAINT `reply_topic_id` FOREIGN KEY (`topicId`) REFERENCES `Topic` (`id`),
  CONSTRAINT `reply_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reply`
--

LOCK TABLES `Reply` WRITE;
/*!40000 ALTER TABLE `Reply` DISABLE KEYS */;
/*!40000 ALTER TABLE `Reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Topic`
--

DROP TABLE IF EXISTS `Topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `boardId` int(11) NOT NULL COMMENT '外键，板块Id',
  `userId` int(11) NOT NULL COMMENT '外键，作者ID',
  `createTime` datetime(6) NOT NULL COMMENT '发布时间',
  `label` varchar(4) NOT NULL COMMENT '帖子标签',
  `title` varchar(35) NOT NULL COMMENT '帖子标题',
  `content` mediumtext NOT NULL COMMENT '帖子内容',
  `password` varchar(32) DEFAULT NULL COMMENT '访问密码',
  `replyCount` int(11) NOT NULL DEFAULT '0' COMMENT '回复数量',
  `viewCount` int(11) NOT NULL DEFAULT '0' COMMENT '查看数量',
  `visible` int(11) NOT NULL DEFAULT '1' COMMENT '对谁可见【0：只对管理员可见；1：对所有人可见；】',
  `restricted` int(11) NOT NULL DEFAULT '0' COMMENT '限制性等级',
  `anonymous` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否匿名',
  `locked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `topic_user_id` (`userId`),
  KEY `topic_board_id` (`boardId`),
  CONSTRAINT `topic_board_id` FOREIGN KEY (`boardId`) REFERENCES `Board` (`id`),
  CONSTRAINT `topic_user_id` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Topic`
--

LOCK TABLES `Topic` WRITE;
/*!40000 ALTER TABLE `Topic` DISABLE KEYS */;
/*!40000 ALTER TABLE `Topic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '用户等级',
  `grade` int(11) NOT NULL DEFAULT '0' COMMENT '用户积分',
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-16 11:42:28
