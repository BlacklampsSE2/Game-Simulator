-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2018 at 12:42 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_market_sim`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Accbal` float(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`id`, `Name`, `Accbal`) VALUES
(2, 'mad', 978);

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `Comapany_Id` int(11) NOT NULL,
  `Company_Name` varchar(30) NOT NULL,
  `Sector_Name` varchar(30) NOT NULL,
  `Stock_Starting_Price` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`Comapany_Id`, `Company_Name`, `Sector_Name`, `Stock_Starting_Price`) VALUES
(1, 'HNB', 'AA', '12'),
(3, 'IBM', 'bb', '14'),
(4, 'Google', 'aa', '50'),
(5, 'Amazon', 'cc', '25'),
(6, 'Toyota', 'dd', '20'),
(7, 'ebay', 'cc', '10'),
(8, 'Nissan', 'dd', '30'),
(9, 'Twitter', 'ee', '25'),
(10, 'Mitsubishi', 'dd', '30'),
(11, 'Facebook', 'ee', '15');

-- --------------------------------------------------------

--
-- Table structure for table `comp_stock_details`
--

CREATE TABLE `comp_stock_details` (
  `Company_ID` int(30) NOT NULL,
  `Game_ID` int(10) NOT NULL,
  `Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Final_Price_stock` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE `game` (
  `Game_ID` int(10) NOT NULL,
  `Player_Name` varchar(30) NOT NULL,
  `Player_Rank` int(30) NOT NULL,
  `Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `game`
--

INSERT INTO `game` (`Game_ID`, `Player_Name`, `Player_Rank`, `Timestamp`) VALUES
(1, 'Snookie', 1, '2018-05-29 09:51:17'),
(2, 'Ruvi', 2, '2018-05-29 09:51:17'),
(3, 'Mashi', 3, '2018-05-29 09:52:51');

-- --------------------------------------------------------

--
-- Table structure for table `game_history`
--

CREATE TABLE `game_history` (
  `Player_ID` int(11) NOT NULL,
  `Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Game_Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `game_history`
--

INSERT INTO `game_history` (`Player_ID`, `Timestamp`, `Game_Status`) VALUES
(1, '2018-06-17 04:51:03', 'WIN');

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `Player_ID` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`Player_ID`, `username`, `password`) VALUES
(1, 'pawan', '5456'),
(33, 'mad', '4321'),
(34, 'mad1', '7894');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `id` int(11) NOT NULL,
  `Player` varchar(20) NOT NULL,
  `Buy` int(11) NOT NULL,
  `Company` varchar(70) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`id`, `Player`, `Buy`, `Company`, `Qty`, `Price`) VALUES
(52, 'Snookie', 1, 'HNB', 23, 12.84),
(53, 'Snookie', 0, 'HNB', 10, 12.6),
(54, 'Snookie', 1, 'HNB', 10, 12.84),
(55, 'Snookie', 0, 'HNB', 23, 13.48),
(56, 'Snookie', 1, 'HNB', 10, 12.72),
(57, 'Snookie', 0, 'HNB', 10, 11.76),
(58, 'Snookie', 1, 'HNB', 10, 11.52),
(59, 'Snookie', 0, 'HNB', 5, 11.17),
(60, 'Snookie', 1, 'HNB', 10, 12.24),
(61, 'Snookie', 0, 'HNB', 10, 12.36),
(62, 'Snookie', 1, 'Google', 20, 51.51),
(63, 'Snookie', 1, 'Amazon', 10, 18.48),
(64, 'Snookie', 0, 'Amazon', 10, 17.19),
(65, 'Snookie', 1, 'Amazon', 20, 17.19),
(66, 'Snookie', 0, 'Amazon', 10, 17.19),
(67, 'Snookie', 0, 'Amazon', 10, 15.99),
(68, 'Snookie', 1, 'HNB', 10, 12.36),
(69, 'Snookie', 1, 'HNB', 10, 12.12),
(70, 'Snookie', 1, 'HNB', 10, 12),
(71, 'Snookie', 1, 'HNB', 10, 11.28),
(72, 'Snookie', 1, 'HNB', 10, 11.16),
(73, 'Snookie', 1, 'HNB', 10, 11.64),
(74, 'Snookie', 1, 'HNB', 10, 12.24),
(75, 'Snookie', 1, 'HNB', 10, 12.72),
(76, 'Snookie', 1, 'HNB', 10, 12.36),
(77, 'Snookie', 1, 'HNB', 10, 12.84),
(78, 'Snookie', 1, 'HNB', 10, 12.24),
(79, 'Snookie', 1, 'HNB', 100, 13.1),
(80, 'Snookie', 1, 'HNB', 1000, 12.12),
(81, 'Snookie', 1, 'HNB', 1000, 11.16),
(82, 'Snookie', 1, 'HNB', 5, 10.38),
(83, 'Snookie', 1, 'HNB', 5, 12),
(84, 'Snookie', 0, 'HNB', 1000, 11.64),
(85, 'Snookie', 0, 'HNB', 5, 11.75),
(86, 'Snookie', 0, 'HNB', 100, 11.52),
(87, 'Snookie', 1, 'HNB', 1, 11.29),
(88, 'Snookie', 0, 'HNB', 5, 11.29),
(89, 'Snookie', 0, 'Google', 2, 52),
(90, 'Snookie', 0, 'HNB', 2, 11.76),
(91, 'Snookie', 0, 'HNB', 1, 13.08),
(92, 'Snookie', 0, 'HNB', 2, 12),
(93, 'Snookie', 1, 'HNB', 2, 12),
(94, 'Snookie', 0, 'HNB', 1, 12),
(95, 'Snookie', 0, 'Google', 2, 50),
(96, 'Snookie', 0, 'HNB', 2, 10.8),
(97, 'Snookie', 0, 'HNB', 2, 10.8),
(98, 'Snookie', 0, 'HNB', 1, 9.54),
(99, 'Snookie', 0, 'HNB', 1, 12.24),
(100, 'Snookie', 0, 'HNB', 1, 11.4),
(101, 'Snookie', 0, 'HNB', 1, 12.24),
(102, 'Snookie', 0, 'HNB', 2, 11.88),
(103, 'Snookie', 0, 'HNB', 1, 11.88),
(104, 'Snookie', 0, 'HNB', 1, 12.83),
(105, 'Snookie', 0, 'HNB', 2, 11.88);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`Comapany_Id`);

--
-- Indexes for table `comp_stock_details`
--
ALTER TABLE `comp_stock_details`
  ADD PRIMARY KEY (`Company_ID`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`Game_ID`);

--
-- Indexes for table `game_history`
--
ALTER TABLE `game_history`
  ADD PRIMARY KEY (`Player_ID`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`Player_ID`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank`
--
ALTER TABLE `bank`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `Comapany_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `game`
--
ALTER TABLE `game`
  MODIFY `Game_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `player`
--
ALTER TABLE `player`
  MODIFY `Player_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
