
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema lib_america
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lib_america
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS lib_america DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE lib_america;

-- -----------------------------------------------------
-- Table `lib_america`.`libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS libro (
  isbn VARCHAR(20) NOT NULL COMMENT '',
  titulo VARCHAR(50) NULL COMMENT '',
  autores VARCHAR(50) NULL COMMENT '',
  editorial VARCHAR(30) NULL COMMENT '',
  lugar_impresion VARCHAR(20) NULL COMMENT '',
  num_pag INT NULL COMMENT '',
  idioma VARCHAR(45) NULL COMMENT '',
  precio INT NULL COMMENT '',
  ejemplares_disponibles INT NULL COMMENT '',
  PRIMARY KEY (isbn)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lib_america`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS usuarios (
  id_usuario INT NOT NULL AUTO_INCREMENT COMMENT '',
  nombre VARCHAR(45) NULL COMMENT '',
  cargo VARCHAR(45) NULL COMMENT '',
  contrasena VARCHAR(45) NULL COMMENT '',
  tipo_usuario VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (id_usuario)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lib_america`.`operacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS operacion (
  id_operacion INT NOT NULL AUTO_INCREMENT COMMENT '',
  tipo_op VARCHAR(10) NULL COMMENT '',
  fecha_recibido DATE NULL COMMENT '',
  libro_isbn VARCHAR(20) NOT NULL COMMENT '',
  usuarios_id_usuario INT NOT NULL COMMENT '',
  PRIMARY KEY (id_operacion)  COMMENT '',
  INDEX fk_operacion_libro_idx (libro_isbn ASC)  COMMENT '',
  INDEX fk_operacion_usuarios1_idx (usuarios_id_usuario ASC)  COMMENT '',
  CONSTRAINT fk_operacion_libro
    FOREIGN KEY (libro_isbn)
    REFERENCES lib_america.libro (isbn)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_operacion_usuarios1
    FOREIGN KEY (usuarios_id_usuario)
    REFERENCES lib_america.usuarios (id_usuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

