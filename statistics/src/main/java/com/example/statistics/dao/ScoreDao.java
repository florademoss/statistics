package com.example.statistics.dao;

import java.util.List;

public interface ScoreDao {
    public List<Integer> queryMedianByClass(int classid);
    public String queryAverageByClass(int classid);
}
