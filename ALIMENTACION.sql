-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema alimentacion
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema alimentacion
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `alimentacion` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `alimentacion` ;

-- -----------------------------------------------------
-- Table `alimentacion`.`alimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `alimentacion`.`alimento` (
  `idAlimento` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  `grasas` DOUBLE NULL DEFAULT NULL,
  `grasasSaturadas` DOUBLE NULL DEFAULT NULL,
  `hidratos` DOUBLE NULL DEFAULT NULL,
  `azucar` DOUBLE NULL DEFAULT NULL,
  `proteinas` DOUBLE NULL DEFAULT NULL,
  `sal` DOUBLE NULL DEFAULT NULL,
  `calorias` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idAlimento`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
