package com.wqbl.wuqibile.service.impl;

import com.wqbl.wuqibile.pojo.IntegratorGenerateA;
import com.wqbl.wuqibile.pojo.Translation;
import com.wqbl.wuqibile.service.IntegratorGenerateService;
import com.wqbl.wuqibile.vo.BaseIntegrate;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

@Service("1")
public class IntegratorGenerateASeviceImpl implements IntegratorGenerateService {
    private final String KEY = "en";
    @Override
    public BaseIntegrate IntegratorGenerate() {
        System.out.println("第一种积分器");
        IntegratorGenerateA integratorGenerateA = initIntegratorGenerateA();
        Map<String, String> map = integratorGenerateA.getTranslations().stream().collect(Collectors.toMap(Translation::getLocale, Translation::getName));
        return BaseIntegrate.builder()
                .id(integratorGenerateA.getId())
                .availableSpots(integratorGenerateA.getBookedSpots())
                .totalSpots(integratorGenerateA.getTotalSpots())
                .name(map.get(KEY))
                .startTime(integratorGenerateA.getStartTime())
                .build();
    }
    public IntegratorGenerateA initIntegratorGenerateA(){
        Translation translation = Translation.builder()
                .name("Yoga")
                .locale("en")
                .build();
        Translation translationCn = Translation.builder()
                .name("瑜伽")
                .locale("zh-CN")
                .build();

        return IntegratorGenerateA.builder()
                .id(1)
                .integratorId(1)
                .startTime(Instant.now())
                .bookedSpots(5)
                .totalSpots(10)
                .translations(Arrays.asList(translation,translationCn))
                .build();
    }



}
