-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 22, 2019 at 01:46 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `4-1`
--

-- --------------------------------------------------------

--
-- Table structure for table `superheroes`
--

CREATE TABLE `superheroes` (
  `id` int(11) NOT NULL,
  `name` varchar(191) COLLATE utf8_bin NOT NULL,
  `power` varchar(191) COLLATE utf8_bin NOT NULL,
  `gender` varchar(191) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `superheroes`
--

INSERT INTO `superheroes` (`id`, `name`, `power`, `gender`) VALUES
(1, 'superman', '100', 'm'),
(2, 'Spider Man', '85', 'M'),
(3, 'Wonder Woman', '90', 'F'),
(4, 'Thor', '95', 'm'),
(5, 'Black Panther', '80', 'm'),
(6, 'Batman', '92', 'M'),
(7, 'Cat', '75', 'm'),
(8, 'Iron man', '97', 'm'),
(9, 'Hulk', '85', 'm'),
(10, 'Aquaman', '75', 'm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `superheroes`
--
ALTER TABLE `superheroes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `superheroes`
--
ALTER TABLE `superheroes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
