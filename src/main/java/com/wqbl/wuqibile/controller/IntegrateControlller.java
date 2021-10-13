package com.wqbl.wuqibile.controller;

import com.wqbl.wuqibile.service.IntegrateService;
import com.wqbl.wuqibile.vo.BaseIntegrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class IntegrateControlller {
    @Autowired
    private IntegrateService integrateService;

    @RequestMapping("findById")
    public BaseIntegrate findById(@RequestParam(name = "integrator_id",required=true) int integratorId){
        return integrateService.findIntegrate(integratorId) ;
    }

}
