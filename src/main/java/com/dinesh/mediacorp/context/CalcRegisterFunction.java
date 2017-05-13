package com.dinesh.mediacorp.context;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.analysis.function.Gaussian;

/**
 * Created by dineshkarthick on 5/13/2017.
 *
 * References
 * https://commons.apache.org/proper/commons-math/javadocs/api-3.0/org/apache/commons/math3/analysis/function/Gaussian.html
 */
public abstract class CalcRegisterFunction {

    public static Double gauss(Double a,Double b,Double c,Double x){

        double gaussVal = 0;
        Gaussian gaussian = new Gaussian(a,b,c);
        gaussVal = gaussian.value(x);
        return gaussVal;
    }
}
