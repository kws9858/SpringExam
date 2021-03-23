package com.test.ws.service.impl;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository("bbsDAO")
public class bbsDAO {
    @Resource(name="template")
    private SqlSessionTemplate sqlMapper;

    public List<Map> list(){
        return sqlMapper.selectList("list");
    }

}
