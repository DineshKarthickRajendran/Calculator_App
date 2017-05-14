package com.dinesh.mediacorp.controller;

import com.dinesh.mediacorp.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dineshkarthick on 5/13/2017.
 */
@RestController
public class CalcController {

    @Autowired
    CalcService calcService;

    @RequestMapping("/calculate/{inputExpression}")
    public String defineCalculator(@PathVariable("inputExpression") String inputExpression){

        try {
            return calcService.processExpression(inputExpression);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
