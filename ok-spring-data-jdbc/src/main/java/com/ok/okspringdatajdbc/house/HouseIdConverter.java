package com.ok.okspringdatajdbc.house;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import java.util.UUID;

@Configuration
public class HouseIdConverter extends AbstractJdbcConfiguration {

    @Bean
    @Override
    public JdbcCustomConversions jdbcCustomConversions() {
        return new JdbcCustomConversions(java.util.List.of(new HouseWriteConverter()));
    }

    @WritingConverter
    public static class HouseWriteConverter implements Converter<UUID, String> {
        public String convert(UUID uuid) {
            return uuid.toString();
        }
    }
}