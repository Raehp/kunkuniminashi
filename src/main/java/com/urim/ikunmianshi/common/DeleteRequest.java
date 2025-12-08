package com.urim.ikunmianshi.common;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 删除请求
 *
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}