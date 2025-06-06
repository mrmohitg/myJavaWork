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
	(100,'Gheorghe Hagi','Romania',124,35),
	(101,'Thomas Müller','Germany',131,45),
	(102,'Arjen Robben','Netherlands',96,37),
	(103,'Alessandro Nesta','Italy',78,0),
	(104,'Raúl González','Spain',102,44),
	(105,'Oliver Kahn','Germany',86,0),
	(106,'Michael Owen','England',89,40),
	(107,'Iker Casillas','Spain',0,0),
	(108,'Patrick Vieira','France',107,6),
	(109,'Andrea Pirlo','Italy',107,13),
	(110,'Sergio Ramos','Spain',180,23),
	(111,'Carles Puyol','Spain',100,3),
	(112,'Ruud van Nistelrooy','Netherlands',70,35),
	(113,'Andriy Shevchenko','Ukraine',111,48),
	(114,'Lilian Thuram','France',142,2),
	(115,'Miroslav Klose','Germany',137,71),
	(116,'Samuel Eto','Cameroon',118,56),
	(117,'Frank Lampard','England',106,29),
	(118,'Fabio Cannavaro','Italy',136,2),
	(119,'David Beckham','England',115,17),
	(120,'Eden Hazard','Belgium',126,33),
	(121,'Francesco Totti','Italy',58,9),
	(122,'Ryan Giggs','Wales',64,12),
	(123,'Dani Alves','Brazil',126,8),
	(124,'Wesley Sneijder','Netherlands',134,31),
	(125,'Alessandro Del Piero','Italy',91,27),
	(126,'David Villa','Spain',98,59),
	(127,'Franck Ribéry','France',81,16),
	(128,'Christian Vieri','Italy',49,23),
	(129,'Steven Gerrard','England',114,21),
	(130,'Antoine Griezmann','France',127,44),
	(131,'Toni Kroos','Germany',114,17),
	(132,'Thiago Silva','Brazil',113,7),
	(133,'Pavel Nedved','Czech Republic',91,18),
	(134,'Gareth Bale','Wales',111,41),
	(135,'Sergio Agüero','Argentina',101,41),
	(136,'Harry Kane','England',88,62),
	(137,'Karim Benzema','France',97,37),
	(138,'Edwin van der Sar','Netherlands',130,0),
	(139,'Didier Drogba','Ivory Coast',105,65),
	(140,'Mesut Özil','Germany',92,23),
	(141,'Robin van Persie','Netherlands',102,50),
	(142,'Gianfranco Zola','Italy',35,10),
	(143,'Diego Forlán','Uruguay',112,36),
	(144,'Filippo Inzaghi','Italy',57,25),
	(145,'David Silva','Spain',32,6),
	(146,'Fernando Torres','Spain',110,38),
	(147,'Ángel Di María','Argentina',145,31),
	(148,'Yaya Touré','Ivory Coast',101,19),
	(149,'Kante','France',44,2),
	(150,'Paul Pogba','France',49,8),
	(151,'Gerard Piqué','Spain',13,4),
	(152,'Cesc Fàbregas','Spain',110,15),
	(153,'Michael Ballack','Germany',98,42),
	(154,'Raheem Sterling','England',77,19),
	(155,'John Terry','England',78,6),
	(156,'Bastian Schweinsteiger','Germany',121,24),
	(157,'Thibaut Courtois','Belgium',102,0),
	(158,'Javier Mascherano','Argentina',147,3),
	(159,'Romelu Lukaku','Belgium',114,83),
	(160,'Mats Hummels','Germany',78,5),
	(161,'Giorgio Chiellini','Italy',117,8),
	(162,'Edinson Cavani','Uruguay',136,58),
	(163,'Paul Scholes','England',66,14),
	(164,'Lúcio','Brazil',105,4),
	(165,'David Trezeguet','France',71,34),
	(166,'Robert Pirès','France',79,14),
	(167,'Rui Costa','Portugal',94,26),
	(168,'Gonzalo Higuaín','Argentina',75,31),
	(169,'Rio Ferdinand','England',76,3),
	(170,'Xabi Alonso','Spain',114,16),
	(171,'Virgil van Dijk','Netherlands',54,6),
	(172,'Deco','Portugal',75,19),
	(173,'Carlos Tevez','Argentina',76,13),
	(174,'Hernán Crespo','Argentina',64,35),
	(175,'Juan Román Riquelme','Argentina',51,17),
	(176,'Marco Reus','Germany',48,15),
	(177,'Casemiro','Brazil',75,7),
	(178,'Juan Sebastián Verón','Argentina',72,9),
	(179,'Edin Dzeko','Bosnia and Herzegovina',136,66),
	(180,'Mario Gotze','Germany',63,17),
	(181,'Petr Cech','Czech Republic',124,0),
	(182,'Raphaël Varane','France',93,5),
	(183,'Nemanja Vidic','Serbia',56,2),
	(184,'Robinho','Brazil',100,28),
	(185,'Diego Milito','Argentina',25,4),
	(186,'Michael Essien','Ghana',59,9),
	(187,'Joshua Kimmich','Germany',80,6),
	(188,'Maicon','Brazil',54,5),
	(189,'Ivan Rakitic','Croatia',106,15),
	(190,'Luis Enrique','Spain',62,12),
	(191,'Pep Guardiola','Spain',47,5),
	(192,'Philippe Coutinho','Brazil',68,21),
	(193,'Gianluca Zambrotta','Italy',92,2),
	(194,'Antonio Di Natale','Italy',42,11),
	(195,'Ricardo Carvalho','Portugal',89,5),
	(196,'Jérôme Boateng','Germany',76,1),
	(197,'Mario Gómez','Germany',40,14),
	(198,'Marc-André ter Stegen','Germany',24,0),
	(199,'Dirk Kuyt','Netherlands',104,24),
	(200,'Sami Khedira','Germany',77,7),
	(201,'Lukas Podolski','Germany',130,49),
	(202,'Erling Haaland','Norway',31,27),
	(203,'Marquinhos','Brazil',82,7),
	(204,'Bernardo Silva','Portugal',95,12),
	(205,'Eric Abidal','France',67,0),
	(206,'Serge Gnabry','Germany',17,14),
	(207,'Esteban Cambiasso','Argentina',52,5),
	(208,'Juan Mata','Spain',41,10),
	(209,'Gennaro Gattuso','Italy',70,1),
	(210,'Koji Nakata','Japan',57,2),
	(211,'Sunil Chhetri','India',153,95);
	

--
-- Table structure for table `cricket_player`
--

DROP TABLE IF EXISTS `cricket_player`;

CREATE TABLE `cricket_player` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `caps` int DEFAULT NULL,
  `centuries` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `player`
--

INSERT INTO `cricket_player` VALUES 
	(1,'Sachin Tendulkar','India',664,100),
	(2,'Virat Kohli','India',550,82),
	(3,'Ricky Ponting','Australia',560,71),
	(4,'Kumar Sangakkara','Sri Lanka',594,63),
	(5,'Jacques Kallis','South Africa',519,62),
	(6,'Hashim Amla','South Africa',349,55),
	(7,'Mahela Jayawardene','Sri Lanka',652,54),
	(8,'Brian Lara','West Indies',430,53),
	(9,'Joe Root','England',361,53),
	(10,'Rohit Sharma','India',499,49)

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;	

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Mohit Gupta','Sunlife',20,'mohit.k.gupta@sunlife.com'),
	(2,'Vipul Gupta','LG',10,'vipul.gupta@lg.com'),
    (3,'Nikhil Gupta','Panasonic',50,'nikhil.gupta@panasonic.com'),
    (4,'Nishant Gupta','Morgan Stanley',30,'nishant.gupta@morganstaley.com'),
    (5,'Anurag Gupta','Adani',20,'anurag.gupta@adani.com'),
    (6,'Arnav Rastogi','Thomson Digital',20,'arnav.rashtogi@thomsondigital.com'),
    (7,'Harsh Gupta','Zoom',12,'harsh.gupta@zoom.com'),
    (8,'Yash Gupta','Tech Mahindra',10,'yash.gupta@techm.com'),
    (9,'Yajas Gupta','TCS',5,'yajas.gupta@tcs.com'),
    (10,'Amay Gupta','HCL',2,'amay.gupta@hcl.com');
    
--
-- Table structure for table `politician`
--

DROP TABLE IF EXISTS `politician`;	

CREATE TABLE `politician` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `politician`
--

INSERT INTO `politician` VALUES 
	(1,'Droupadi Murmu','Center',200000,'President'),
	(2,'Jagdeep Dhankhar','Center',100000,'Vice President'),
    (3,'Narender Modi','Center',50000,'Prime Minister'),
    (4,'Rajnath Singh','Center',30000,'Ministry of Defence'),
    (5,'Amit Shah','Center',20000,'Ministry of Home Affairs'),
    (6,'Nitin Jairam Gadkari','Center',10000,'Ministry of Road Transport and Highways'),
    (7,'Jagat Prakash Nadda','Center',5000,'Ministry of Health and Family Welfare'),
    (8,' Shivraj Singh Chouhan','Center',2500,'Ministry of Agriculture & Farmers Welfare'),
    (9,'Nirmala Sitharaman','Center',1250,'Ministry of Finance'),
    (10,'Subrahmanyam Jaishankar','Center',625,'Ministry of External Affairs');
    
--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;	

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(55) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data for table `users`
--

INSERT INTO `users` VALUES
    ('modi','{noop}test123',1),
    ('rajnath','{noop}test123',1),
    ('amit','{noop}test123',1);
    
--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;	

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(55) NOT NULL,
  
  UNIQUE KEY  `authorities_idx_1` (`username`, `authority`),
  
  CONSTRAINT `authorities_ibfk_1`
  FOREIGN KEY (`username`)
  REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data for table `users`
--

INSERT INTO `authorities` VALUES
    ('amit','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_MANAGER'),
    ('modi','ROLE_ADMIN'),
    ('modi','ROLE_MANAGER'),
    ('modi','ROLE_EMPLOYEE');


--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;	 

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(68) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `users` VALUES
    ('modi','{bcrypt}$2a$10$quP.ArdwiQTIaqwOCfaHOOodk/c9EL4Ux.UaZnjZxKpstRWiU8lE2',1),
    ('rajnath','{bcrypt}$2a$10$hqbdhJXfh7nJZiUYj52NDOeWNNToBptqHyG8mZ8P38rZkUbjjNLnG',1),
    ('amit','{bcrypt}$2a$10$MlUIOlZG6ck5nc5rdOQXKenZ4daR8qdUu6Z14Ika.9j6I1fBMSUtK',1);
    
INSERT INTO `users` VALUES
    ('gadkari','{noop}test123',1),
    ('nadda','{noop}test123',1),
    ('shivraj','{noop}test123',1);
    
DROP TABLE IF EXISTS `authorities`;	

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(55) NOT NULL,
  
  UNIQUE KEY  `authorities_idx_1` (`username`, `authority`),
  
  CONSTRAINT `authorities_ibfk_1`
  FOREIGN KEY (`username`)
  REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data for table `users`
--

INSERT INTO `authorities` VALUES
    ('amit','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_MANAGER'),
    ('modi','ROLE_ADMIN'),
    ('modi','ROLE_MANAGER'),
    ('modi','ROLE_EMPLOYEE'),
    ('gadkari','ROLE_EMPLOYEE'),
    ('nadda','ROLE_EMPLOYEE'),
    ('nadda','ROLE_MANAGER'),
    ('shivraj','ROLE_ADMIN'),
    ('shivraj','ROLE_MANAGER'),
    ('shivraj','ROLE_EMPLOYEE');
    
--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;	 

CREATE TABLE `members` (
  `user_id` varchar(50) NOT NULL,
  `pw` varchar(68) NOT NULL,
  `active` tinyint NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `members` VALUES
    ('modi','{bcrypt}$2a$10$quP.ArdwiQTIaqwOCfaHOOodk/c9EL4Ux.UaZnjZxKpstRWiU8lE2',1),
    ('rajnath','{bcrypt}$2a$10$hqbdhJXfh7nJZiUYj52NDOeWNNToBptqHyG8mZ8P38rZkUbjjNLnG',1),
    ('amit','{bcrypt}$2a$10$MlUIOlZG6ck5nc5rdOQXKenZ4daR8qdUu6Z14Ika.9j6I1fBMSUtK',1);
    
INSERT INTO `members` VALUES
    ('gadkari','{noop}test123',1),
    ('nadda','{noop}test123',1),
    ('shivraj','{noop}test123',1);
    
DROP TABLE IF EXISTS `roles`;	

CREATE TABLE `roles` (
  `user_id` varchar(50) NOT NULL,
  `role` varchar(55) NOT NULL,
  
  UNIQUE KEY  `roles_idx_1` (`user_id`, `role`),
  
  CONSTRAINT `roles_ibfk_1`
  FOREIGN KEY (`user_id`)
  REFERENCES `members` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data for table `roles`
--

INSERT INTO `roles` VALUES
    ('amit','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_EMPLOYEE'),
    ('rajnath','ROLE_MANAGER'),
    ('modi','ROLE_ADMIN'),
    ('modi','ROLE_MANAGER'),
    ('modi','ROLE_EMPLOYEE'),
    ('gadkari','ROLE_EMPLOYEE'),
    ('nadda','ROLE_EMPLOYEE'),
    ('nadda','ROLE_MANAGER'),
    ('shivraj','ROLE_ADMIN'),
    ('shivraj','ROLE_MANAGER'),
    ('shivraj','ROLE_EMPLOYEE');