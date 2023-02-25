DROP TABLE IF EXISTS `user0`;
CREATE TABLE `user0` (
`id` bigint NOT NULL AUTO_INCREMENT,
    `account` varchar(45) NOT NULL,
    `nickname` varchar(18) NOT NULL,
    `password` varchar(45) NOT NULL,
    `headimage_url` varchar(45) DEFAULT NULL,
    `introduce` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `account` varchar(45) NOT NULL,
    `nickname` varchar(18) NOT NULL,
    `password` varchar(45) NOT NULL,
    `headimage_url` varchar(45) DEFAULT NULL,
    `introduce` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_item0`;
CREATE TABLE `user_item0` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `user_id` bigint NOT NULL,
    `email` varchar(45) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_item1`;
CREATE TABLE `user_item1` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `user_id` bigint NOT NULL,
    `email` varchar(45) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;