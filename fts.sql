CREATE TABLE IF NOT EXISTS `User`(
 `userid` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
 `name` varchar (100) NOT NULL,
 `email` varchar (100) NOT NULL,
 `password` varchar (50) NOT NULL,
 `userType` varchar (50) NOT NULL
 );
 
  INSERT INTO `User` (`userid`, `name`, `email`, `password`, `userType`) 
  VALUES 
  (1, 'admin', 'admin@example.com', 'admin', 'admin'),
  (2, 'Jennifer Anniston', 'jennifer@example.com', 'jennifer', 'customer');
  
 
  
CREATE TABLE IF NOT EXISTS `Flight` 
(
`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`flightNo` varchar (20) NOT NULL,
`departure` varchar (20) NOT NULL,
`destination` varchar (20) NOT NULL,
`departureDate` date,
`departureTime` time,
`arrivalTime` time,
`economicPrice` double NOT NULL,
`businessPrice` double NOT NULL,
`firstclassPrice` double NOT NULL
);

INSERT INTO `Flight` (`id`, `flightNo`, `departure`, `destination`, `departureDate`, `departureTime`,
`arrivalTime`, `economicPrice`, `businessPrice`, `firstclassPrice`) 
VALUES
(1, 'AK64611', 'JOHOR BAHRU', 'PENANG', '2021-02-04', '08:00' ,'09:10', 80, 90,
100),
(2, 'AK64612', 'JOHOR BAHRU', 'PENANG', '2021-02-04', '10:00' , '11:10', 80, 90,
100),
(3,'AK64613', 'JOHOR BAHRU', 'PENANG','2021-02-04', '13:00','14:10', 80, 90,
100),
(4, 'AJ54160', 'PENANG', 'KUALA LUMPUR', '2021-02-04','08:00' ,'08:50', 70, 80,
90),
(5, 'AJ54161', 'PENANG', 'KUALA LUMPUR','2021-02-04', '16:00' , '16:50', 70, 80,
90),
(6, 'AD31080', 'PENANG', 'MALACCA', '2021-02-04', '12:00' ,'13:10', 80, 90,
100),
(7, 'AK64611', 'JOHOR BAHRU', 'PENANG', '2021-02-05', '08:00' , '09:10', 80, 90,
100),
(8, 'AK64612', 'JOHOR BAHRU', 'PENANG','2021-02-05', '10:00', '11:10', 80, 90,
100),
(9, 'AK64613', 'JOHOR BAHRU', 'PENANG', '2021-02-05', '13:00' , '14:10', 80, 90,
100),
(10, 'AJ54160', 'PENANG', 'KUALA LUMPUR', '2021-02-05', '08:00' ,'08:50', 70, 80,
90),
(11, 'AJ54161', 'PENANG', 'KUALA LUMPUR', '2021-02-05', '16:00' , '16:50', 70, 80,
90),
(12, 'AD31080', 'PENANG', 'MALACCA', '2021-02-05', '12:00' , '13:10', 80, 90,
100);



CREATE TABLE IF NOT EXISTS `booking` (
`bookingId` int  NOT NULL AUTO_INCREMENT PRIMARY KEY,
`nameofPas` varchar (20) NOT NULL,
`numofPas` int NOT NULL,
`flightNo` varchar (20) NOT NULL,
`departure` varchar (20) NOT NULL,
`destination` varchar (20) NOT NULL,
`departureDate` date,
`departureTime` time,
`arrivalTime` time,
`seattype` varchar (20) NOT NULL,
`baggage` int NOT NULL,
`price` double NOT NULL
);

INSERT INTO `booking` (`bookingId`, `nameofPas`, `numofPas`,`flightNo`, `departure`, `destination`, 
`departureDate`, `departureTime`, `arrivalTime`, `seattype`, `baggage`, `price`) 
VALUES
(1,'Jennifer Anniston', 1, 'AK64611', 'JOHOR BAHRU', 'PENANG', '2021-02-04', '08:00', '09:10', 'Economy', 10, 80),
(2,'Jennifer Anniston', 1, 'AK64612', 'JOHOR BAHRU', 'PENANG', '2020-02-01', '10:00', '11:10', 'Economy', 7, 80),
(3,'Jennifer Anniston', 1, 'GD21312', 'BALI', 'KUALA LUMPUR', '2019-12-23', '07:00', '09:30', 'Economy', 20, 120);




