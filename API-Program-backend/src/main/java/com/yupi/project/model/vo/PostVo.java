package com.fll.project.model.vo;

import com.fll.flapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子视图
 *
  
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVo extends InterfaceInfo {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}
