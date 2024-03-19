package com.example.helloworldapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.helloworldapp.Utils.StringExtensions;

public class StringExtensionsUnitTest {

    @Test
    public void CalculateWordCount_WhenInputStringIsEmpty_ReturnsCorrectWordCount(){
        final String inputString = "";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringValid_ReturnsCorrectWordCount(){
        final String inputString = "Hello world!";
        final int expectedOutput = 2;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsOnlySpaces_ReturnsCorrectWordCount(){
        final String inputString = "     ";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsSpecialSymbols_ReturnsCorrectWordCount(){
        final String inputString = "!@#$%^&*()_+[]{}";
        final int expectedOutput = 1;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsSpecialDuplicateWhitespaceSeparators_ReturnsCorrectWordCount(){
        final String inputString = "Hello  world";
        final int expectedOutput = 2;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateWordCount_WhenInputStringContainsWhiteSpaceInFrontOfTheString_ReturnsCorrectWordCount(){
        final String inputString = "   Hello World!";
        final int expectedOutput = 2;

        final int actualOutput = StringExtensions.CalculateWordCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringIsEmpty_ReturnsCorrectCharCount(){
        final String inputString = "";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringValid_ReturnsCorrectCharCount(){
        final String inputString = "Hello world!";
        final int expectedOutput = 11;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsOnlySpaces_ReturnsCorrectCharCount(){
        final String inputString = "     ";
        final int expectedOutput = 0;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsSpecialSymbols_ReturnsCorrectCharCount(){
        final String inputString = "!@#$%^&*()_+[]{}";
        final int expectedOutput = 16;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsMultipleWhiteSpaceSeparators_ReturnsCorrectCharCount(){
        final String inputString = "Hello  world";
        final int expectedOutput = 10;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsSpecialDuplicateWhitespaceSeparators_ReturnsCorrectCharCount(){
        final String inputString = "Hello  world";
        final int expectedOutput = 10;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void CalculateCharCount_WhenInputStringContainsWhiteSpaceInFrontOfTheString_ReturnsCorrectCharCount(){
        final String inputString = "   Hello World";
        final int expectedOutput = 10;

        final int actualOutput = StringExtensions.CalculateCharCount(inputString);

        assertEquals(expectedOutput, actualOutput);
    }
}