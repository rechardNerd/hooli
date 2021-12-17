package com.shiji.core.component;

import com.product.model.BaseQueryModel;
import com.shiji.core.service.OpLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConditionalOnBean(name="JdbcTemplate")
public class OpLogServiceImpl implements OpLogService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private SnowFlakeID snowFlake;

    public OpLogServiceImpl(){

    }

    @Override
    public <T extends BaseQueryModel> void logger() {

    }
}
