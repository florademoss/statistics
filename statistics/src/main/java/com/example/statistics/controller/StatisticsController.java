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
        scoreServiceImpl.queryMedianByClass(classid);
        return "hello";
    }
    @RequestMapping("/queryAverageByClass")
    @ResponseBody
    public String queryAverageByClass(){
        return "hello";
    }
}
