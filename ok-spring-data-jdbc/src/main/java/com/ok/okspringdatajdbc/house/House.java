package com.ok.okspringdatajdbc.house;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.UUID;

@RequiredArgsConstructor
public class House {

    @Id
    final UUID id;
    @Version
    Long version;
    final String name;
}
