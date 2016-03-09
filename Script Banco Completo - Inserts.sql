drop schema mydb; 

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW DATABASES; 

 USE MYDB;
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL COMMENT '',
  `nome` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`idCliente`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Conta` (
  `idConta` INT NOT NULL COMMENT '',
  `agencia` INT NULL COMMENT '',
  `senha` INT NULL COMMENT '',
  `codigo_Acesso` INT NULL COMMENT '',
  `saldo` DOUBLE NULL COMMENT '',
  `Cliente_idCliente` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idConta`, `Cliente_idCliente`)  COMMENT '',
  INDEX `fk_Conta_Cliente_idx` (`Cliente_idCliente` ASC)  COMMENT '',
  CONSTRAINT `fk_Conta_Cliente`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DebitoAutomatico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`DebitoAutomatico` (
  `idDebitoAutomatico` INT NOT NULL COMMENT '',
  `tipoDebito` INT NULL COMMENT '',
  `operadora` VARCHAR(45) NULL COMMENT '',
  `codigoConsumidor` INT NULL COMMENT '',
  `dataDebito` DATE NULL COMMENT '',
  `valorDebito` DOUBLE NULL COMMENT '',
  PRIMARY KEY (`idDebitoAutomatico`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Movimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Movimento` (
  `idMovimento` INT NOT NULL COMMENT '',
  `dataOperacao` DATE NULL COMMENT '',
  `valorOperacao` DOUBLE NULL COMMENT '',
  `agenciaDestino` INT NULL COMMENT '',
  `contaDestino` INT NULL COMMENT '',
  `Conta_idConta` INT NOT NULL COMMENT '',
  `Conta_Cliente_idCliente` INT NOT NULL COMMENT '',
  `DebitoAutomatico_idDebitoAutomatico` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idMovimento`, `Conta_idConta`, `Conta_Cliente_idCliente`)  COMMENT '',
  INDEX `fk_Movimento_Conta1_idx` (`Conta_idConta` ASC, `Conta_Cliente_idCliente` ASC)  COMMENT '',
  INDEX `fk_Movimento_DebitoAutomatico1_idx` (`DebitoAutomatico_idDebitoAutomatico` ASC)  COMMENT '',
  CONSTRAINT `fk_Movimento_Conta1`
    FOREIGN KEY (`Conta_idConta` , `Conta_Cliente_idCliente`)
    REFERENCES `mydb`.`Conta` (`idConta` , `Cliente_idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Movimento_DebitoAutomatico1`
    FOREIGN KEY (`DebitoAutomatico_idDebitoAutomatico`)
    REFERENCES `mydb`.`DebitoAutomatico` (`idDebitoAutomatico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LOG`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`LOG` (
  `idLOG` INT NOT NULL COMMENT '',
  `tipoOperacao` INT NULL COMMENT '',
  `agencia` INT NULL COMMENT '',
  `valor` DOUBLE NULL COMMENT '',
  `Movimento_idMovimento` INT NOT NULL COMMENT '',
  `Movimento_Conta_idConta` INT NOT NULL COMMENT '',
  `Movimento_Conta_Cliente_idCliente` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idLOG`, `Movimento_idMovimento`, `Movimento_Conta_idConta`, `Movimento_Conta_Cliente_idCliente`)  COMMENT '',
  INDEX `fk_LOG_Movimento1_idx` (`Movimento_idMovimento` ASC, `Movimento_Conta_idConta` ASC, `Movimento_Conta_Cliente_idCliente` ASC)  COMMENT '',
  CONSTRAINT `fk_LOG_Movimento1`
    FOREIGN KEY (`Movimento_idMovimento` , `Movimento_Conta_idConta` , `Movimento_Conta_Cliente_idCliente`)
    REFERENCES `mydb`.`Movimento` (`idMovimento` , `Conta_idConta` , `Conta_Cliente_idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


select * from cliente;

INSERT INTO cliente VALUES (123, 'Bruno Zacarias');
INSERT INTO cliente VALUES (456, 'Evandro Souza');
INSERT INTO cliente VALUES (678, 'Frankyn Dias');

select * from conta;
INSERT INTO conta VALUES 

 (123, 123, 123, 123, 55000, 123), 

 (456, 456, 456, 456, 9700, 456), 

 (678, 678, 678, 678, 100000, 678);




SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
