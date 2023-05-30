package com.ok.okspringdatajdbc.region;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface DistrictRepository extends CrudRepository<District, Long> {

    Set<District> findByRegionId(Long regionId);
}
