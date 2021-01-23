CREATE TABLE IF NOT EXISTS `user` (
  `userID` int(10) NOT NULL DEFAULT '0',
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;