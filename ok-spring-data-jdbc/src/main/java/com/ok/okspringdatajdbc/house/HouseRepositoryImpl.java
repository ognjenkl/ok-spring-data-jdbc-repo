package com.ok.okspringdatajdbc.house;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class HouseRepositoryImpl implements HouseRepository {

    private final JdbcHouseRepository jdbcHouseRepository;

    @Override
    public UUID nextIdentity() {
        return UUID.randomUUID();
    }

    @Override
    public void add(House house) {
        jdbcHouseRepository.save(house);
    }

    @Override
    public House findById(UUID id) {
        return jdbcHouseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("House not found"));
    }
}
