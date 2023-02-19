package com.ok.okspringdatajdbc.orders;

import org.springframework.data.repository.ListCrudRepository;

public interface PurchaseOrders extends ListCrudRepository<PurchaseOrder, Long> {
}
