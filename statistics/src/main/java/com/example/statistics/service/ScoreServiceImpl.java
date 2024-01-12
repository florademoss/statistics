package com.example.statistics.service;


import com.example.statistics.dao.ScoreDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{
    @Resource
    private ScoreDaoImpl sdi;
    @Override
    public String queryMedianByClass(int classid) {
        List<Integer> res = sdi.queryMedianByClass(classid);
        //找出中位数
        int[] tmp = new int[res.size()+1];
        for (int i = 0; i < res.size(); i++) {
            tmp[i]=res.get(i);
        }
        bubbleSort(tmp);
//        System.out.println(String.valueOf(tmp.length%2==0 ? tmp[tmp.length/2-1]:tmp[tmp.length/2])+"======");
        return String.valueOf(tmp.length%2==0 ? tmp[tmp.length/2-1]:tmp[tmp.length/2]);
    }

    @Override
    public String queryAverageByClass(int classid) {
        return sdi.queryAverageByClass(classid);
    }
    private int[] bubbleSort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len - 1 - i; ++j) {
                if (nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j]=nums[j + 1];
                    nums[j + 1]=tmp;
                }
            }
        }
        return nums;
    }
}
