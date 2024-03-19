package com.example.helloworldapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.helloworldapp.Utils.StringExtensions;

public class StringExtensionsUnitTest {

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