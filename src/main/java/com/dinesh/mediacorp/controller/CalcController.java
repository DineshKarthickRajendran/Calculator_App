package com.dinesh.mediacorp.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dineshkarthick on 5/13/2017.
 */
@RestController
public class CalcController {

    public String defineCalculator(@RequestParam("inputExpression") String inputExpression){

        return null;

    }

}
