package com.example.helloworldapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.helloworldapp.Utils.StringExtensions;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringExtensionsUnitTest {

    // This test case should never hit the main flow
    // since there is a check whether the input string string is empty prior to calling this method
    @Test
    public void CalculateWordCount_WhenInputStringIsEmpty_ReturnsZero(){
        final String inputString = "";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringValid_ReturnsWordCount(){
        final String inputString = "Hello world!";
        final int expectedOutput = 2;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsOnlySpaces_ReturnsZero(){
        final String inputString = "     ";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsSpecialSymbols_ReturnsOne(){
        final String inputString = "!@#$%^&*()_+[]{}";
        final int expectedOutput = 1;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringIsEmpty_ReturnsZero(){
        final String inputString = "";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringValid_ReturnsCharCount(){
        final String inputString = "Hello world!";
        final int expectedOutput = 11;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsOnlySpaces_ReturnsZero(){
        final String inputString = "     ";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsSpecialSymbols_ReturnsCharCount(){
        final String inputString = "!@#$%^&*()_+[]{}";
        final int expectedOutput = 16;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }
}