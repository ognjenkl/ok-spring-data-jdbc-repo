package com.ok.okspringdatajdbc.house;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

@Configuration
public class IDConverter extends AbstractJdbcConfiguration {

    @Bean
    @Override
    public JdbcCustomConversions jdbcCustomConversions() {
        return new JdbcCustomConversions(java.util.List.of(new IDWriteConverter()));
    }

    @WritingConverter
    public static class IDWriteConverter implements Converter<ID, String> {
        public String convert(ID id) {
            return id.id();
        }
    }
}