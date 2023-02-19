CREATE TABLE IF NOT EXISTS `purchase_order` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `shipping_address` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

