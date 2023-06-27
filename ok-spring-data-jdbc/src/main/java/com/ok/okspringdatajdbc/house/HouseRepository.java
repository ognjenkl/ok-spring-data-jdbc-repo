package com.ok.okspringdatajdbc.house;

import java.util.UUID;

public interface HouseRepository {
    UUID nextIdentity();

    void add(House house);

    House findById(HouseId id);
}
