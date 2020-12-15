package com.ntsan.exercises;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzWhenMultipleOfThree() {
        FizzBuzz fB = new FizzBuzz();
        String result = fB.fizzBuzz(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void buzzWhenMultipleOfFive() {
        FizzBuzz fB = new FizzBuzz();
        String result = fB.fizzBuzz(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void fizzBuzzWhenMultipleOfThreeAndFive(){
        FizzBuzz fB = new FizzBuzz();
        String result = fB.fizzBuzz(15);
        Assert.assertEquals("FizzBuzz", result);
    }

}