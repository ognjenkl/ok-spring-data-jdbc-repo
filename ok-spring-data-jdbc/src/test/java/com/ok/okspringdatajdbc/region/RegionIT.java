package com.ok.okspringdatajdbc.region;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RegionIT {

    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private RegionRepository regionRepository;

    @Test
    void createRegionWithTwoDistricts() {

        Region region = new Region();
        region.name = "region";
        regionRepository.save(region);

        assertNotNull(region.id);


        District district = new District();
        district.name = "district1";
        district.regionId = region.id;
        districtRepository.save(district);

        district = new District();
        district.name = "district2";
        district.regionId = region.id;

        districtRepository.save(district);

        assertNotNull(district.id);
    }

    @Test
    void getRegionById() {
        Region region = regionRepository.findById(1L).get();
        System.out.println(region);

        Set<District> districtSet = districtRepository.findByRegionId(region.id);

        region.districts = districtSet.stream()
                .<AggregateReference<District, Long>>map(
                        district -> AggregateReference.to(district.id))
                .collect(Collectors.toSet());

        System.out.println(region);

        assertNotNull(region);
    }

    @Test
    void getDistrictsByRegionId() {
        Iterable<District> districts = districtRepository.findByRegionId(8L);
        districts.forEach(System.out::println);

        assertNotNull(districts);
    }
}