package com.dinesh.mediacorp.service.impl;

import com.dinesh.mediacorp.context.CalcRegisterFunction;
import com.dinesh.mediacorp.service.CalcService;
import com.dinesh.mediacorp.util.MathUtil;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Service;

/**
 * Created by dineshkarthick on 5/13/2017.
 *
 * References:
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/html/expressions.html
 */
@Service
public class CalcServiceImpl implements CalcService{

    @Override
    public String processExpression(String expression) {

        double calcResult = 0;
        try {

            ExpressionParser parser = new SpelExpressionParser();
            StandardEvaluationContext context = new StandardEvaluationContext();
            StringBuilder builder = new StringBuilder(MathUtil.parse(expression));
            String parsedExpression =  builder.toString().replaceAll("gauss", "#gauss");
            System.out.println("parsedExpression "+parsedExpression);

            context.registerFunction("gauss",CalcRegisterFunction.class.getDeclaredMethod("gauss", new Class[]{Double.class,Double.class,Double.class,Double.class}));

             calcResult = (Double) parser.parseExpression(parsedExpression).getValue(context, Double.class);

           } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return String.valueOf(calcResult);
    }
}
