package com.test.ws.service.impl;

import com.test.ws.service.bbsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("bbsService")
public class bbsServiceImpl implements bbsService {
    @Resource(name = "bbsDAO")
    private bbsDAO dao;

    @Override
    public List<Map> list() {
        return dao.list();

    }
}
