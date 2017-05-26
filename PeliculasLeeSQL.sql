CREATE DATABASE  IF NOT EXISTS `peliculaslee` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `peliculaslee`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: peliculaslee
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administradores`
--

DROP TABLE IF EXISTS `administradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administradores` (
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  CONSTRAINT `fk_administradores_usuarios1` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administradores`
--

LOCK TABLES `administradores` WRITE;
/*!40000 ALTER TABLE `administradores` DISABLE KEYS */;
/*!40000 ALTER TABLE `administradores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Musical'),(2,'Aventuras'),(3,'Suspense'),(4,'Romance'),(5,'Fantástico'),(6,'Terror'),(7,'Drama'),(8,'Thriller'),(9,'Superheroes'),(10,'Acción');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoriasporpelicula`
--

DROP TABLE IF EXISTS `categoriasporpelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoriasporpelicula` (
  `idPelicula` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  PRIMARY KEY (`idPelicula`,`idCategoria`),
  KEY `fk_peliculas_has_categorias_categorias1_idx` (`idCategoria`),
  KEY `fk_peliculas_has_categorias_peliculas1_idx` (`idPelicula`),
  CONSTRAINT `fk_peliculas_has_categorias_categorias1` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idCategoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_peliculas_has_categorias_peliculas1` FOREIGN KEY (`idPelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoriasporpelicula`
--

LOCK TABLES `categoriasporpelicula` WRITE;
/*!40000 ALTER TABLE `categoriasporpelicula` DISABLE KEYS */;
INSERT INTO `categoriasporpelicula` VALUES (12,1),(1,2),(6,2),(7,2),(11,2),(14,2),(15,2),(2,3),(3,3),(4,3),(8,3),(12,4),(13,4),(15,4),(1,5),(9,5),(10,5),(13,5),(15,5),(2,6),(4,6),(10,6),(3,7),(5,7),(6,7),(3,8),(7,9),(9,9),(11,9),(8,10),(9,10),(10,10);
/*!40000 ALTER TABLE `categoriasporpelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentarios` (
  `idPelicula` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `comentario` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idPelicula`,`username`),
  KEY `fk_peliculas_has_usuarios_usuarios1_idx` (`username`),
  KEY `fk_peliculas_has_usuarios_peliculas1_idx` (`idPelicula`),
  CONSTRAINT `fk_peliculas_has_usuarios_peliculas1` FOREIGN KEY (`idPelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_peliculas_has_usuarios_usuarios1` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
INSERT INTO `comentarios` VALUES (1,'Administrador','A ver.....funcionara?'),(1,'salchichenn@hotmail.es',NULL);
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peliculas` (
  `idPelicula` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(128) DEFAULT NULL,
  `sinopsis` varchar(2000) DEFAULT NULL,
  `anio` int(4) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `reparto` varchar(2000) DEFAULT NULL,
  `imagen` varchar(128) NOT NULL DEFAULT 'default.jpg',
  PRIMARY KEY (`idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'Pirates of the Caribbean: Dead Men Tell No Tales','El capitán Jack Sparrow se enfrentará a un grupo de piratas-fantasma comandados por una de sus viejas némesis, el terrorífico capitán Salazar, recién escapado del Triángulo de las Bermudas. La única posibilidad de Sparrow para salir con vida es encontrar el legendario Tridente de Poseidón, un poderoso artefacto que le da a su poseedor el control de los mares. ',2017,'Joachim Rønning,  Espen Sandberg','Johnny Depp,  Javier Bardem,  Orlando Bloom,  Geoffrey Rush,  Brenton Thwaites, Kaya Scodelario,  Keira Knightley,  Kevin McNally,  David Wenham,  Stephen Graham, Adam Brown,  Golshifteh Farahani,  Martin Klebba,  Goran D. Kleut,  Jessica Green, Paul McCartney','pirates_of_the_caribbean_5.jpg'),(2,'Get Out','Un joven afroamericano visita a la familia de su novia blanca, un matrimonio adinerado. Para Chris (Daniel Kaluuya) y su novia Rose (Allison Williams) ha llegado el momento de conocer a los futuros suegros, por lo que ella le invita a pasar un fin de semana en el campo con sus padres, Missy (Catherine Keener) y Dean (Bradley Whitford). Al principio, Chris piensa que el comportamiento \"demasiado\" complaciente de los padres se debe a su nerviosismo por la relación interracial de su hija, pero a medida que pasan las horas, una serie de descubrimientos cada vez más inquietantes le llevan a descubrir una verdad inimaginable.',2017,'Jordan Peele','Daniel Kaluuya,  Allison Williams,  Catherine Keener,  Bradley Whitford,  Betty Gabriel, Caleb Landry Jones,  Lyle Brocato,  Ashley LeConte Campbell,  Marcus Henderson, LilRel Howery,  Gary Wayne Loper,  Jeronimo Spinx,  Rutherford Cravens','get_out.jpg'),(3,'Miss Sloane','Elizabeth Sloane (Jessica Chastain) es una implacable y ambiciosa ejecutiva que intenta que fructifique una legislación a favor del control de armas en Washington DC. Para ello intentará usar todos los recursos a su alcance. En las altas esferas del mundo político y empresarial Sloane tiene una reputación formidable. Conocida por su astucia y sus éxitos sin parangón, siempre ha hecho lo que fuera necesario para ganar. Pero cuando se enfrenta al oponente más poderoso de su carrera, se da cuenta de que la victoria puede tener un precio demasiado alto.',2017,'John Madden','Jessica Chastain,  Mark Strong,  Gugu Mbatha-Raw,  Michael Stuhlbarg,  Alison Pill, John Lithgow,  Jake Lacy,  Douglas Smith,  Sam Waterston,  Ennis Esmer, Alexandra Castillo,  Meghann Fahy,  Noah Robbins,  Lucy Owen,  Raoul Bhaneja, Dylan Baker','miss_sloane.jpg'),(4,'Alien: Covenant','Rumbo a un remoto planeta al otro lado de la galaxia para colonizarlo, la tripulación de la nave \'Covenant\' descubre una señal proveniente de lo que creen puede ser un paraíso inexplorado, y que resulta ser un mundo oscuro y hostil... Secuela de \"Prometheus\" (2012).',2017,'Ridley Scott','Michael Fassbender,  Katherine Waterston,  Billy Crudup,  Demián Bichir, Danny McBride,  Carmen Ejogo,  Jussie Smollett,  Amy Seimetz,  Callie Hernandez, Benjamin Rigby,  Alexander England,  Uli Latukefu,  Tess Haubrich,  Guy Pearce, Noomi Rapace,  James Franco','alien_covenant.jpg'),(5,'Paula','Alemania, principios del siglo XX. La joven artista Paula Becker está decidida a seguir sus propias normas. A sus 24 años rechaza las convenciones establecidas y explora su estilo único, mientras florece en la comunidad artística de Worpswede, donde entabla amistad con la artista Clara Westhoff y el poeta Rainer Maria Rilke. Al casarse con el también pintor Otto Modersohn, cree haber encontrado a su alma gemela creativa, pero cinco años destinados a la vida doméstica hunden el espíritu de Paula, así que decide viajar sola al bohemio París, donde se embarca en un largo y esperado periodo donde su imaginación culmina e intenta autorrealizarse. ',2016,'Christian Schwochow','Carla Juri,  Albrecht Schuch,  Roxane Duran,  Joel Basman,  Stanley Weber, Michael Abendroth,  Bella Bading,  Laura Bartels,  Guido Beilmann, Vera Lara Beilmann,  Peter Brachschoss,  Klara Deutschmann,  Enrico Di Giovanni','paula.jpg'),(6,'Ghost in the Shell','En un japón futurista la joven Motoko Kusanagi (Scarlett Johansson), también conocida como \'the Major\' Mira Killian, es la líder de grupo operativo de élite, Sección 9, cuyo objetivo es luchar contra el ciberterrorismo y los crímenes tecnológicos. Al mando de esta unidad de operaciones encubiertas está Aramaki (Takeshi Kitano), y destaca Batou (Pilou Asbæk), un exmilitar considerado como uno de los agentes más salvajes del grupo. Pero, después de un peligrosa misión, el cuerpo de Kusanagi queda dañado, siendo sometida a una operación quirúrgica para trasplantar su cerebro en un cuerpo robótico. Este nuevo cuerpo artificial le permitirá ser capaz de realizar hazañas sobrehumanas especialmente requeridas para su trabajo... Basada en la aclamada saga homónima de ciencia ficción. ',2017,'Rupert Sanders','Scarlett Johansson,  Takeshi Kitano,  Michael Pitt,  Pilou Asbæk,  Juliette Binoche, Peter Ferdinando,  Christopher Obi,  Joseph Naufahu,  Chin Han,  Kaori Momoi, Yutaka Izumihara,  Tawanda Manyimo,  Lasarus Ratuere,  Danusia Samal, Rila Fukushima,  Michael Wincott','ghost_in_the_shell.jpg'),(7,'Guardians of the Galaxy Vol. 2','Continúan las aventuras del equipo en su travesía por los confines del cosmos. Los Guardianes deberán luchar para mantener unida a su nueva familia mientras intentan resolver el misterio de los verdaderos orígenes de Peter Quill. Viejos rivales se convertirán en nuevos aliados, y queridos personajes de los cómics clásicos acudirán en ayuda de nuestros héroes a medida que el universo cinematográfico de Marvel continúa expandiéndose. ',2017,'James Gunn','Chris Pratt,  Zoe Saldana,  Dave Bautista,  Bradley Cooper,  Vin Diesel,  Kurt Russell, Michael Rooker,  Karen Gillan,  Elizabeth Debicki,  Tommy Flanagan,  Sean Gunn, Pom Klementieff,  Chris Sullivan,  Sylvester Stallone','guardians_of_the_galaxy_vol_2.jpg'),(8,'John Wick: Chapter Two','El legendario asesino John Wick (Keanu Reeves) se ve obligado a salir del retiro por un ex-asociado que planea obtener el control de un misterioso grupo internacional de asesinos. Obligado a ayudarlo por un juramento de sangre, John emprende un viaje a Roma lleno de adrenalina estremecedora para pelear contra los asesinos más peligrosos del mundo.',2017,'Chad Stahelski','Keanu Reeves,  Riccardo Scamarcio,  Bridget Moynahan,  Ruby Rose, Peter Stormare,  Ian McShane,  Common,  Alex Ziwak,  Margaret Daly, Heidi Moneymaker,  Laurence Fishburne,  Lance Reddick,  Claudia Gerini, John Leguizamo,  Franco Nero','john_wick_chapter_two.jpg'),(9,'Kimi no na wa','Taki y Mitsuha descubren un día que durante el sueño sus cuerpos se intercambian, y comienzan a comunicarse por medio de notas. A medida que consiguen superar torpemente un reto tras otro, se va creando entre los dos un vínculo que poco a poco se convierte en algo más romántico.',2016,'Makoto Shinkai','Animation','kimi_no_na_wat.jpg'),(10,'Underworld: Guerras de sangre','La vampira Selene (Kate Beckinsale) deberá defenderse de ataques brutales de los dos clanes, el de los Lycans y el de los Vampiros que la traicionaron. Con sus únicos aliados, David (Theo James) y Thomas su padre (Charles Dance), ella debe detener la guerra eterna entre Vampiros y Lycans, aunque signifique tener que hacer un último sacrificio.',2017,'Anna Foerster','Kate Beckinsale,  Theo James,  Charles Dance,  Bradley James,  Lara Pulver, Tobias Menzies,  Alicia Vela-Bailey,  James Faulkner,  Oliver Stark,  Peter Andersson, Daisy Head,  Brian Caspe,  Dan Bradford,  David Bowles,  Clementine Nicholson','underworld_blood_wars.jpg'),(11,'Power Rangers','La película sigue a cinco jóvenes predestinados a convertirse en algo extraordinario cuando descubren que tanto su modesto poblado, Angel Grove, como el resto del mundo, están al borde de la aniquilación por una amenaza alienígena. Nuestros héroes descubren rápidamente que son los únicos que pueden salvar al planeta, pero para lograrlo tendrán que superar problemas de la vida real y unirse bajo el nombre de Power Rangers antes de que sea demasiado tarde.',2017,'Dean Israelite','Dacre Montgomery,  Naomi Scott,  RJ Cyler,  Ludi Lin,  Becky G.,  Elizabeth Banks, Bryan Cranston,  Bill Hader,  Matt Shively,  Cody Kearsley,  David Denman, Robert Moloney,  Anjali Jay,  Sarah Grey,  Morgan Taylor Campbell,  Caroline Cave','power_rangers.jpg'),(12,'La bella y la bestia','Adaptación en imagen real del clásico de Disney \"La bella y la bestia\", que cuenta la historia de Bella (Emma Watson), una joven brillante y enérgica, que sueña con aventuras y un mundo que se extiende más allá de los confines de su pueblo en Francia. Independiente y reservada, Bella no quiere saber nada con el arrogante y engreído Gastón, quien la persigue sin descanso. Todo cambia un día cuando su padre Maurice (Kevin Kline) es encarcelado en el castillo de una horrible Bestia, y Bella se ofrece a intercambiarse con su padre y queda recluida en el castillo. Rápidamente se hace amiga del antiguo personal del lugar, que fue transformado en objetos del hogar tras una maldición lanzada por una hechicera. ',2017,'Bill Condon','Emma Watson,  Dan Stevens,  Luke Evans,  Kevin Kline,  Josh Gad, Emma Thompson,  Ewan McGregor,  Ian McKellen,  Audra McDonald, Gugu Mbatha-Raw,  Stanley Tucci,  Hattie Morahan,  Adrian Schiller, Chris Andrew Mellon','beauty_and_the_beast.jpg'),(13,'Frozen: El reino del hielo','Cuando una profecía condena a un reino a vivir un invierno eterno, la joven Anna, el temerario montañero Kristoff y el reno Sven emprenden un viaje épico en busca de Elsa, hermana de Anna y Reina de las Nieves, para poner fin al gélido hechizo. Adaptación libre del cuento \"La reina de las nieves\".',2013,'Chris Buck,  Jennifer Lee','Animation','frozen.jpg'),(14,'Indiana Jones and the Last Crusade','En esta tercera entrega, el padre del protagonista (Harrison Ford), Henry Jones, también arqueólogo (Sean Connery), es secuestrado cuando buscaba el Santo Grial. Indiana tendrá que ir a rescatarlo y, de paso, intentar hacerse con la preciada reliquia, que también ambicionan los nazi',1989,'Steven Spielberg','Harrison Ford,  Sean Connery,  Alison Doody,  Denholm Elliott,  John Rhys-Davies, River Phoenix,  Julian Glover,  Michael Byrne,  Kevork Malikyan,  Robert Eddison, Alexei Sayle,  Richard Young,  J.J. Hardy,  Bradley Gregg,  Andre Gregory, Michael Sheard,  Isla Blair,  Vernon Dobtcheff,  Pat Roach','indianaJones.jpg'),(15,'Big Fish','William Bloom (Billy Crudup) no tiene muy buena relación con su padre (Albert Finney), pero tras enterarse de que padece una enfermedad terminal, regresa a su hogar para estar a su lado en sus últimos momentos. Una vez más, William se verá obligado a escucharlo mientras cuenta las interminables historias de su juventud. Pero, en esta ocasión, tratará de averiguar cosas que le permitan conocer mejor a su padre, aunque para ello tendrá que separar claramente realidad y fantasía, elementos que aparecen siempre mezclados en los relatos de su progenitor. ',2003,'Tim Burton','Ewan McGregor,  Albert Finney,  Billy Crudup,  Jessica Lange,  Alison Lohman, Helena Bonham Carter,  Steve Buscemi,  Danny DeVito,  Marion Cotillard, Jeff Campbell,  Missi Pyle,  Robert Guillaume,  David Denman,  Loudon Wainwright, Deep Roy,  Miley Cyrus','bigfish.jpg');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('Admin12345678','Admin12345678','dfdsfsdfsdf','sdfsdfsdfdfsdfs','fsdfd@asdas.com',NULL),('Admin123456789','Admin123456789','sdfsdfsdfsd','sdfsdfsdfsd','dfsdf@ad.com',NULL),('Administrador','abcd0123A','Administrador','de Tareas','admin@admin.com',NULL),('paco','1',NULL,NULL,NULL,NULL),('salchichenn@hotmail.es','Snoopy1986','Miguel','Strogoff','dfdsfsdf@dsaasd.com',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valoraciones`
--

DROP TABLE IF EXISTS `valoraciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `valoraciones` (
  `idPelicula` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `valoracion` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPelicula`,`username`),
  KEY `fk_peliculas_has_usuarios1_usuarios1_idx` (`username`),
  KEY `fk_peliculas_has_usuarios1_peliculas1_idx` (`idPelicula`),
  CONSTRAINT `fk_peliculas_has_usuarios1_peliculas1` FOREIGN KEY (`idPelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_peliculas_has_usuarios1_usuarios1` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valoraciones`
--

LOCK TABLES `valoraciones` WRITE;
/*!40000 ALTER TABLE `valoraciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `valoraciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-26  2:18:42
