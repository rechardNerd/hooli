package com.shiji.core.component;

import com.product.model.BaseQueryModel;
import com.shiji.core.service.BaseCompomentHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 暴露层基类
 * @param <T>
 * @param <S>
 * <p>抽象暴露层调用(insert/delete/update/query/view/save)到基类  钱海斌  2021-05-14</p>
 */
@Slf4j
public abstract class BaseExposer<T extends BaseQueryModel,S extends BaseCompomentHandler> extends BaseComponet<T> {
    abstract protected String getcollectionName();

    @Autowired
    private O
}
