package com.dao;

import com.entity.CaigouyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouyuanView;

/**
 * 采购员 Dao 接口
 *
 * @author 
 */
public interface CaigouyuanDao extends BaseMapper<CaigouyuanEntity> {

   List<CaigouyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
