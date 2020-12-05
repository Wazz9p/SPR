package com.company;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

class MathTest {

    Math math;

    @BeforeClass
    void createClass() {
        math = new Math();
    }

    @After
    public void fin() {
        math.answersList.clear();
    }

    @Ignore
    @Test
    public void substraction() {
        double expected = math.addition(2,3);
        double actual = 2-3;
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void addition() {
        double expected = math.substraction(3.3,3.5);
        double actual = 3.3*3.5;
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void getAnswers() {

        math.addition(2, 3);
        math.substraction(3, 3);

        List<Double> expected = math.getAnswers();

        List<Double> actual = new ArrayList<>();
        actual.add((double) 5);
        actual.add((double) 9);

        Assert.assertEquals(expected, actual);
    }
}