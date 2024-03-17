package com.example.helloworldapp.Utils;

public class StringExtensions {
    public static int CalculateWordCount(String input){
        String[] words = input.split(" ");

        return words.length;
    }

    public static int CalculateCharCount(String input){
        int result = 0;

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            result += words[i].length();
        }

        return result;
    }
}
