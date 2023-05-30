package com.ok.okspringdatajdbc.region;

import lombok.ToString;
import org.springframework.data.annotation.Id;

@ToString
public class District {

    @Id
    Long id;
    String name;
    Long regionId;
//    Region region;
//    AggregateReference<Region, Long> region;
}
