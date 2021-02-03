-- Adminer 4.7.7 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `features`;
CREATE TABLE `features` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `seatCat` varchar(20) NOT NULL,
  `seatWidth` double NOT NULL,
  `seatType` varchar(50) NOT NULL,
  `videoType` varchar(50) NOT NULL,
  `powerType` varchar(20) NOT NULL,
  `wifi` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `features` (`id`, `seatCat`, `seatWidth`, `seatType`, `videoType`, `powerType`, `wifi`) VALUES
(4,	'First Class',	24,	'Recliner',	'Personal TV',	'AC',	'No'),
(5,	'Economy',	24,	'Recliner',	'Personal TV',	'AC',	'No');

DROP TABLE IF EXISTS `planes`;
CREATE TABLE `planes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(255) NOT NULL,
  `year` int(11) NOT NULL,
  `capacity` int(11) NOT NULL,
  `feature_id` int(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `feature_id` (`feature_id`),
  CONSTRAINT `planes_ibfk_1` FOREIGN KEY (`feature_id`) REFERENCES `features` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `planes` (`id`, `model`, `year`, `capacity`, `feature_id`) VALUES
(1,	'Boing 737',	2020,	300,	4),
(2,	'Airbus 345',	2015,	467,	5);

-- 2021-02-03 09:52:39