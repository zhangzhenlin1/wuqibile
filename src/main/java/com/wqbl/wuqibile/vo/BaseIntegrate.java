package com.wqbl.wuqibile.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseIntegrate implements Serializable {
    private Integer id;
    private String name;
    private Integer availableSpots;
    private Integer totalSpots;
    private Instant startTime;
}
