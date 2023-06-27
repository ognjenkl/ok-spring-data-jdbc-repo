package com.ok.okspringdatajdbc.house;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class HouseRepositoryImpl implements HouseRepository {

    private final JdbcHouseRepository jdbcHouseRepository;

    @Override
    public String nextIdentity() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void add(House house) {
        jdbcHouseRepository.save(house);
    }

    @Override
    public House findById(String id) {
        return jdbcHouseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("House not found"));
    }
}
