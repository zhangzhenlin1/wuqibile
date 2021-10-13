package com.wqbl.wuqibile.service.impl;

import com.wqbl.wuqibile.service.IntegrateService;
import com.wqbl.wuqibile.service.IntegratorGenerateService;
import com.wqbl.wuqibile.vo.BaseIntegrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class IntegrateServiceImpl implements IntegrateService {
    @Autowired
    private Map<String,IntegratorGenerateService> IntegratorGenerateMap;
    @Override
    public BaseIntegrate findIntegrate(int integratorId) {
        return IntegratorGenerateMap.get(String.valueOf(integratorId)).IntegratorGenerate();
    }


}
