CREATE TABLE `t_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `C1` varchar(200) DEFAULT NULL,
  `C2` varchar(200) DEFAULT NULL,
  `C3` varchar(200) DEFAULT NULL,
  `C4` varchar(200) DEFAULT NULL,
  `C5` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_goods` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `id_class` BIGINT(20) DEFAULT NULL,
  `goods_name` VARCHAR(500) DEFAULT NULL,
  `describe` TEXT,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `t_goods_class` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `id_parent` BIGINT(20) DEFAULT NULL,
  `class_name` VARCHAR(500) DEFAULT NULL,
  `describe` TEXT,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
