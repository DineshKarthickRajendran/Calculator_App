package com.dinesh.mediacorp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dineshkarthick on 5/13/2017.
 */
public class MathUtil {

    private static final String MATH_EXPRESSION = "((sqrt)|(pow))";
    private static Pattern pattern = Pattern.compile(MATH_EXPRESSION);
    private static final String MATH_PREFIX = "T(java.lang.Math).";

    public static boolean isMathExpression(final String expression){
        Matcher matcher = pattern.matcher(expression);
        return matcher.find();
    }

    public static String parse(final String inputVal){

        StringBuilder builder = new StringBuilder(inputVal);

        if(isMathExpression(inputVal)){
            return builder.toString().replaceAll(MATH_EXPRESSION,MATH_PREFIX+"$1");
        }

        return builder.toString().replaceAll("gauss","#gauss");

    }
}
