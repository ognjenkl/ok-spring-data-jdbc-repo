package com.ok.okspringdatajdbc.house;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class HouseIT {

    @Autowired
    HouseRepository houseRepository;

    @Test
    void givenHouse_whenSave_returnHouseWithId() {
        HouseId id = new HouseId(houseRepository.nextIdentity().toString());
        String name = "house-" + id.id();
        House house = new House(id, name);

        System.out.println(house.id);
        assertNotNull(house.id);

        houseRepository.add(house);

        House insertedHouse = houseRepository.findById(id);
        System.out.println(insertedHouse.id);
        System.out.println(insertedHouse.name);
        assertNotNull(insertedHouse);
        assertEquals(name, insertedHouse.name);
    }
}
