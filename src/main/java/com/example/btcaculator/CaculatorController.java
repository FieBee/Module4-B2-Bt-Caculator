package com.example.btcaculator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {

    @GetMapping
    public String alo(){
        return "index";
    }

    @PostMapping("/result/")
    public ModelAndView getResult(@RequestParam String caculation, @RequestParam(defaultValue = "0") double num1, @RequestParam(defaultValue = "0") double num2){
        ModelAndView modelAndView = new ModelAndView("index");
        double sum = num1+num2;
        double difference = num1 - num2;
        double product = num1*num2;
        double quotient = num1/num2;

        switch (caculation){
            case "+" :
                modelAndView.addObject("result", sum);
                break;
            case "-" :
                modelAndView.addObject("result", difference);
                break;
            case "*" :
                modelAndView.addObject("result", product);
                break;
            case "/" :
                modelAndView.addObject("result", quotient);
                break;
        }
        return modelAndView;
    }
}
