package com.example.statistics.service;


import com.example.statistics.dao.ScoreDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ScoreServiceImpl implements ScoreService{
    @Resource
    private ScoreDaoImpl sdi;
    @Override
    public String queryMedianByClass(int classid) {
        return sdi.queryMedianByClass(classid);
    }

    @Override
    public String queryAverageByClass(int classid) {
        return null;
    }
}
