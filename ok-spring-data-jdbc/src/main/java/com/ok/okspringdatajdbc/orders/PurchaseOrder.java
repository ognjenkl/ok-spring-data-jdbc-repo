package com.ok.okspringdatajdbc.orders;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.HashSet;
import java.util.Set;

@ToString
public class PurchaseOrder {

    @Id
    Long id;
    String shippingAddress;

    @MappedCollection(idColumn = "purchase_order_id")
    Set<OrderItem> items = new HashSet<>();


    public void add(OrderItem item) {
        items.add(item);
    }
}
