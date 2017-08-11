/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.6.34 : Database - ace
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ace` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ace`;

/*Table structure for table `ace_gnmx` */

DROP TABLE IF EXISTS `ace_gnmx`;

CREATE TABLE `ace_gnmx` (
  `ID_GNMX` int(11) NOT NULL,
  `ID_XTGN` int(11) DEFAULT NULL,
  `NM_GNMX` varchar(20) NOT NULL,
  `URL_GNMX` varchar(50) DEFAULT NULL,
  `SEQ_GNMX` int(11) DEFAULT NULL,
  `ICO_GNMX` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ace_gnmx` */

insert  into `ace_gnmx`(`ID_GNMX`,`ID_XTGN`,`NM_GNMX`,`URL_GNMX`,`SEQ_GNMX`,`ICO_GNMX`) values 
(1,4,'快速采集',NULL,1,'icon-glass'),
(2,4,'采集发布',NULL,2,'icon-glass'),
(3,4,'采集部署',NULL,3,'icon-glass'),
(4,3,'数据查看',NULL,2,'icon-glass'),
(5,3,'数据表管理',NULL,1,'icon-glass'),
(6,1,'功能管理','gngl',1,'icon-glass');

/*Table structure for table `ace_user` */

DROP TABLE IF EXISTS `ace_user`;

CREATE TABLE `ace_user` (
  `ID_USER` int(11) NOT NULL AUTO_INCREMENT,
  `NM_USER` varchar(20) NOT NULL,
  `PWD_USER` varchar(32) NOT NULL,
  `EMAIL_USER` varchar(20) DEFAULT NULL,
  `PHONE_USER` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ace_user` */

/*Table structure for table `ace_xtgn` */

DROP TABLE IF EXISTS `ace_xtgn`;

CREATE TABLE `ace_xtgn` (
  `ID_XTGN` int(11) NOT NULL,
  `NM_XTGN` varchar(20) NOT NULL,
  `SEQ_XTGN` int(11) DEFAULT NULL,
  `ICO_XTGN` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ace_xtgn` */

insert  into `ace_xtgn`(`ID_XTGN`,`NM_XTGN`,`SEQ_XTGN`,`ICO_XTGN`) values 
(1,'系统管理',4,'icon-cog'),
(2,'权限管理',3,'icon-user'),
(3,'数据管理',2,'icon-leaf'),
(4,'采集应用',1,'icon-envelope');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
