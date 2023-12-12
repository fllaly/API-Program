package com.fll.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fll.flapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息Mapper
 *
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo>{

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}
