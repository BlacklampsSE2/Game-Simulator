-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2018 at 01:03 PM
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
  `Sector` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`id`, `Name`, `Sector`) VALUES
(1, 'NTB', 'Banking');

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
(2, 'HNB', 'AA', '12');

-- --------------------------------------------------------

--
-- Table structure for table `comp_stock_details`
--

CREATE TABLE `comp_stock_details` (
  `Company_Name` varchar(30) NOT NULL,
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
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `Player_Name` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `player_transactions`
--

CREATE TABLE `player_transactions` (
  `Player_Name` varchar(30) NOT NULL,
  `Game_ID` int(10) NOT NULL,
  `Buy_Sell` int(10) NOT NULL,
  `Company_Name` varchar(30) NOT NULL,
  `Stock_Value` int(255) NOT NULL,
  `Stock_Price` decimal(65,0) NOT NULL
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
  ADD PRIMARY KEY (`Company_Name`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`Game_ID`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`Player_Name`);

--
-- Indexes for table `player_transactions`
--
ALTER TABLE `player_transactions`
  ADD PRIMARY KEY (`Player_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank`
--
ALTER TABLE `bank`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `Comapany_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `game`
--
ALTER TABLE `game`
  MODIFY `Game_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
