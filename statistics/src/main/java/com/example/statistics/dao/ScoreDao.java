package com.example.statistics.dao;

public interface ScoreDao {
    public String queryMedianByClass(int classid);
    public String queryAverageByClass(int classid);
}
