package com.company;

import java.util.ArrayList;
import java.util.List;

public class Math {
    ArrayList<Double> answersList = new ArrayList<Double>();

    public double substraction(double x, double y)
    {
        answersList.add(x*y);
        return x*y;
    }
    public double addition(double x, double y)
    {
        answersList.add(x+y);
        return x+y;
    }

    public List<Double> getAnswers()
    {
        return answersList;
    }

}
