CREATE DATABASE  IF NOT EXISTS `student_tracker`;
USE `student_tracker`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name`varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `caps` int DEFAULT NULL,
  `goals` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `player`
--

INSERT INTO `player` VALUES 
	(1,'Lionel Messi','Argentina',191,112),
	(2,'Pele','Brazil',92,77),
	(3,'Diego Maradona','Argentina',91,34),
	(4,'Cristiano Ronaldo','Portugal',219,136),
	(5,'Johan Cruyff','Netherlands',48,33),
	(6,'Ronaldo','Brazil',98,62),
	(7,'Zinedine Zidane','France',108,31),
	(8,'Franz Beckenbauer','Germany',103,14),
	(9,'Alfredo Di Stéfano','Spain',41,29),
	(10,'Marco van Basten','Netherlands',58,24),
	(11,'George Best','Northern Ireland',37,9),
	(12,'Gerd Müller','Germany',62,68),
	(13,'Ferenc Puskás','Hungary',85,84),
	(14,'Michel Platini','France',72,41),
	(15,'Andrés Iniesta','Spain',131,13),
	(16,'Eusébio','Portugal',64,41),
	(17,'Garrincha','Brazil',50,12),
	(18,'Lothar Matthäus','Germany',150,23),
	(19,'Zico','Brazil',71,48),
	(20,'Paolo Maldini','Italy',126,7),
	(21,'Bobby Charlton','England',106,49),
	(22,'Ronaldinho','Brazil',97,33),
	(23,'Xavi Hernández','Spain',133,13),
	(24,'Manuel Neuer','Germany',124,0),
	(25,'Franco Baresi','Italy',81,1),
	(26,'Lev Yashin','Soviet Union',74,0),
	(27,'Thierry Henry','France',123,51),
	(28,'Roberto Baggio','Italy',56,27),
	(29,'Luka Modric','Croatia',186,27),
	(30,'Ruud Gullit','Netherlands',66,17),
	(31,'Giuseppe Meazza','Italy',53,33),
	(32,'Sócrates','Brazil',60,22),
	(33,'Sergio Busquets','Spain',143,2),
	(34,'Raymond Kopa','France',45,18),
	(35,'Bobby Moore','England',108,2),
	(36,'Stanley Matthews','England',54,11),
	(37,'Valentino Mazzola','Italy',12,4),
	(38,'Mattias Sindelar','Austria',43,26),
	(39,'Romario','Brazil',70,55),
	(40,'Luis Suárez','Spain',32,14),
	(41,'Paco Gento','Spain',43,5),
	(42,'Carlos Alberto','Brazil',53,8),
	(43,'Michael Laudrup','Denmark',104,37),
	(44,'Kenny Dalglish','Scotland',102,30),
	(45,'Robert Lewandowski','Poland',158,85),
	(46,'Paolo Rossi','Italy',48,20),
	(47,'Gunter Netzer','Germany',37,6),
	(48,'Gianluigi Buffon','Italy',176,0),
	(49,'Didi','Brazil',68,20),
	(50,'Wayne Rooney','England',120,53),
	(51,'Rivaldo','Brazil',74,35),
	(52,'Kevin Keegan','England',63,21),
	(53,'Jairzinho','Brazil',81,33),
	(54,'Gaetano Scirea','Italy',78,2),
	(55,'Dino Zoff','Italy',112,0),
	(56,'Juan Alberto Schiaffino','Uruguay',25,9),
	(57,'Fritz Walter','Germany',61,33),
	(58,'Daniel Passarella','Argentina',70,22),
	(59,'Gianni Rivera','Italy',60,14),
	(60,'Karl-Heinz Rummenigge','Germany',95,45),
	(61,'Neymar','Brazil',128,79),
	(62,'Ronald Koeman','Netherlands',78,14),
	(63,'Gunnar Nordahl','Sweden',33,43),
	(64,'Johan Neeskens','Netherlands',49,17),
	(65,'Denis Law','Scotland',55,30),
	(66,'Gordon Banks','England',73,0),
	(67,'José Manuel Moreno','Argentina',34,19),
	(68,'John Charles','Wales',38,15),
	(69,'José Leandro Andrade','Uruguay',34,1),
	(70,'Cafu','Brazil',142,5),
	(71,'Frank Rijkaard','Netherlands',73,10),
	(72,'Flórián Albert','Hungary',75,31),
	(73,'Rivellino','Brazil',92,26),
	(74,'Just Fontaine','France',21,30),
	(75,'Josef Masopust','Czechoslovakia',63,10),
	(76,'Alan Shearer','England',63,30),
	(77,'Jimmy Greaves','England',57,44),
	(78,'Hugo Sánchez','Mexico',58,29),
	(79,'Hristo Stoichkov','Bulgaria',83,37),
	(80,'Kaká','Brazil',92,29),
	(81,'Mohamed Salah','Egypt',105,60),
	(82,'Zlatan Ibrahimovic','Sweden',122,62),
	(83,'Sandro Mazzola','Italy',70,22),
	(84,'George Weah','Liberia',75,18),
	(85,'Luís Figo','Portugal',127,32),
	(86,'Allan Simonsen','Denmark',55,20),
	(87,'Dennis Bergkamp','Netherlands',79,37),
	(88,'Kevin De Bruyne','Belgium',109,30),
	(89,'Roberto Carlos','Brazil',125,10),
	(90,'Eric Cantona','France',45,20),
	(91,'Giacinto Facchetti','Italy',94,3),
	(92,'Sándor Kocsis','Hungary',68,75),
	(93,'Kylian Mbappé','France',88,48),
	(94,'Philipp Lahm','Germany',113,5),
	(95,'Djalma Santos','Brazil',98,3),
	(96,'Javier Zanetti','Argentina',145,5),
	(97,'Jimmy Johnstone','Scotland',23,4),
	(98,'Teófilo Cubillas','Peru',81,28),
	(99,'Mario Kempes','Argentina',43,20),
	(100,'Gheorghe Hagi','Romania',124,35);