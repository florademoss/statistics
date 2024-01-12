package com.example.statistics.controller;

import com.example.statistics.service.ScoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
public class StatisticsController {
    @Resource
    private ScoreServiceImpl scoreServiceImpl;

    @RequestMapping(value = "/queryMedianByClass/{classid}" ,method = RequestMethod.GET)
    @ResponseBody
    public String queryMedianByClass(@PathVariable("classid") int classid){
        System.out.println("hello"+classid);
        return scoreServiceImpl.queryMedianByClass(classid);
    }
    @RequestMapping(value = "/queryAverageByClass/{classid}" ,method = RequestMethod.GET)
    @ResponseBody
    public String queryAverageByClass(@PathVariable("classid") int classid){
        return scoreServiceImpl.queryAverageByClass(classid);
    }
}
