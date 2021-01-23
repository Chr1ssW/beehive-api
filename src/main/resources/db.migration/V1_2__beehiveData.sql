CREATE TABLE IF NOT EXISTS `beehive_data` (
  `dataID` int(5) NOT NULL AUTO_INCREMENT,
  `userID` int(10) DEFAULT NULL,
  `sensorID` varchar(255) DEFAULT NULL,
  `internalTemp` float(6,2) DEFAULT NULL,
  `externalTemp` float(6,2) DEFAULT NULL,
  `humidity` int(4) DEFAULT NULL,
  `weight` float(6,2) DEFAULT NULL,
  `timeStamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`dataID`),
  KEY `FK_sensorID` (`sensorID`),
  KEY `userID_idx` (`userID`),
  CONSTRAINT `userID` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21492 DEFAULT CHARSET=utf8;