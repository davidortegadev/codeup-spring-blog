package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller

public class MathController {

    @GetMapping(path = "/{operator}/{number1}/{string}/{number2}")
    @ResponseBody
    public String calculator(@PathVariable String operator, @PathVariable String number1, @PathVariable String string, @PathVariable String number2) {

        switch (operator) {
            case "add": {
                int intResult = Integer.parseInt(number1) + Integer.parseInt(number2);
                return number1 + " plus " + number2 + " equals " + intResult + "!";
            }
            case "subtract": {
                int intResult = Integer.parseInt(number1) - Integer.parseInt(number2);
                return number1 + " minus " + number2 + " equals " + intResult + "!";
            }
            case "multiply": {
                int intResult = Integer.parseInt(number1) * Integer.parseInt(number2);
                return number1 + " multiplied by " + number2 + " equals " + intResult + "!";
            }
            case "divide": {
                int intResult = Integer.parseInt(number1) / Integer.parseInt(number2);
                return number1 + " divided by " + number2 + " equals " + intResult + "!";
            }
            default:
                return "Something in your syntax doesn't look right... try again?";
        }

        //        return number1 + " " + operator + " " + number2 + " equals " + bucket + "!";
    }

//    @GetMapping(path = "/add/{number1}/{string}/{number2}")
//    @ResponseBody
//    public String addition(@PathVariable String number1, @PathVariable String string, @PathVariable String number2) {
//        int intResult = Integer.parseInt(number1) + Integer.parseInt(number2);
//        return number1 + " plus " + number2 + " equals " + intResult + "!";
//    }
//
//    @GetMapping(path = "/subtract/{number1}/{string}/{number2}")
//    @ResponseBody
//    public String subtraction(@PathVariable String number1, @PathVariable String string, @PathVariable String number2) {
//        int intResult = Integer.parseInt(number1) - Integer.parseInt(number2);
//        return number1 + " minus " + number2 + " equals " + intResult + "!";
//    }

//    @GetMapping(path="/add/{a}/to/{b}")
//    @ResponseBody
//    public String add(@PathVariable int a, @PathVariable int b){
//        return ""+(a+b);
//    }
//
//    @GetMapping(path="/subtract/{a}/from/{b}")
//    @ResponseBody
//    public String subtract(@PathVariable int a, @PathVariable int b){
//        return ""+(b-a);
//    }
//
//    @GetMapping(path="/multiply/{a}/and/{b}")
//    @ResponseBody
//    public String multiply(@PathVariable int a, @PathVariable int b){
//        return ""+(a*b);
//    }
//
//    @GetMapping(path="/divide/{a}/by/{b}")
//    @ResponseBody
//    public String divide(@PathVariable double a, @PathVariable double b){
//        return ""+(a/b);
//    }

}
