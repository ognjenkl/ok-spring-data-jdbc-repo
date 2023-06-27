package com.ok.okspringdatajdbc.house;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface JdbcHouseRepository extends CrudRepository<House, UUID> {
}
