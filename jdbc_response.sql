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
-- Table structure for table `response`
--

DROP TABLE IF EXISTS `response`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `response` (
  `response_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `question1_id` int DEFAULT NULL,
  `response_user_ans` varchar(100) DEFAULT NULL,
  `ANS` varchar(100) DEFAULT NULL,
  `marks` int DEFAULT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `subjectNo` int NOT NULL,
  `attempt` int NOT NULL,
  PRIMARY KEY (`response_id`),
  KEY `USER_ID_idx` (`user_id`),
  KEY `QUESTION_ID_idx` (`question1_id`),
  CONSTRAINT `QUESTION_ID` FOREIGN KEY (`question1_id`) REFERENCES `question1` (`question1_id`),
  CONSTRAINT `userID` FOREIGN KEY (`user_id`) REFERENCES `uselogin` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `response`
--

LOCK TABLES `response` WRITE;
/*!40000 ALTER TABLE `response` DISABLE KEYS */;
INSERT INTO `response` VALUES (34,1,1,'opt1','opt1',1,'math',2,1),(35,1,2,'opt2','opt2',1,'math',3,1),(36,1,3,'opt2','opt2',1,'math',4,1),(37,1,4,'opt1','opt1',1,'math',5,1),(38,1,5,'opt2','opt2',1,'math',6,1),(39,1,1,'opt1','opt1',1,'math',2,1),(40,1,2,'opt2','opt2',1,'math',3,1),(41,1,3,'opt2','opt2',1,'math',4,1),(42,1,4,'opt1','opt1',1,'math',5,1),(43,1,5,'opt2','opt2',1,'math',6,1),(44,1,1,'opt1','opt1',1,'math',2,1),(45,1,2,'opt2','opt2',1,'math',3,1),(46,1,3,'opt3','opt2',0,'math',4,1),(47,1,4,'opt1','opt1',1,'math',5,1),(48,1,5,'opt2','opt2',1,'math',6,1),(49,1,1,'opt1','opt1',1,'math',2,1),(50,1,2,'opt2','opt2',1,'math',3,1),(51,1,3,'opt1','opt2',0,'math',4,1),(52,1,4,'opt1','opt1',1,'math',5,1),(53,1,5,'opt2','opt2',1,'math',6,1),(54,1,1,'opt1','opt1',1,'math',2,1),(55,1,2,'opt2','opt2',1,'math',3,1),(56,1,3,'opt2','opt2',1,'math',4,1),(57,1,4,'opt1','opt1',1,'math',5,1),(58,1,5,'opt2','opt2',1,'math',6,1),(59,2,6,'opt3','opt3',1,'java',2,2);
/*!40000 ALTER TABLE `response` ENABLE KEYS */;
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
