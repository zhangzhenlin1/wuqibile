package com.wqbl.wuqibile.service.impl;

import com.wqbl.wuqibile.pojo.IntegratorGenerateB;
import com.wqbl.wuqibile.pojo.Spot;
import com.wqbl.wuqibile.service.IntegratorGenerateService;
import com.wqbl.wuqibile.vo.BaseIntegrate;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service("2")
public class IntegratorGenerateBSeviceImpl implements IntegratorGenerateService {

    @Override
    public BaseIntegrate IntegratorGenerate() {
        System.out.println("第二种积分器");
        IntegratorGenerateB integratorGenerateB = initIntegratorGenerateB();
        return BaseIntegrate.builder()
                .id(integratorGenerateB.getId())
                .availableSpots(integratorGenerateB.getSpots().getAvailable())
                .totalSpots(integratorGenerateB.getSpots().getTotal())
                .name(integratorGenerateB.getName())
                .startTime(integratorGenerateB.getStartTime())
                .build();
    }
    public IntegratorGenerateB initIntegratorGenerateB(){

        return IntegratorGenerateB.builder()
                .id(1)
                .integratorId(1)
                .startTime(Instant.now())
                .name("Yoga")
                .spots(Spot.builder()
                        .available(5)
                        .total(10)
                        .build())
                .build();
    }
}
