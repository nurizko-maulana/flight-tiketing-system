-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2021 at 02:38 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fts`
--

-- --------------------------------------------------------

--
-- Table structure for table `features`
--

CREATE TABLE `features` (
  `id` int(20) NOT NULL,
  `seatCat` varchar(20) NOT NULL,
  `seatWidth` double NOT NULL,
  `seatType` varchar(50) NOT NULL,
  `videoType` varchar(50) NOT NULL,
  `powerType` varchar(20) NOT NULL,
  `wifi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `features`
--

INSERT INTO `features` (`id`, `seatCat`, `seatWidth`, `seatType`, `videoType`, `powerType`, `wifi`) VALUES
(4, 'First Class', 24, 'Recliner', 'Personal TV', 'AC', 'No'),
(5, 'Economy', 24, 'Recliner', 'Personal TV', 'AC', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `id` int(10) NOT NULL,
  `destination_arrival` varchar(50) NOT NULL,
  `departureTime` time NOT NULL,
  `arrivalTime` time NOT NULL,
  `departureDate` date NOT NULL,
  `arrivalDate` date NOT NULL,
  `seatCat` varchar(20) NOT NULL,
  `price` double NOT NULL,
  `approve` int(10) NOT NULL,
  `totalBook` int(10) NOT NULL,
  `plane_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`id`, `destination_arrival`, `departureTime`, `arrivalTime`, `departureDate`, `arrivalDate`, `seatCat`, `price`, `approve`, `totalBook`, `plane_id`) VALUES
(1, 'Kuala Lumpur - Johor', '06:00:00', '08:00:00', '2021-02-18', '2021-02-18', 'Business', 68, 0, 2, 4),
(3, 'Sydney - Kuala Lumpur', '21:31:04', '07:34:00', '2021-02-26', '2021-01-27', 'Economy', 1245.99, 1, 2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(25) NOT NULL,
  `userType` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `email`, `password`, `userType`) VALUES
(1, 'customer', 'customer@gmail.com', 'customer', 1),
(2, 'admin', 'admin@gmail.com', 'admin', 2),
(3, 'manager', 'manager@gmail.com', 'manager', 3),
(5, 'Shiva', 'shiva@gmail.com', 'shiva123', 1);



CREATE TABLE `booking` (
  `id` int(10) NOT NULL,
  `numofpas` int(20) NOT NULL,
  `baggage` int(20) NOT NULL,
  `seatCat` varchar(25) NOT NULL,
  `booking` date,
  `schedule id` int NOT NULL,
  `users id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--
INSERT INTO `booking` (`id`, `numofPas`, `baggage`,`seatCat`, `booking`, `schedule id`, `users id`) VALUES
(1, 1, 7, 'Business','2019-12-31', 1, 1),
(2, 1, 10, 'Economy','2020-01-05', 3, 1);



--
-- Indexes for dumped tables
--

--
-- Indexes for table `features`
--
ALTER TABLE `features`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`,`email`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`),
  ADD FOREIGN KEY (`schedule id`) REFERENCES schedule(`id`),
  ADD FOREIGN KEY (`users id`) REFERENCES users (`id`);  

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `features`
--
ALTER TABLE `features`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
--AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
