package com.ok.okspringdatajdbc.orders;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.HashSet;
import java.util.Set;

public class PurchaseOrder {

    @Id
    Long id;
    String shippingAddress;

    @MappedCollection(idColumn = "purchase_order_id")
    final Set<OrderItem> items = new HashSet<>();

    public void add(OrderItem item) {
        items.add(item);
    }
}
