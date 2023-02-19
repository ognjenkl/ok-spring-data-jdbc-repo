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


