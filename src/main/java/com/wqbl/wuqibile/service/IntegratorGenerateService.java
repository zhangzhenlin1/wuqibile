package com.wqbl.wuqibile.service;

import com.wqbl.wuqibile.vo.BaseIntegrate;

/**
 * 积分生成接口  如果想要扩展新的积分器  只需要增加新的实现类
 */
public interface IntegratorGenerateService {
    public BaseIntegrate IntegratorGenerate();
}
