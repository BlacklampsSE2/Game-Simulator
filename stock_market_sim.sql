-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2018 at 09:47 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

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
  `Acc_Bal` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 'HNB', 'Finance', '12'),
(3, 'IBM', 'IT', '14'),
(4, 'Google', 'Technology', '50'),
(5, 'Amazon', 'Ecommerce', '25'),
(6, 'Toyota', 'Automobile', '20'),
(7, 'ebay', 'Home', '10'),
(8, 'Nissan', 'Cars', '30'),
(9, 'Twitter', 'Social', '25'),
(10, 'Mitsubishi', 'Automobile', '30'),
(11, 'Facebook', 'Social', '15');

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
(2, 'Ruvi', 2, '2018-05-29 09:51:17');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
