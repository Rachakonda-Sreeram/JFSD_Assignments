-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ecommerce
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ecommerce
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ecommerce` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `ecommerce` ;

-- -----------------------------------------------------
-- Table `ecommerce`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`address` (
  `Address_ID` INT NOT NULL,
  `HouseNo` VARCHAR(50) NULL DEFAULT NULL,
  `AddressLine_1` VARCHAR(255) NULL DEFAULT NULL,
  `AddressLine_2` VARCHAR(255) NULL DEFAULT NULL,
  `PostalCode` VARCHAR(20) NULL DEFAULT NULL,
  `City` VARCHAR(255) NULL DEFAULT NULL,
  `State` VARCHAR(255) NULL DEFAULT NULL,
  `Country` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`Address_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`users` (
  `User_ID` INT NOT NULL,
  `Username` VARCHAR(255) NULL DEFAULT NULL,
  `Email` VARCHAR(255) NULL DEFAULT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  `UserType` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`User_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`customers` (
  `Customer_ID` INT NOT NULL,
  `FullName` VARCHAR(255) NULL DEFAULT NULL,
  `Gender` VARCHAR(10) NULL DEFAULT NULL,
  `ContactNumber` VARCHAR(20) NULL DEFAULT NULL,
  `Address_ID` INT NULL DEFAULT NULL,
  `User_ID` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`),
  INDEX `Address_ID` (`Address_ID` ASC) VISIBLE,
  INDEX `User_ID` (`User_ID` ASC) VISIBLE,
  CONSTRAINT `customers_ibfk_1`
    FOREIGN KEY (`Address_ID`)
    REFERENCES `ecommerce`.`address` (`Address_ID`),
  CONSTRAINT `customers_ibfk_2`
    FOREIGN KEY (`User_ID`)
    REFERENCES `ecommerce`.`users` (`User_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`sellers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`sellers` (
  `Seller_ID` INT NOT NULL,
  `BusinessName` VARCHAR(255) NULL DEFAULT NULL,
  `Phone` VARCHAR(20) NULL DEFAULT NULL,
  `Address_ID` INT NULL DEFAULT NULL,
  `User_ID` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Seller_ID`),
  INDEX `Address_ID` (`Address_ID` ASC) VISIBLE,
  INDEX `User_ID` (`User_ID` ASC) VISIBLE,
  CONSTRAINT `sellers_ibfk_1`
    FOREIGN KEY (`Address_ID`)
    REFERENCES `ecommerce`.`address` (`Address_ID`),
  CONSTRAINT `sellers_ibfk_2`
    FOREIGN KEY (`User_ID`)
    REFERENCES `ecommerce`.`users` (`User_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`categories` (
  `Category_ID` INT NOT NULL,
  `CategoryName` VARCHAR(255) NULL DEFAULT NULL,
  `SubCategory_ID` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Category_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`subcategories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`subcategories` (
  `SubCategoryName` VARCHAR(255) NULL DEFAULT NULL,
  `SubCategory_ID` INT NULL DEFAULT NULL,
  INDEX `SubCategory_ID` (`SubCategory_ID` ASC) VISIBLE,
  CONSTRAINT `subcategories_ibfk_1`
    FOREIGN KEY (`SubCategory_ID`)
    REFERENCES `ecommerce`.`categories` (`Category_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`products` (
  `Product_ID` INT NOT NULL,
  `Seller_ID` INT NULL DEFAULT NULL,
  `ProductName` VARCHAR(255) NULL DEFAULT NULL,
  `ProductImageURL` VARCHAR(255) NULL DEFAULT NULL,
  `Description` TEXT NULL DEFAULT NULL,
  `Price` DECIMAL(10,2) NULL DEFAULT NULL,
  `StockQuantity` INT NULL DEFAULT NULL,
  `Brand` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `modified_at` DATETIME NULL DEFAULT NULL,
  `Category_ID` INT NULL DEFAULT NULL,
  `SubCategory_ID` INT NULL DEFAULT NULL,
  `Rating` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Product_ID`),
  INDEX `Seller_ID` (`Seller_ID` ASC) VISIBLE,
  INDEX `Category_ID` (`Category_ID` ASC) VISIBLE,
  INDEX `SubCategory_ID` (`SubCategory_ID` ASC) VISIBLE,
  CONSTRAINT `products_ibfk_1`
    FOREIGN KEY (`Seller_ID`)
    REFERENCES `ecommerce`.`sellers` (`Seller_ID`),
  CONSTRAINT `products_ibfk_2`
    FOREIGN KEY (`Category_ID`)
    REFERENCES `ecommerce`.`categories` (`Category_ID`),
  CONSTRAINT `products_ibfk_3`
    FOREIGN KEY (`SubCategory_ID`)
    REFERENCES `ecommerce`.`subcategories` (`SubCategory_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`cart` (
  `Cart_ID` INT NOT NULL,
  `Customer_ID` INT NULL DEFAULT NULL,
  `Product_ID` INT NOT NULL DEFAULT NULL,
  `Quantity` INT NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `modified_at` DATETIME NULL DEFAULT NULL,
  `ordered` TINYINT(1) NULL DEFAULT '0',
  PRIMARY KEY (`Cart_ID`),
  INDEX `Customer_ID` (`Customer_ID` ASC) VISIBLE,
  INDEX `Product_ID` (`Product_ID` ASC) VISIBLE,
  CONSTRAINT `cart_ibfk_1`
    FOREIGN KEY (`Customer_ID`)
    REFERENCES `ecommerce`.`customers` (`Customer_ID`),
  CONSTRAINT `cart_ibfk_2`
    FOREIGN KEY (`Product_ID`)
    REFERENCES `ecommerce`.`products` (`Product_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`orders` (
  `Order_ID` INT NOT NULL,
  `Customer_ID` INT NULL DEFAULT NULL,
  `OrderDate` DATE NULL DEFAULT NULL,
  `TotalAmount` DECIMAL(10,2) NULL DEFAULT NULL,
  `Status` VARCHAR(50) NULL DEFAULT NULL,
  `Address_ID` INT NULL DEFAULT NULL,
  `status_description` VARCHAR(255) NULL DEFAULT NULL,
  `cart_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Order_ID`),
  INDEX `Customer_ID` (`Customer_ID` ASC) VISIBLE,
  INDEX `Address_ID` (`Address_ID` ASC) VISIBLE,
  INDEX `cart_id` (`cart_id` ASC) VISIBLE,
  CONSTRAINT `orders_ibfk_1`
    FOREIGN KEY (`Customer_ID`)
    REFERENCES `ecommerce`.`customers` (`Customer_ID`),
  CONSTRAINT `orders_ibfk_2`
    FOREIGN KEY (`Address_ID`)
    REFERENCES `ecommerce`.`address` (`Address_ID`),
  CONSTRAINT `orders_ibfk_3`
    FOREIGN KEY (`cart_id`)
    REFERENCES `ecommerce`.`cart` (`Cart_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`payments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`payments` (
  `Payment_ID` INT NOT NULL,
  `Order_ID` INT NULL DEFAULT NULL,
  `PaymentDate` DATETIME NULL DEFAULT NULL,
  `Amount` DECIMAL(10,2) NULL DEFAULT NULL,
  `PaymentMethod` VARCHAR(255) NULL DEFAULT NULL,
  `payment_status` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`Payment_ID`),
  INDEX `Order_ID` (`Order_ID` ASC) VISIBLE,
  CONSTRAINT `payments_ibfk_1`
    FOREIGN KEY (`Order_ID`)
    REFERENCES `ecommerce`.`orders` (`Order_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`orderdetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`orderdetails` (
  `OrderDetail_ID` INT NOT NULL,
  `Order_ID` INT NULL DEFAULT NULL,
  `Product_ID` INT NULL DEFAULT NULL,
  `Payment_ID` INT NULL DEFAULT NULL,
  `Quantity` INT NULL DEFAULT NULL,
  `Subtotal` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`OrderDetail_ID`),
  INDEX `Order_ID` (`Order_ID` ASC) VISIBLE,
  INDEX `Product_ID` (`Product_ID` ASC) VISIBLE,
  INDEX `Payment_ID` (`Payment_ID` ASC) VISIBLE,
  CONSTRAINT `orderdetails_ibfk_1`
    FOREIGN KEY (`Order_ID`)
    REFERENCES `ecommerce`.`orders` (`Order_ID`),
  CONSTRAINT `orderdetails_ibfk_2`
    FOREIGN KEY (`Product_ID`)
    REFERENCES `ecommerce`.`products` (`Product_ID`),
  CONSTRAINT `orderdetails_ibfk_3`
    FOREIGN KEY (`Payment_ID`)
    REFERENCES `ecommerce`.`payments` (`Payment_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ecommerce`.`shippingdetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`shippingdetails` (
  `ShippingDetail_ID` INT NOT NULL,
  `Order_ID` INT NULL DEFAULT NULL,
  `Address_ID` INT NULL DEFAULT NULL,
  `DeliveryDate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`ShippingDetail_ID`),
  INDEX `Order_ID` (`Order_ID` ASC) VISIBLE,
  INDEX `Address_ID` (`Address_ID` ASC) VISIBLE,
  CONSTRAINT `shippingdetails_ibfk_1`
    FOREIGN KEY (`Order_ID`)
    REFERENCES `ecommerce`.`orders` (`Order_ID`),
  CONSTRAINT `shippingdetails_ibfk_2`
    FOREIGN KEY (`Address_ID`)
    REFERENCES `ecommerce`.`address` (`Address_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
