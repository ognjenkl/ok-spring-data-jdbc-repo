package com.ok.okspringdatajdbc.house;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@RequiredArgsConstructor
public class House {

    @Id
    final String id;
    @Version
    Long version;
    final String name;
}
