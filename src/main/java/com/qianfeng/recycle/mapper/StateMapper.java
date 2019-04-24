package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.state.StateVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface StateMapper {
    List<StateVO> queryAllstate(@Param("equId") Integer equId);
}
