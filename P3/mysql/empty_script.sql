-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema p3_distribuidos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema p3_distribuidos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `p3_distribuidos` DEFAULT CHARACTER SET utf8 ;
USE `p3_distribuidos` ;

-- -----------------------------------------------------
-- Table `p3_distribuidos`.`tipos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `p3_distribuidos`.`tipos` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `p3_distribuidos`.`carta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `p3_distribuidos`.`carta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valor` VARCHAR(45) NOT NULL,
  `imagen` VARCHAR(1000) NOT NULL,
  `tipos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_carta_tipos_idx` (`tipos_id` ASC),
  CONSTRAINT `fk_carta_tipos`
    FOREIGN KEY (`tipos_id`)
    REFERENCES `p3_distribuidos`.`tipos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `p3_distribuidos`.`jugador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `p3_distribuidos`.`jugador` (
  `idjugador` VARCHAR(45) NOT NULL,
  `ip` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idjugador`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `p3_distribuidos`.`tirada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `p3_distribuidos`.`tirada` (
  `idtirada` INT NOT NULL,
  `hora` VARCHAR(45) NOT NULL,
  `carta_id` INT NOT NULL,
  `jugador_idjugador` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtirada`),
  INDEX `fk_tirada_carta1_idx` (`carta_id` ASC),
  INDEX `fk_tirada_jugador1_idx` (`jugador_idjugador` ASC),
  CONSTRAINT `fk_tirada_carta1`
    FOREIGN KEY (`carta_id`)
    REFERENCES `p3_distribuidos`.`carta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tirada_jugador1`
    FOREIGN KEY (`jugador_idjugador`)
    REFERENCES `p3_distribuidos`.`jugador` (`idjugador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
