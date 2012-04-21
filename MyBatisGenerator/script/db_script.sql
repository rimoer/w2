CREATE TABLE `t_organize` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_parent` bigint(20) NOT NULL,
  `id_type` bigint(20) NOT NULL,
  `title` varchar(100) NOT NULL,
  `describe` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`id_parent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE  `t_employee` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_parent` bigint(20) NOT NULL,
  `title` varchar(100) NOT NULL,
  `alias` varchar(100) NOT NULL,
  `status` bigint(20) NOT NULL,
  `describe` varchar(255) NOT NULL,
  `sort_order` int(11) NOT NULL,
  PRIMARY KEY (`id`,`id_parent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE  `t_dict` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `code_dict` varchar(3) NOT NULL,
  `describe` varchar(255) NOT NULL,
  `sort_order` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE  `t_dict_value` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_parent` bigint(20) NOT NULL,
  `code_dict` varchar(3) NOT NULL,
  `name_dict` varchar(4) NOT NULL,
  `value_dict` varchar(8) NOT NULL,
  `describe` varchar(255) NOT NULL,
  `sort_order` int(11) NOT NULL,
  PRIMARY KEY (`id`,`id_parent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE  `t_template` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `c1` varchar(100) NOT NULL,
  `c2` varchar(100) NOT NULL,
  `c3` varchar(100) NOT NULL,
  `c4` varchar(100) NOT NULL,
  `c5` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;