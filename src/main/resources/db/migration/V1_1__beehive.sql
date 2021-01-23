CREATE TABLE IF NOT EXISTS `beehive` (
  `sensor_id` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  PRIMARY KEY (`sensor_id`),
  UNIQUE KEY `sensor_id_UNIQUE` (`sensor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;