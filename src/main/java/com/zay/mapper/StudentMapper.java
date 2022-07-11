package com.zay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zay.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: ZhouAnYan
 * @Date: 2022-07-11 15:45
 * @Version 1.0
 */
@Mapper
public interface StudentMapper extends BaseMapper<StudentEntity> {

}