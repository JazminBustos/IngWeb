drop schema sai21;


-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SAI21
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SAI21
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SAI21` DEFAULT CHARACTER SET utf8 ;
USE `SAI21` ;

-- -----------------------------------------------------
-- Table `SAI21`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `clave` VARCHAR(45) NULL,
  `estadoAdmin` BINARY NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Administrador` (
  `idAdministrador` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `fechaInicioTrabajo` VARCHAR(10) NULL,
  PRIMARY KEY (`idAdministrador`),
  INDEX `fk_Administrador_Usuario1_idx` (`idUsuario` ASC),
  UNIQUE INDEX `idAdministrador_UNIQUE` (`idAdministrador` ASC),
  CONSTRAINT `fk_Administrador_Usuario1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `SAI21`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Empresa` (
  `nombre` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NULL,
  `codigoPostal` VARCHAR(4) NULL,
  `calle` VARCHAR(45) NULL,
  `numero` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`nombre`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Garante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Garante` (
  `idGarante` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `observaciones` VARCHAR(45) NULL,
  `documento` VARCHAR(45) NULL,
  `tipoDocumento` VARCHAR(45) NULL,
  `fechaNacimiento` VARCHAR(45) NULL,
  `rubro` VARCHAR(45) NULL,
  `sueldo` VARCHAR(45) NOT NULL,
  `calle` VARCHAR(45) NOT NULL,
  `nro` VARCHAR(45) NOT NULL,
  `piso` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  `cuit` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGarante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Inquilino`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Inquilino` (
  `idInquilino` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `idGarante` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `observaciones` VARCHAR(45) NULL,
  `documento` VARCHAR(45) NULL,
  `tipoDocumento` VARCHAR(45) NULL,
  `fechaNacimiento` VARCHAR(45) NULL,
  `condicionIVA` VARCHAR(45) NULL,
  `cuit` VARCHAR(45) NULL,
  `cuentaBancaria` VARCHAR(45) NULL,
  `cbu` VARCHAR(45) NULL,
  `genero` VARCHAR(45) NULL,
  `saldo` DOUBLE NULL,
  `notificacion` BINARY NULL,
  PRIMARY KEY (`idInquilino`),
  INDEX `fk_Inquilino_Usuario1_idx` (`idUsuario` ASC),
  INDEX `fk_Inquilino_Garante1_idx` (`idGarante` ASC),
  CONSTRAINT `fk_Inquilino_Usuario1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `SAI21`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Inquilino_Garante1`
    FOREIGN KEY (`idGarante`)
    REFERENCES `SAI21`.`Garante` (`idGarante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Propietario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Propietario` (
  `idPropietario` INT NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `observaciones` VARCHAR(45) NULL,
  `documento` VARCHAR(45) NULL,
  `tipoDocumento` VARCHAR(45) NULL,
  `fechaNacimiento` VARCHAR(45) NULL,
  `calle` VARCHAR(45) NOT NULL,
  `numero` VARCHAR(45) NOT NULL,
  `piso` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPropietario`, `Persona_idPersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Propiedad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Propiedad` (
  `idPropiedad` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NULL,
  `calle` VARCHAR(45) NULL,
  `numero` VARCHAR(45) NULL,
  `piso` VARCHAR(45) NULL,
  `puerta` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `legajo` VARCHAR(45) NULL,
  `observaciones` VARCHAR(45) NULL,
  `idPropietario` INT NOT NULL,
  PRIMARY KEY (`idPropiedad`),
  INDEX `fk_Propiedad_Propietario1_idx` (`idPropietario` ASC),
  CONSTRAINT `fk_Propiedad_Propietario1`
    FOREIGN KEY (`idPropietario`)
    REFERENCES `SAI21`.`Propietario` (`idPropietario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Recibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Recibo` (
  `idRecibo` INT NOT NULL AUTO_INCREMENT,
  `idInquilino` INT NOT NULL,
  `estadoRendicion` VARCHAR(45) NULL,
  `fechaEmision` VARCHAR(45) NULL,
  `importeTotal` VARCHAR(45) NULL,
  `aclaracion` VARCHAR(45) NULL,
  `punitorios` VARCHAR(45) NULL,
  `aclaracionDescuento` VARCHAR(45) NULL,
  `importeDescuento` DOUBLE NULL,
  `importeRendicion` DOUBLE NULL,
  `importeARendir` DOUBLE NULL,
  `fechaRendicion` CHAR(10) NULL,
  PRIMARY KEY (`idRecibo`),
  INDEX `fk_Recibo_Inquilino1_idx` (`idInquilino` ASC),
  CONSTRAINT `fk_Recibo_Inquilino1`
    FOREIGN KEY (`idInquilino`)
    REFERENCES `SAI21`.`Inquilino` (`idInquilino`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Contrato` (
  `idContrato` INT NOT NULL AUTO_INCREMENT,
  `idInquilino` INT NOT NULL,
  `idPropiedad` INT NOT NULL,
  `fechaIngreso` VARCHAR(10) NULL,
  `fechaInicio` VARCHAR(10) NULL,
  `fechaFin` VARCHAR(10) NULL,
  `diasDeGracia` INT NULL,
  `porcentajePunitorio` DOUBLE NULL,
  `porcentajeComision` DOUBLE NULL,
  `valorComision` DOUBLE NULL,
  PRIMARY KEY (`idContrato`),
  INDEX `fk_Contrato_Propiedad1_idx` (`idPropiedad` ASC),
  INDEX `fk_Contrato_Inquilino1_idx` (`idInquilino` ASC),
  CONSTRAINT `fk_Contrato_Propiedad1`
    FOREIGN KEY (`idPropiedad`)
    REFERENCES `SAI21`.`Propiedad` (`idPropiedad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contrato_Inquilino1`
    FOREIGN KEY (`idInquilino`)
    REFERENCES `SAI21`.`Inquilino` (`idInquilino`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Servicio` (
  `idServicio` INT NOT NULL AUTO_INCREMENT,
  `idPropiedad` INT NOT NULL,
  `concepto` VARCHAR(45) NULL,
  `importeOriginal` VARCHAR(45) NULL,
  `estado` VARCHAR(45) NULL,
  `saldo` VARCHAR(45) NULL,
  `fechaVencimiento` VARCHAR(10) NULL,
  PRIMARY KEY (`idServicio`),
  INDEX `fk_Servicios_Propiedad1_idx` (`idPropiedad` ASC),
  CONSTRAINT `fk_Servicios_Propiedad1`
    FOREIGN KEY (`idPropiedad`)
    REFERENCES `SAI21`.`Propiedad` (`idPropiedad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SAI21`.`Comprobante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SAI21`.`Comprobante` (
  `idComprobante` INT NOT NULL AUTO_INCREMENT,
  `idContrato` INT NOT NULL,
  `fechaVencimiento` VARCHAR(10) NULL,
  `concepto` INT NULL,
  `importeOriginal` DOUBLE NULL,
  `saldo` DOUBLE NULL,
  `estado` INT NULL,
  PRIMARY KEY (`idComprobante`),
  INDEX `fk_Comprobante_Contrato1_idx` (`idContrato` ASC),
  CONSTRAINT `fk_Comprobante_Contrato1`
    FOREIGN KEY (`idContrato`)
    REFERENCES `SAI21`.`Contrato` (`idContrato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;










-- Poblando la Base de Datos
INSERT INTO `usuario` VALUES 
	(1, 'mfrisicaro', 'sai21', '1'),
	(2, 'leo', 'cobolisfun', '1'),
    (3, 'x', 'x', '1'),
--    (4, 'x', 'x', '1'),
--    (5, 'x', 'x', '1'),
--    (6, 'x', 'x', '1'),
--    (7, 'x', 'x', '1'),
--    (8, 'x', 'x', '1'),
--    (9, 'x', 'x', '1'),
--    (10,'x', 'x', '1'),
	(11, 'Boloody48', 'aquarius', '0'),
	(12, 'Waing1979', '7625347', '0'),
	(13, 'Aftiond', 'Caifie1u', '0'),
	(14, 'Makepichat1943', 'agh7foa3Ai', '0'),
	(15, 'Sunight1976', 'Aiy1eTeevoh', '0');

INSERT INTO `administrador` VALUES 
	(1, 1,'Mauro','Frisicaro','3512881763','2017-10-05'),
	(2, 2,'Leonardo','Sanchez','3518651840','2017-09-08');

INSERT INTO `garante` VALUES    
	(11, 'Edesio', 'Munguia', 'testmail_1@yopmail.com', '54 351-288 1763', 'observaciones', '29348562', 'D.N.I', '28/12/1999', 'rubro', 'sueldo', 'calle', 'numero', 'piso', 'localidad', 'provincia', 'cuit'),
    (12,  'Arabia', 'Pagan Pichardo', 'testmail_2@yopmail.com', '54 351-312 3522', 'observaciones', '58348561', 'C.I.', '31/21/1937', 'rubro', 'sueldo', 'calle', 'numero', 'piso', 'localidad', 'provincia', 'cuit'),
    (13,  'Amadis', 'Corral', 'testmail_33@yopmail.com', '54 351-542 2356', 'observaciones', '48595716', 'C.I.', '03/09/1965', 'rubro', 'sueldo', 'calle', 'numero', 'piso', 'localidad', 'provincia', 'cuit'),
    (14,  'Ecio', 'Espinal', 'testmail_23@yopmail.com', '54 351-543 3662', '', '02836456', 'L.E', '22/11/1974', 'rubro', 'sueldo', 'calle', 'numero', 'piso', 'localidad', 'provincia', 'cuit'),
    (15,  'Berna', 'Solorio', 'testmail_22@yopmail.com', '54 351-308 2356', 'observaciones', '20457614', 'D.N.I', '13/04/2014', 'rubro', 'sueldo', 'calle', 'numero', 'piso', 'localidad', 'provincia', 'cuit');

INSERT INTO `inquilino` VALUES
	(11, 11, 11, 'Bruno', 'Caraballo Farías', 'testmail_213@yopmail.com', '54 351-037 0374', 'observaciones', '10495763', 'C.I', '19/05/1964', 'Sujeto Exento', 'cuit', 'cuentaBanco', 'cbu', 'Masculino', 2.0, NULL),
    (12, 12, 12, 'Baal Cantú', 'Cadena', 'testmail_213@yopmail.com', '54 351-485 9475', '', '84753003', 'D.N.I', '21/10/1973', 'Monotributista', 'cuit', 'cuentaBanco', 'cbu', 'Masculinoo', 0.0, NULL),
    (13, 13, 13, 'Iziar', 'Barrera', 'testmail_19@yopmail.com', '54 351-365 9357', '', '39476289', 'L.C.', '10/07/1908', 'condIva', 'Responsable Inscripto', 'cuentaBanco', 'cbu', 'Femenino', 0.0, NULL),
    (14, 14, 14, 'Nahuel', 'Torres', 'testmail_78@yopmail.com', '54 351-464 3846', 'observaciones', '23948571', 'D.N.I', '15/03/1863', 'Consumidor Final', 'cuit', 'cuentaBanco', 'cbu', 'Masculino', 0.0, NULL),
    (15, 15, 15, 'Larisa', 'Benavides', 'testmail_983@yopmail.com', '54 351-394 2846', 'observaciones', '10875693', 'L.C.', '18/08/1997', 'Monotributista', 'cuit', 'cuentaBanco', 'cbu', 'Femenino', 0.0, NULL);

select * from usuario;
select * from administrador;
select * from garante;
select * from inquilino;

