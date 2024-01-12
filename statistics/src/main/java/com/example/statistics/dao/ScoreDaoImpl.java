package com.example.statistics.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Repository
public class ScoreDaoImpl implements ScoreDao{
    @Resource
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Integer> queryMedianByClass(int classid) {
        List<Integer> res = new LinkedList<Integer>();
        String sql = "select score from score where classid = "+classid;
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        Iterator<Map<String, Object>> iterator = list.iterator();
        while(iterator.hasNext()){
            Map<String, Object> next = iterator.next();
            Iterator<Map.Entry<String, Object>> iterator1 = next.entrySet().iterator();
            while(iterator1.hasNext()){
                Map.Entry<String, Object> next1 = iterator1.next();
//                System.out.println(next1.getKey()+"  "+next1.getValue());
                res.add((Integer) next1.getValue());
            }

        }
        return res;
    }

    @Override
    public String queryAverageByClass(int classid) {
        return null;
    }
}
