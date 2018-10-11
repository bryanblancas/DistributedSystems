CREATE DATABASE  IF NOT EXISTS `p3_distribuidos` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `p3_distribuidos`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: p3_distribuidos
-- ------------------------------------------------------
-- Server version	5.5.60-log

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
-- Table structure for table `carta`
--

DROP TABLE IF EXISTS `carta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) NOT NULL,
  `imagen` varchar(1000) NOT NULL,
  `tipos_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_carta_tipos_idx` (`tipos_id`),
  CONSTRAINT `fk_carta_tipos` FOREIGN KEY (`tipos_id`) REFERENCES `tipos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carta`
--

LOCK TABLES `carta` WRITE;
/*!40000 ALTER TABLE `carta` DISABLE KEYS */;
INSERT INTO `carta` VALUES (2,'uno+2amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno+2amarillo.png',1),(3,'uno+2azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno+2azul.png',1),(4,'uno+2morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno+2morado.png',1),(5,'uno+2rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno+2rojo.png',1),(6,'uno0amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno0amarillo.png',1),(7,'uno0azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno0azul.png',1),(8,'uno0morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno0morado.png',1),(9,'uno0rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno0rojo.png',1),(10,'uno1amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno1amarillo.png',1),(11,'uno1azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno1azul.png',1),(12,'uno1morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno1morado.png',1),(13,'uno1rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno1rojo.png',1),(14,'uno2amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno2amarillo.png',1),(15,'uno2azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno2azul.png',1),(16,'uno2morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno2morado.png',1),(17,'uno2rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno2rojo.png',1),(18,'uno3amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno3amarillo.png',1),(19,'uno3azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno3azul.png',1),(20,'uno3morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno3morado.png',1),(21,'uno3rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno3rojo.png',1),(22,'uno4amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno4amarillo.png',1),(23,'uno4azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno4azul.png',1),(24,'uno4morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno4morado.png',1),(25,'uno4rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno4rojo.png',1),(26,'uno5amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno5amarillo.png',1),(27,'uno5azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno5azul.png',1),(28,'uno5morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno5morado.png',1),(29,'uno5rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno5rojo.png',1),(30,'uno6amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno6amarillo.png',1),(31,'uno6azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno6azul.png',1),(32,'uno6morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno6morado.png',1),(33,'uno6rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno6rojo.png',1),(34,'uno7amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno7amarillo.png',1),(35,'uno7azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno7azul.png',1),(36,'uno7morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno7morado.png',1),(37,'uno7rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno7rojo.png',1),(38,'uno8amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno8amarillo.png',1),(39,'uno8azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno8azul.png',1),(40,'uno8morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno8morado.png',1),(41,'uno8rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno8rojo.png',1),(42,'uno9amarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno9amarillo.png',1),(43,'uno9azul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno9azul.png',1),(44,'uno9morado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno9morado.png',1),(45,'uno9rojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/uno9rojo.png',1),(46,'unocambioamarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocambioamarillo.png',1),(47,'unocambioazul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocambioazul.png',1),(48,'unocambiomorado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocambiomorado.png',1),(49,'unocambiorojo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocambiorojo.png',1),(50,'unocancelamarillo.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocancelamarillo.png',1),(51,'unocancelazul.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocancelazul.png',1),(52,'unocancelmorado.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocancelmorado.png',1),(53,'unocancerojol.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocancerojol.png',1),(54,'unocomodin.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unocomodin.png',1),(55,'unojoker.png','/home/bryan/Documentos/Distribuidos/P3/imagenes/unojoker.png',1);
/*!40000 ALTER TABLE `carta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jugador` (
  `idjugador` varchar(45) NOT NULL,
  `ip` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idjugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES ('bryan','192.168.0.1','bryan'),('bryanprueba','192.168.0.1','ajdasd');
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos`
--

DROP TABLE IF EXISTS `tipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipos` (
  `id` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos`
--

LOCK TABLES `tipos` WRITE;
/*!40000 ALTER TABLE `tipos` DISABLE KEYS */;
INSERT INTO `tipos` VALUES (1,'comun'),(2,'especial');
/*!40000 ALTER TABLE `tipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tirada`
--

DROP TABLE IF EXISTS `tirada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tirada` (
  `idtirada` int(11) NOT NULL AUTO_INCREMENT,
  `hora` varchar(45) NOT NULL,
  `carta_id` int(11) NOT NULL,
  `jugador_idjugador` varchar(45) NOT NULL,
  PRIMARY KEY (`idtirada`),
  KEY `fk_tirada_carta1_idx` (`carta_id`),
  KEY `fk_tirada_jugador1_idx` (`jugador_idjugador`),
  CONSTRAINT `fk_tirada_carta1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tirada_jugador1` FOREIGN KEY (`jugador_idjugador`) REFERENCES `jugador` (`idjugador`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tirada`
--

LOCK TABLES `tirada` WRITE;
/*!40000 ALTER TABLE `tirada` DISABLE KEYS */;
INSERT INTO `tirada` VALUES (14,'11:47:33',48,'bryan'),(15,'11:47:35',21,'bryan'),(16,'11:48:47',19,'bryan'),(17,'11:48:48',51,'bryan'),(18,'11:50:0',39,'bryan'),(19,'11:50:1',11,'bryan'),(20,'11:50:2',54,'bryan'),(21,'140',40,'bryanprueba'),(22,'156',30,'bryanprueba');
/*!40000 ALTER TABLE `tirada` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-10 19:18:37
