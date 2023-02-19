package com.ok.okspringdatajdbc.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class PurchaseOrderIT {

    @Autowired
    PurchaseOrders orders;

    @Test
    void shouldPersistPurchaseOrder() {
        PurchaseOrder order = new PurchaseOrder();
        order.shippingAddress = "Street 1";

        assertNull(order.id);

        orders.save(order);

        assertNotNull(order.id);
    }
}
