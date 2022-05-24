-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_sw
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `dadosacidente`
--

DROP TABLE IF EXISTS `dadosacidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dadosacidente` (
  `Codigo` int NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `Data` varchar(45) NOT NULL,
  `Local` varchar(45) NOT NULL,
  `Causa` varchar(45) NOT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dadosacidente`
--

LOCK TABLES `dadosacidente` WRITE;
/*!40000 ALTER TABLE `dadosacidente` DISABLE KEYS */;
INSERT INTO `dadosacidente` VALUES (2,'Daniel','12312312312','24122022','refeitorio','piso molhado'),(3,'Daniel','12312312312','18142018','Departamento de controle quimico','Vazamento de gas altamente toxico');
/*!40000 ALTER TABLE `dadosacidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `Nome` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telefone` varchar(45) NOT NULL,
  `Celular` varchar(45) NOT NULL,
  `Sexo` varchar(45) NOT NULL,
  `Endereco` varchar(45) NOT NULL,
  `Numero` varchar(45) NOT NULL,
  `Complemento` varchar(45) NOT NULL,
  `Bairro` varchar(45) NOT NULL,
  `Cep` varchar(45) NOT NULL,
  `Cidade` varchar(45) NOT NULL,
  `Estados` varchar(45) NOT NULL,
  `RG` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Nascimento` varchar(45) NOT NULL,
  `Senha` varchar(45) NOT NULL,
  `Imagem` varchar(75) NOT NULL,
  PRIMARY KEY (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('Daniel','daniel@gmail.com','1188887777','11988887777','Masculino','rua avenida são carlos','584','ap21','São Mateus','08748210','São Paulo','SP','6875195263','12312312312','daniel','03052012','123','C:\\Users\\danie\\Pictures\\fotos\\download (1).jpg');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sistema_sw'
--

--
-- Dumping routines for database 'sistema_sw'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-24 16:17:29
