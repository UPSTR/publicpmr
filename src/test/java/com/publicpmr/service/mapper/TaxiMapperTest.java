package com.publicpmr.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TaxiMapperTest {

    private TaxiMapper taxiMapper;

    @BeforeEach
    public void setUp() {
        taxiMapper = new TaxiMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(taxiMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(taxiMapper.fromId(null)).isNull();
    }
}