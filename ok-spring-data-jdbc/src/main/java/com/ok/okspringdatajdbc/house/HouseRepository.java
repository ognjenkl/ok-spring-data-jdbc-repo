package com.ok.okspringdatajdbc.house;

import java.util.List;
import java.util.UUID;

public interface HouseRepository {
    UUID nextIdentity();

    void add(House house);

    House findById(UUID id);
}
