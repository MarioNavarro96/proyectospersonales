-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-02-2023 a las 17:38:21
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `blog`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seccionesblog`
--

CREATE TABLE `seccionesblog` (
  `Identificador` int(255) NOT NULL,
  `tituloblog` text NOT NULL,
  `texto` varchar(255) NOT NULL,
  `boton1` text NOT NULL,
  `seccion1` text NOT NULL,
  `seccion2` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seccionesblog`
--

INSERT INTO `seccionesblog` (`Identificador`, `tituloblog`, `texto`, `boton1`, `seccion1`, `seccion2`) VALUES
(1, 'Blog del examen', 'Texto del blog del examen', 'Hola', '', ''),
(2, '', '', '', 'Primera sección examen', 'Segunda Sección Examen');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seccionesblog`
--
ALTER TABLE `seccionesblog`
  ADD PRIMARY KEY (`Identificador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seccionesblog`
--
ALTER TABLE `seccionesblog`
  MODIFY `Identificador` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
