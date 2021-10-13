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
public class IntegratorGenerateB {
    private Integer id;
    private String name;
    private Instant startTime;
    private Integer integratorId;
    private Spot spots;
}
