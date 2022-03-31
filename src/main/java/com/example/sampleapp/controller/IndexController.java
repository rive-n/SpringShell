package com.example.sampleapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

import com.example.sampleapp.model.EvalBean;

@RestController
public class IndexController {

  @RequestMapping("/index")
  public void index(EvalBean bean){
  }

    @InitBinder
    public void initBinder(WebDataBinder binder) {

    }
}
