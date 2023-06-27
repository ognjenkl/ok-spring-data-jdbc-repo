package com.ok.okspringdatajdbc.house;

import java.util.List;

public interface HouseRepository {
    String nextIdentity();

    void add(House house);

    House findById(String id);
}
