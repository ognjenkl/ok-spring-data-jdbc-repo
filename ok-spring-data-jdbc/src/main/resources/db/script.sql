CREATE TABLE IF NOT EXISTS `purchase_order` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `shipping_address` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `order_item` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `product` varchar(50) DEFAULT NULL,
    `amount` int DEFAULT NULL,
    `purchase_order_id` bigint NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_order` (`id`)
);

create table IF NOT EXISTS region
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table IF NOT EXISTS district
(
    id        bigint auto_increment
        primary key,
    name      varchar(255) null,
    region_id bigint       null,
    constraint district_region_id_fk
        foreign key (region_id) references region (id)
);




