package com.ok.okspringdatajdbc.orders;

import lombok.ToString;
import org.springframework.data.annotation.PersistenceCreator;

@ToString
public class OrderItem {
    String product;
    Integer amount;

    @PersistenceCreator
    public OrderItem(String product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }
}
