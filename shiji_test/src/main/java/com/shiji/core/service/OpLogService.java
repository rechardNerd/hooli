package com.shiji.core.service;

import com.product.model.BaseQueryModel;

public interface OpLogService {
    <T extends BaseQueryModel> void logger();
}
