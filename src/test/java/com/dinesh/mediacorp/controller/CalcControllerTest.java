package com.dinesh.mediacorp.controller;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by dineshkarthick on 5/13/2017.
 */
public class CalcControllerTest {

    @Test
    public void pareserTest(){
        ExpressionParser parser = new SpelExpressionParser();

        //Mathematical operators
        Expression exp3 = parser.parseExpression("100 * 2 + 25 / 2");
        int msg3 = (Integer) exp3.getValue();
        System.out.println(msg3);

    }
}
