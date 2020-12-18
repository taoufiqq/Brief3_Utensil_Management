-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 18 déc. 2020 à 13:28
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_ustensiles`
--

-- --------------------------------------------------------

--
-- Structure de la table `assiette_carree`
--

DROP TABLE IF EXISTS `assiette_carree`;
CREATE TABLE IF NOT EXISTS `assiette_carree` (
  `idAssietteCarree` int(11) NOT NULL AUTO_INCREMENT,
  `cote` double NOT NULL,
  PRIMARY KEY (`idAssietteCarree`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `assiette_ronde`
--

DROP TABLE IF EXISTS `assiette_ronde`;
CREATE TABLE IF NOT EXISTS `assiette_ronde` (
  `idAssietteRonde` int(11) NOT NULL AUTO_INCREMENT,
  `rayon` double NOT NULL,
  PRIMARY KEY (`idAssietteRonde`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `cuillere`
--

DROP TABLE IF EXISTS `cuillere`;
CREATE TABLE IF NOT EXISTS `cuillere` (
  `idCuillere` int(11) NOT NULL AUTO_INCREMENT,
  `longueur` double NOT NULL,
  PRIMARY KEY (`idCuillere`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
