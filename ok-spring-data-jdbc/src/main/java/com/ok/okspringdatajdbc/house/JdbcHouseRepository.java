package com.ok.okspringdatajdbc.house;

import org.springframework.data.repository.CrudRepository;

public interface JdbcHouseRepository extends CrudRepository<House, String> {
}
