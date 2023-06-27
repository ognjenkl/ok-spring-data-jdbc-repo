package com.ok.okspringdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import java.util.UUID;

@SpringBootApplication
public class OkSpringDataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(OkSpringDataJdbcApplication.class, args);
    }
}
