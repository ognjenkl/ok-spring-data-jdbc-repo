package com.ok.okspringdatajdbc.house;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class HouseIT {

    @Autowired
    HouseRepository houseRepository;

    @Test
    void givenHouse_whenSave_returnHouseWithId() {
        String id = houseRepository.nextIdentity();
        String name = "house-" + id;
        House house = new House(id, name);

        System.out.println(house.id);
        assertNotNull(house.id);

        houseRepository.add(house);

        House insertedHouse = houseRepository.findById(id);
        assertNotNull(insertedHouse);
        assertEquals(name, insertedHouse.name);
    }
}