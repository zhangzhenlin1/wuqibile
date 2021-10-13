package com.wqbl.wuqibile.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntegratorGenerateA {
    private Integer id;
    private Integer bookedSpots;
    private Integer totalSpots;
    private Instant startTime;
    private Integer integratorId;
    private List<Translation> translations;
}
