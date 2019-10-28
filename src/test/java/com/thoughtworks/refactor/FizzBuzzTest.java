package com.thoughtworks.refactor;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FizzBuzzTest {


    @Test
    public void should_return_normal_number_when_number_is_normal() {
        int input = 1;
        String expect = "1";
        String actual = new FizzBuzz().sayIt(input);


        assertThat(actual, Is.is(expect));
    }




}
