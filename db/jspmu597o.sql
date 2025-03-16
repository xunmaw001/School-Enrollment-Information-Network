-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspmu597o
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='客服咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (91,'2021-03-03 03:53:27',1,1,'提问1','回复1',1),(92,'2021-03-03 03:53:27',2,2,'提问2','回复2',2),(93,'2021-03-03 03:53:27',3,3,'提问3','回复3',3),(94,'2021-03-03 03:53:27',4,4,'提问4','回复4',4),(95,'2021-03-03 03:53:27',5,5,'提问5','回复5',5),(96,'2021-03-03 03:53:27',6,6,'提问6','回复6',6);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/jspmu597o/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/jspmu597o/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/jspmu597o/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangyuanfengcai`
--

DROP TABLE IF EXISTS `dangyuanfengcai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangyuanfengcai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshixingming` varchar(200) NOT NULL COMMENT '教师姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `rudangshijian` date DEFAULT NULL COMMENT '入党时间',
  `youxiugongzuo` longtext COMMENT '优秀工作',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='党员风采';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangyuanfengcai`
--

LOCK TABLES `dangyuanfengcai` WRITE;
/*!40000 ALTER TABLE `dangyuanfengcai` DISABLE KEYS */;
INSERT INTO `dangyuanfengcai` VALUES (21,'2021-03-03 03:53:27','教师姓名1','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang1.jpg','男','2021-03-03','优秀工作1'),(22,'2021-03-03 03:53:27','教师姓名2','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang2.jpg','男','2021-03-03','优秀工作2'),(23,'2021-03-03 03:53:27','教师姓名3','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang3.jpg','男','2021-03-03','优秀工作3'),(24,'2021-03-03 03:53:27','教师姓名4','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang4.jpg','男','2021-03-03','优秀工作4'),(25,'2021-03-03 03:53:27','教师姓名5','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang5.jpg','男','2021-03-03','优秀工作5'),(26,'2021-03-03 03:53:27','教师姓名6','http://localhost:8080/jspmu597o/upload/dangyuanfengcai_touxiang6.jpg','男','2021-03-03','优秀工作6');
/*!40000 ALTER TABLE `dangyuanfengcai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `luquxinxi`
--

DROP TABLE IF EXISTS `luquxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `luquxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanyemingcheng` varchar(200) DEFAULT NULL COMMENT '专业名称',
  `nianxian` varchar(200) DEFAULT NULL COMMENT '年限',
  `luqufenshu` varchar(200) DEFAULT NULL COMMENT '录取分数',
  `luqurenshu` varchar(200) DEFAULT NULL COMMENT '录取人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614743683444 DEFAULT CHARSET=utf8 COMMENT='录取信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `luquxinxi`
--

LOCK TABLES `luquxinxi` WRITE;
/*!40000 ALTER TABLE `luquxinxi` DISABLE KEYS */;
INSERT INTO `luquxinxi` VALUES (71,'2021-03-03 03:53:27','专业名称1','年限1','录取分数1','录取人数1'),(72,'2021-03-03 03:53:27','专业名称2','年限2','录取分数2','录取人数2'),(73,'2021-03-03 03:53:27','专业名称3','年限3','录取分数3','录取人数3'),(74,'2021-03-03 03:53:27','专业名称4','年限4','录取分数4','录取人数4'),(75,'2021-03-03 03:53:27','专业名称5','年限5','录取分数5','录取人数5'),(76,'2021-03-03 03:53:27','专业名称6','年限6','录取分数6','录取人数6'),(1614743683443,'2021-03-03 03:54:43','计算机专业','2020年','650','130');
/*!40000 ALTER TABLE `luquxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='校园公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (101,'2021-03-03 03:53:27','标题1','简介1','http://localhost:8080/jspmu597o/upload/news_picture1.jpg','内容1'),(102,'2021-03-03 03:53:27','标题2','简介2','http://localhost:8080/jspmu597o/upload/news_picture2.jpg','内容2'),(103,'2021-03-03 03:53:27','标题3','简介3','http://localhost:8080/jspmu597o/upload/news_picture3.jpg','内容3'),(104,'2021-03-03 03:53:27','标题4','简介4','http://localhost:8080/jspmu597o/upload/news_picture4.jpg','内容4'),(105,'2021-03-03 03:53:27','标题5','简介5','http://localhost:8080/jspmu597o/upload/news_picture5.jpg','内容5'),(106,'2021-03-03 03:53:27','标题6','简介6','http://localhost:8080/jspmu597o/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiziduiwu`
--

DROP TABLE IF EXISTS `shiziduiwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiziduiwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshixingming` varchar(200) NOT NULL COMMENT '教师姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='师资队伍';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiziduiwu`
--

LOCK TABLES `shiziduiwu` WRITE;
/*!40000 ALTER TABLE `shiziduiwu` DISABLE KEYS */;
INSERT INTO `shiziduiwu` VALUES (41,'2021-03-03 03:53:27','教师姓名1','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang1.jpg','男','专业1','简介1'),(42,'2021-03-03 03:53:27','教师姓名2','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang2.jpg','男','专业2','简介2'),(43,'2021-03-03 03:53:27','教师姓名3','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang3.jpg','男','专业3','简介3'),(44,'2021-03-03 03:53:27','教师姓名4','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang4.jpg','男','专业4','简介4'),(45,'2021-03-03 03:53:27','教师姓名5','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang5.jpg','男','专业5','简介5'),(46,'2021-03-03 03:53:27','教师姓名6','http://localhost:8080/jspmu597o/upload/shiziduiwu_touxiang6.jpg','男','专业6','简介6');
/*!40000 ALTER TABLE `shiziduiwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','tolzknkle67r1wtgk8fhgsmbbri1e59a','2021-03-03 03:54:12','2021-03-03 04:54:13');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-03 03:53:27');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyuanzhijia`
--

DROP TABLE IF EXISTS `xiaoyuanzhijia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyuanzhijia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zaixiaoshijian` varchar(200) DEFAULT NULL COMMENT '在校时间',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='校园之家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyuanzhijia`
--

LOCK TABLES `xiaoyuanzhijia` WRITE;
/*!40000 ALTER TABLE `xiaoyuanzhijia` DISABLE KEYS */;
INSERT INTO `xiaoyuanzhijia` VALUES (31,'2021-03-03 03:53:27','姓名1','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang1.jpg','男','在校时间1','简介1'),(32,'2021-03-03 03:53:27','姓名2','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang2.jpg','男','在校时间2','简介2'),(33,'2021-03-03 03:53:27','姓名3','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang3.jpg','男','在校时间3','简介3'),(34,'2021-03-03 03:53:27','姓名4','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang4.jpg','男','在校时间4','简介4'),(35,'2021-03-03 03:53:27','姓名5','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang5.jpg','男','在校时间5','简介5'),(36,'2021-03-03 03:53:27','姓名6','http://localhost:8080/jspmu597o/upload/xiaoyuanzhijia_touxiang6.jpg','男','在校时间6','简介6');
/*!40000 ALTER TABLE `xiaoyuanzhijia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshenghao` varchar(200) NOT NULL COMMENT '学生号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xueshengxingming` varchar(200) NOT NULL COMMENT '学生姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueshenghao` (`xueshenghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2021-03-03 03:53:27','学生1','123456','学生姓名1','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang1.jpg','男','13823888881','773890001@qq.com'),(12,'2021-03-03 03:53:27','学生2','123456','学生姓名2','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang2.jpg','男','13823888882','773890002@qq.com'),(13,'2021-03-03 03:53:27','学生3','123456','学生姓名3','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang3.jpg','男','13823888883','773890003@qq.com'),(14,'2021-03-03 03:53:27','学生4','123456','学生姓名4','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang4.jpg','男','13823888884','773890004@qq.com'),(15,'2021-03-03 03:53:27','学生5','123456','学生姓名5','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang5.jpg','男','13823888885','773890005@qq.com'),(16,'2021-03-03 03:53:27','学生6','123456','学生姓名6','http://localhost:8080/jspmu597o/upload/xuesheng_touxiang6.jpg','男','13823888886','773890006@qq.com');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengluqu`
--

DROP TABLE IF EXISTS `xueshengluqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengluqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshenghao` varchar(200) DEFAULT NULL COMMENT '学生号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `xueshengfenshu` int(11) DEFAULT NULL COMMENT '学生分数',
  `zhuanyemingcheng` varchar(200) DEFAULT NULL COMMENT '专业名称',
  `luqufenshu` int(11) DEFAULT NULL COMMENT '录取分数',
  `luquriqi` date DEFAULT NULL COMMENT '录取日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614743701319 DEFAULT CHARSET=utf8 COMMENT='学生录取';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengluqu`
--

LOCK TABLES `xueshengluqu` WRITE;
/*!40000 ALTER TABLE `xueshengluqu` DISABLE KEYS */;
INSERT INTO `xueshengluqu` VALUES (81,'2021-03-03 03:53:27','学生号1','学生姓名1',1,'专业名称1',1,'2021-03-03'),(82,'2021-03-03 03:53:27','学生号2','学生姓名2',2,'专业名称2',2,'2021-03-03'),(83,'2021-03-03 03:53:27','学生号3','学生姓名3',3,'专业名称3',3,'2021-03-03'),(84,'2021-03-03 03:53:27','学生号4','学生姓名4',4,'专业名称4',4,'2021-03-03'),(85,'2021-03-03 03:53:27','学生号5','学生姓名5',5,'专业名称5',5,'2021-03-03'),(86,'2021-03-03 03:53:27','学生号6','学生姓名6',6,'专业名称6',6,'2021-03-03'),(1614743701318,'2021-03-03 03:55:00','学生1','学生姓名1',NULL,'计算机专业',650,'2021-03-03');
/*!40000 ALTER TABLE `xueshengluqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxijianjie`
--

DROP TABLE IF EXISTS `yuanxijianjie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxijianjie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanximingcheng` varchar(200) NOT NULL COMMENT '院系名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yuanxijianjie` longtext COMMENT '院系简介',
  `baokaoxuzhi` longtext COMMENT '报考须知',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='院系简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxijianjie`
--

LOCK TABLES `yuanxijianjie` WRITE;
/*!40000 ALTER TABLE `yuanxijianjie` DISABLE KEYS */;
INSERT INTO `yuanxijianjie` VALUES (51,'2021-03-03 03:53:27','院系名称1','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian1.jpg','院系简介1','报考须知1'),(52,'2021-03-03 03:53:27','院系名称2','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian2.jpg','院系简介2','报考须知2'),(53,'2021-03-03 03:53:27','院系名称3','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian3.jpg','院系简介3','报考须知3'),(54,'2021-03-03 03:53:27','院系名称4','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian4.jpg','院系简介4','报考须知4'),(55,'2021-03-03 03:53:27','院系名称5','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian5.jpg','院系简介5','报考须知5'),(56,'2021-03-03 03:53:27','院系名称6','http://localhost:8080/jspmu597o/upload/yuanxijianjie_tupian6.jpg','院系简介6','报考须知6');
/*!40000 ALTER TABLE `yuanxijianjie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanyejianjie`
--

DROP TABLE IF EXISTS `zhuanyejianjie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanyejianjie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanyemingcheng` varchar(200) NOT NULL COMMENT '专业名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhuanyejianjie` longtext COMMENT '专业简介',
  `baokaoxuzhi` longtext COMMENT '报考须知',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='专业简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanyejianjie`
--

LOCK TABLES `zhuanyejianjie` WRITE;
/*!40000 ALTER TABLE `zhuanyejianjie` DISABLE KEYS */;
INSERT INTO `zhuanyejianjie` VALUES (61,'2021-03-03 03:53:27','专业名称1','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian1.jpg','专业简介1','报考须知1'),(62,'2021-03-03 03:53:27','专业名称2','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian2.jpg','专业简介2','报考须知2'),(63,'2021-03-03 03:53:27','专业名称3','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian3.jpg','专业简介3','报考须知3'),(64,'2021-03-03 03:53:27','专业名称4','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian4.jpg','专业简介4','报考须知4'),(65,'2021-03-03 03:53:27','专业名称5','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian5.jpg','专业简介5','报考须知5'),(66,'2021-03-03 03:53:27','专业名称6','http://localhost:8080/jspmu597o/upload/zhuanyejianjie_tupian6.jpg','专业简介6','报考须知6');
/*!40000 ALTER TABLE `zhuanyejianjie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-04 21:32:52
