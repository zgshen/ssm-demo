# Host: localhost  (Version 5.6.21-log)
# Date: 2017-06-14 15:58:54
# Generator: MySQL-Front 5.3  (Build 6.26)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "blog_user"
#

CREATE TABLE `blog_user` (
  `USER_ID` int(11) NOT NULL,
  `USER_CODE` varchar(32) DEFAULT NULL,
  `USER_NAME` varchar(50) DEFAULT NULL,
  `USER_PWD` varchar(50) DEFAULT NULL,
  `MAIL` varchar(150) DEFAULT NULL,
  `ADDR` varchar(255) DEFAULT NULL,
  `BORN` varchar(60) DEFAULT NULL,
  `IN_DATE` datetime DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `USER_TYPE` int(11) DEFAULT NULL,
  `USER_STATUS` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "blog_user"
#

INSERT INTO `blog_user` VALUES (1,'admin','233','2ff4d63f4adb19d17cc0a99d2532b6a1','zdshen@163.com',NULL,NULL,NULL,NULL,2,NULL),(2,'sysadmin','系统管理员','9bc34549d565d9505b287de0cd20ac77be1d3f2c',NULL,NULL,NULL,NULL,NULL,2,NULL);
