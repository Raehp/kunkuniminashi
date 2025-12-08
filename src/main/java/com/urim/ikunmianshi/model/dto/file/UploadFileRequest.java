package com.urim.ikunmianshi.model.dto.file;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 文件上传请求
 *
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}