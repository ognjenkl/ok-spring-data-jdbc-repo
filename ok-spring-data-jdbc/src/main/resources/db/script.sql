CREATE DATABASE IF NOT EXISTS `shop`;
USE `shop`;

CREATE TABLE IF NOT EXISTS `purchase_order`
(
    `id`               bigint NOT NULL AUTO_INCREMENT,
    `shipping_address` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `order_item`
(
    `id`                bigint NOT NULL AUTO_INCREMENT,
    `product`           varchar(50) DEFAULT NULL,
    `amount`            int         DEFAULT NULL,
    `purchase_order_id` bigint NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_order` (`id`)
);

CREATE TABLE IF NOT EXISTS region
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

CREATE TABLE IF NOT EXISTS district
(
    id        bigint auto_increment
        primary key,
    name      varchar(255) null,
    region_id bigint       null,
    constraint district_region_id_fk
        foreign key (region_id) references region (id)
);

CREATE TABLE IF NOT EXISTS `house`
(
    `id`      varchar(36) NOT NULL,
    `name`    varchar(64) DEFAULT NULL,
    `version` bigint      DEFAULT '0',
    PRIMARY KEY (`id`)
);

INSERT INTO `house` (`id`, `name`, `version`)
VALUES ('4ced19c7-822d-4cb8-92d0-44c9ce2a8bf9', 'house-4ced19c7-822d-4cb8-92d0-44c9ce2a8bf9', 0);