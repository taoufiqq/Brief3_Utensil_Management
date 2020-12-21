-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 21 déc. 2020 à 00:30
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
  `anneeFabrication` int(11) NOT NULL,
  PRIMARY KEY (`idAssietteCarree`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `assiette_carree`
--

INSERT INTO `assiette_carree` (`idAssietteCarree`, `cote`, `anneeFabrication`) VALUES
(1, 5, 1942),
(2, 7, 1955),
(3, 10, 1960),
(4, 6, 1965),
(22, 9, 1970);

-- --------------------------------------------------------

--
-- Structure de la table `assiette_ronde`
--

DROP TABLE IF EXISTS `assiette_ronde`;
CREATE TABLE IF NOT EXISTS `assiette_ronde` (
  `idAssietteRonde` int(11) NOT NULL AUTO_INCREMENT,
  `rayon` double NOT NULL,
  `anneeFabrication` int(11) NOT NULL,
  PRIMARY KEY (`idAssietteRonde`)
) ENGINE=MyISAM AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `assiette_ronde`
--

INSERT INTO `assiette_ronde` (`idAssietteRonde`, `rayon`, `anneeFabrication`) VALUES
(22, 3, 1960),
(3, 4, 1930);

-- --------------------------------------------------------

--
-- Structure de la table `cuillere`
--

DROP TABLE IF EXISTS `cuillere`;
CREATE TABLE IF NOT EXISTS `cuillere` (
  `idCuillere` int(11) NOT NULL,
  `longueur` double NOT NULL,
  `anneeFabrication` int(11) NOT NULL,
  PRIMARY KEY (`idCuillere`)
) ENGINE=MyISAM AUTO_INCREMENT=2245 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `cuillere`
--

INSERT INTO `cuillere` (`idCuillere`, `longueur`, `anneeFabrication`) VALUES
(33, 33, 1900),
(2, 8, 1945),
(222, 222, 1950);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
