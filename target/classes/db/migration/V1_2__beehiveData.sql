CREATE TABLE IF NOT EXISTS `beehive_data` (
  `data_id` int(5) NOT NULL AUTO_INCREMENT,
  `sensor_id` varchar(255) DEFAULT NULL,
  `internal_temp` float(6,2) DEFAULT NULL,
  `external_temp` float(6,2) DEFAULT NULL,
  `humidity` int(4) DEFAULT NULL,
  `weight` float(6,2) DEFAULT NULL,
  `time_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`data_id`),
  KEY `FK_sensor_id` (`sensor_id`),
  CONSTRAINT `sensor_id` FOREIGN KEY (`sensor_id`) REFERENCES `beehive` (`sensor_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21492 DEFAULT CHARSET=utf8;