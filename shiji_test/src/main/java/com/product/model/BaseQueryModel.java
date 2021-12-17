package com.product.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.shiji.core.annotation.KeepTransient;
import lombok.Data;

@Data
public class BaseQueryModel {
    @TableField(exist = false)
    @KeepTransient
    private String fields;

    @TableField(exist = false)
    @KeepTransient
    private String order_field;

    @TableField(exist = false)
    @KeepTransient
    private String order_direction;

    @TableField(exist = false)
    @KeepTransient
    private Integer page_no;

    @TableField(exist = false)
    @KeepTransient
    private Integer page_size;

    @TableField(exist = false)
    @KeepTransient
    private String _flag;
}
