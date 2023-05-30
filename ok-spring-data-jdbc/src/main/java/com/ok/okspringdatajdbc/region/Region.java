package com.ok.okspringdatajdbc.region;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.util.Set;

@ToString
public class Region {

    @Id
    Long id;
    String name;
    //    @MappedCollection(idColumn = "region_id")
//    Set<District> districts;
//    @MappedCollection(idColumn = "region_id")
    @Transient
 //    Set<Long> districts;
    Set<AggregateReference<District, Long>> districts;
}
