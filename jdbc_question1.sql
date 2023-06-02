-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: jdbc
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `question1`
--

DROP TABLE IF EXISTS `question1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question1` (
  `question1_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `questions` varchar(100) DEFAULT NULL,
  `opt1` varchar(100) DEFAULT NULL,
  `opt2` varchar(100) DEFAULT NULL,
  `opt3` varchar(100) DEFAULT NULL,
  `opt4` varchar(100) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `subjectNo` int NOT NULL,
  PRIMARY KEY (`question1_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `uselogin` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question1`
--

LOCK TABLES `question1` WRITE;
/*!40000 ALTER TABLE `question1` DISABLE KEYS */;
INSERT INTO `question1` VALUES (1,1,'What is the sum of 2 + 2 ?','4','5','3','1','opt1','math',1),(2,1,'What is 4*4','3','16','40','4','opt2','math',2),(3,1,'what is 9 X 4 = ','32','36','44','33','opt2','math',3),(4,1,'what is 3*3?','9','7','6','5','opt1','math',4),(5,1,'what is 5*5','2','25','44','4','opt2','math',5),(6,1,'What we use to print statment in Java?','sout','out.println','System.out.println();','System.out.println()','opt3','java',1),(7,1,'What we use to print statment in c++ ?','cout<<print\"hello world\";','cout<<\"hello world\";','cout<<\"hello world\"','cin>>\"hello world\";','opt2','c++',1);
/*!40000 ALTER TABLE `question1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-28 20:26:38
