package com.ok.okspringdatajdbc.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PurchaseOrderIT {

    public static final String STREET_1 = "Street 1";
    public static final String PRODUCT_1 = "Product 1";
    public static final String PRODUCT_2 = "Product 2";
    public static final int AMOUNT = 5;
    public static final int AMOUNT2 = 10;
    @Autowired
    PurchaseOrders orders;

    @Test
    void shouldPersistPurchaseOrder() {
        PurchaseOrder order = new PurchaseOrder();
        order.shippingAddress = STREET_1;

        assertNull(order.id);

        orders.save(order);

        assertNotNull(order.id);
    }

    @Test
    void shouldPersistPurchaseOrderWithItem() {
        PurchaseOrder order = new PurchaseOrder();
        order.shippingAddress = STREET_1;
        OrderItem item = new OrderItem(PRODUCT_1, AMOUNT);
        order.add(item);

        assertNull(order.id);

        orders.save(order);

        assertNotNull(order.id);
    }

    @Test
    void shouldPersistPurchaseOrderWithTwoItems() {
        PurchaseOrder order = new PurchaseOrder();
        order.shippingAddress = STREET_1;
        OrderItem item = new OrderItem(PRODUCT_1, AMOUNT);
        order.add(item);
        item = new OrderItem(PRODUCT_2, AMOUNT2);
        order.add(item);

        assertNull(order.id);

        orders.save(order);

        assertNotNull(order.id);
    }

    @Test
    void shouldRetrieveOrderById() {
        PurchaseOrder order = orders.findById(9L).get();

        assertNotNull(order);
        System.out.println(order);
        assertNotNull(order.items);
        assertTrue(order.items.size() > 0);
    }
}
