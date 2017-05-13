package com.dinesh.mediacorp.service.impl;

import com.dinesh.mediacorp.service.CalcService;
import junit.framework.Assert;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.junit.Test;

/**
 * Created by dineshkarthick on 5/13/2017.
 */
public class CalcServiceImplTest {

    @Test
    public void processExpressionTest(){

        CalcService calcService = new CalcServiceImpl();
        /*System.out.println(calcService.processExpression("1+16.5/(2+gauss(5,1,1,1))"));*/

        //Addition
        Assert.assertEquals(6.0,calcService.processExpression("1+(2+3)"));

        //subtraction
        Assert.assertEquals(0.0,calcService.processExpression("1+(2-3)"));

    }

    @Test(expected = Exception.class)
    public void processExpressionExceptionTest(){

        CalcService calcService = new CalcServiceImpl();
        calcService.processExpression("1+16.5/(2+gauss(5,1,0,1))");


    }


}
