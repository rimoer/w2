CREATE TABLE `t_organize` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_parent` bigint(20) NOT NULL,
  `type_code` char(8) DEFAULT NULL,
  `context` varchar(200) DEFAULT NULL,
  `comments` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_parent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_estore_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_class` bigint(20) DEFAULT NULL,
  `goods_name` varchar(500) DEFAULT NULL,
  `describe` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_estore_goods_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_parent` bigint(20) DEFAULT NULL,
  `class_name` varchar(500) DEFAULT NULL,
  `describe` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
