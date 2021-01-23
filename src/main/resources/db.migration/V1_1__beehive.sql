CREATE TABLE IF NOT EXISTS `beehive` (
  `sensorID` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  PRIMARY KEY (`sensorID`),
  UNIQUE KEY `sensorID_UNIQUE` (`sensorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;