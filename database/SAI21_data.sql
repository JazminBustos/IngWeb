-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: sai21
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `fechaInicioTrabajo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAdministrador`),
  UNIQUE KEY `idAdministrador_UNIQUE` (`idAdministrador`),
  KEY `fk_Administrador_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_Administrador_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,1,'Mauro','Frisicaro','3512881763','2017-10-05'),(2,2,'Leonardo','Sanchez','3518651840','2017-09-08');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobante`
--

DROP TABLE IF EXISTS `comprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comprobante` (
  `idComprobante` int(11) NOT NULL AUTO_INCREMENT,
  `idContrato` int(11) NOT NULL,
  `fechaVencimiento` varchar(10) DEFAULT NULL,
  `concepto` int(11) DEFAULT NULL,
  `importeOriginal` double DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`idComprobante`),
  KEY `fk_Comprobante_Contrato1_idx` (`idContrato`),
  CONSTRAINT `fk_Comprobante_Contrato1` FOREIGN KEY (`idContrato`) REFERENCES `contrato` (`idContrato`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobante`
--

LOCK TABLES `comprobante` WRITE;
/*!40000 ALTER TABLE `comprobante` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato` (
  `idContrato` int(11) NOT NULL AUTO_INCREMENT,
  `idInquilino` int(11) NOT NULL,
  `idPropiedad` int(11) NOT NULL,
  `fechaIngreso` varchar(10) DEFAULT NULL,
  `fechaInicio` varchar(10) DEFAULT NULL,
  `fechaFin` varchar(10) DEFAULT NULL,
  `diasDeGracia` int(11) DEFAULT NULL,
  `porcentajePunitorio` double DEFAULT NULL,
  `porcentajeComision` double DEFAULT NULL,
  `valorComision` double DEFAULT NULL,
  PRIMARY KEY (`idContrato`),
  KEY `fk_Contrato_Propiedad1_idx` (`idPropiedad`),
  KEY `fk_Contrato_Inquilino1_idx` (`idInquilino`),
  CONSTRAINT `fk_Contrato_Inquilino1` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contrato_Propiedad1` FOREIGN KEY (`idPropiedad`) REFERENCES `propiedad` (`idPropiedad`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `nombre` varchar(45) NOT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `codigoPostal` varchar(4) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `garante`
--

DROP TABLE IF EXISTS `garante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `garante` (
  `idGarante` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `tipoDocumento` varchar(45) DEFAULT NULL,
  `fechaNacimiento` varchar(45) DEFAULT NULL,
  `rubro` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `nro` varchar(45) NOT NULL,
  `piso` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) NOT NULL,
  `provincia` varchar(45) NOT NULL,
  `cuit` varchar(45) NOT NULL,
  PRIMARY KEY (`idGarante`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garante`
--

LOCK TABLES `garante` WRITE;
/*!40000 ALTER TABLE `garante` DISABLE KEYS */;
INSERT INTO `garante` VALUES (11,'Edesio','Munguia','testmail_1@yopmail.com','54 351-288 1763','observaciones','29348562','D.N.I','28/12/1999','rubro','sueldo','calle','numero','piso','localidad','provincia','cuit'),(12,'Arabia','Pagan Pichardo','testmail_2@yopmail.com','54 351-312 3522','observaciones','58348561','C.I.','31/21/1937','rubro','sueldo','calle','numero','piso','localidad','provincia','cuit'),(13,'Amadis','Corral','testmail_33@yopmail.com','54 351-542 2356','observaciones','48595716','C.I.','03/09/1965','rubro','sueldo','calle','numero','piso','localidad','provincia','cuit'),(14,'Ecio','Espinal','testmail_23@yopmail.com','54 351-543 3662','','02836456','L.E','22/11/1974','rubro','sueldo','calle','numero','piso','localidad','provincia','cuit'),(15,'Berna','Solorio','testmail_22@yopmail.com','54 351-308 2356','observaciones','20457614','D.N.I','13/04/2014','rubro','sueldo','calle','numero','piso','localidad','provincia','cuit');
/*!40000 ALTER TABLE `garante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inquilino`
--

DROP TABLE IF EXISTS `inquilino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inquilino` (
  `idInquilino` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) NOT NULL,
  `idGarante` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `tipoDocumento` varchar(45) DEFAULT NULL,
  `fechaNacimiento` varchar(45) DEFAULT NULL,
  `condicionIVA` varchar(45) DEFAULT NULL,
  `cuit` varchar(45) DEFAULT NULL,
  `cuentaBancaria` varchar(45) DEFAULT NULL,
  `cbu` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `notificacion` binary(1) DEFAULT NULL,
  PRIMARY KEY (`idInquilino`),
  KEY `fk_Inquilino_Usuario1_idx` (`idUsuario`),
  KEY `fk_Inquilino_Garante1_idx` (`idGarante`),
  CONSTRAINT `fk_Inquilino_Garante1` FOREIGN KEY (`idGarante`) REFERENCES `garante` (`idGarante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Inquilino_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inquilino`
--

LOCK TABLES `inquilino` WRITE;
/*!40000 ALTER TABLE `inquilino` DISABLE KEYS */;
INSERT INTO `inquilino` VALUES (11,11,11,'Bruno','Caraballo Farías','testmail_213@yopmail.com','54 351-037 0374','observaciones','10495763','C.I','19/05/1964','Sujeto Exento','cuit','cuentaBanco','cbu','Masculino',2,NULL),(12,12,12,'Baal Cantú','Cadena','testmail_213@yopmail.com','54 351-485 9475','','84753003','D.N.I','21/10/1973','Monotributista','cuit','cuentaBanco','cbu','Masculinoo',0,NULL),(13,13,13,'Iziar','Barrera','testmail_19@yopmail.com','54 351-365 9357','','39476289','L.C.','10/07/1908','condIva','Responsable Inscripto','cuentaBanco','cbu','Femenino',0,NULL),(14,14,14,'Nahuel','Torres','testmail_78@yopmail.com','54 351-464 3846','observaciones','23948571','D.N.I','15/03/1863','Consumidor Final','cuit','cuentaBanco','cbu','Masculino',0,NULL),(15,15,15,'Larisa','Benavides','testmail_983@yopmail.com','54 351-394 2846','observaciones','10875693','L.C.','18/08/1997','Monotributista','cuit','cuentaBanco','cbu','Femenino',0,NULL);
/*!40000 ALTER TABLE `inquilino` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propiedad`
--

DROP TABLE IF EXISTS `propiedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `propiedad` (
  `idPropiedad` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `piso` varchar(45) DEFAULT NULL,
  `puerta` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `legajo` varchar(45) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `idPropietario` int(11) NOT NULL,
  PRIMARY KEY (`idPropiedad`),
  KEY `fk_Propiedad_Propietario1_idx` (`idPropietario`),
  CONSTRAINT `fk_Propiedad_Propietario1` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propiedad`
--

LOCK TABLES `propiedad` WRITE;
/*!40000 ALTER TABLE `propiedad` DISABLE KEYS */;
/*!40000 ALTER TABLE `propiedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietario`
--

DROP TABLE IF EXISTS `propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `propietario` (
  `idPropietario` int(11) NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `tipoDocumento` varchar(45) DEFAULT NULL,
  `fechaNacimiento` varchar(45) DEFAULT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` varchar(45) NOT NULL,
  `piso` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) NOT NULL,
  `provincia` varchar(45) NOT NULL,
  PRIMARY KEY (`idPropietario`,`Persona_idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietario`
--

LOCK TABLES `propietario` WRITE;
/*!40000 ALTER TABLE `propietario` DISABLE KEYS */;
/*!40000 ALTER TABLE `propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibo` (
  `idRecibo` int(11) NOT NULL AUTO_INCREMENT,
  `idInquilino` int(11) NOT NULL,
  `estadoRendicion` varchar(45) DEFAULT NULL,
  `fechaEmision` varchar(45) DEFAULT NULL,
  `importeTotal` varchar(45) DEFAULT NULL,
  `aclaracion` varchar(45) DEFAULT NULL,
  `punitorios` varchar(45) DEFAULT NULL,
  `aclaracionDescuento` varchar(45) DEFAULT NULL,
  `importeDescuento` double DEFAULT NULL,
  `importeRendicion` double DEFAULT NULL,
  `importeARendir` double DEFAULT NULL,
  `fechaRendicion` char(10) DEFAULT NULL,
  PRIMARY KEY (`idRecibo`),
  KEY `fk_Recibo_Inquilino1_idx` (`idInquilino`),
  CONSTRAINT `fk_Recibo_Inquilino1` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibo`
--

LOCK TABLES `recibo` WRITE;
/*!40000 ALTER TABLE `recibo` DISABLE KEYS */;
/*!40000 ALTER TABLE `recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicio` (
  `idServicio` int(11) NOT NULL AUTO_INCREMENT,
  `idPropiedad` int(11) NOT NULL,
  `concepto` varchar(45) DEFAULT NULL,
  `importeOriginal` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `saldo` varchar(45) DEFAULT NULL,
  `fechaVencimiento` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idServicio`),
  KEY `fk_Servicios_Propiedad1_idx` (`idPropiedad`),
  CONSTRAINT `fk_Servicios_Propiedad1` FOREIGN KEY (`idPropiedad`) REFERENCES `propiedad` (`idPropiedad`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `estadoAdmin` binary(1) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'mfrisicaro','sai21','1'),(2,'leo','cobolisfun','1'),(3,'x','x','1'),(11,'Boloody48','aquarius','0'),(12,'Waing1979','7625347','0'),(13,'Aftiond','Caifie1u','0'),(14,'Makepichat1943','agh7foa3Ai','0'),(15,'Sunight1976','Aiy1eTeevoh','0');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-03  9:48:40
