-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.18-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cmbs
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ cmbs;
USE cmbs;

--
-- Table structure for table `cmbs`.`club`
--

DROP TABLE IF EXISTS `club`;
CREATE TABLE `club` (
  `id_club` int(10) unsigned NOT NULL auto_increment,
  `club_date` date NOT NULL default '0000-00-00',
  `club_name` varchar(45) NOT NULL default '',
  `club_mem_fee` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`id_club`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cmbs`.`club`
--

/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` (`id_club`,`club_date`,`club_name`,`club_mem_fee`) VALUES 
 (1,'2023-01-17','Sports','200');
/*!40000 ALTER TABLE `club` ENABLE KEYS */;


--
-- Table structure for table `cmbs`.`member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id_member` int(10) unsigned NOT NULL auto_increment,
  `member_name` varchar(45) NOT NULL default '',
  `member_date` date NOT NULL default '0000-00-00',
  `member_level` varchar(45) NOT NULL default '',
  `member_registration` varchar(45) NOT NULL default '',
  `member_monthly` varchar(45) NOT NULL default '',
  `member_annual` varchar(45) NOT NULL default '',
  `member_reason` varchar(200) NOT NULL default '',
  PRIMARY KEY  (`id_member`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cmbs`.`member`
--

/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` (`id_member`,`member_name`,`member_date`,`member_level`,`member_registration`,`member_monthly`,`member_annual`,`member_reason`) VALUES 
 (1,'Khea Salcedo','2023-01-18','Regular','200','200','200','dasdasdsadasasd');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;


--
-- Table structure for table `cmbs`.`user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL auto_increment,
  `user_fname` varchar(45) NOT NULL default '',
  `user_mname` varchar(45) NOT NULL default '',
  `user_lname` varchar(45) NOT NULL default '',
  `user_contact` varchar(45) NOT NULL default '',
  `user_username` varchar(45) NOT NULL default '',
  `user_password` longtext NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cmbs`.`user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`user_fname`,`user_mname`,`user_lname`,`user_contact`,`user_username`,`user_password`) VALUES 
 (1,'Khea Anthonnette','Beloria','Salcedo','09075417664','khea','1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
