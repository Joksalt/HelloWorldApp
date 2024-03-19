package com.example.helloworldapp.Utils;

public class StringExtensions {
    public static int CalculateWordCount(String input){
        if (input.isEmpty()){
            return 0;
        }

        String[] words = input.split(" ");

        return words.length;
    }

    public static int CalculateCharCount(String input){
        int result = 0;

        String[] words = input.trim().split(" ");

        for (int i = 0; i < words.length; i++) {
            result += words[i].length();
        }

        return result;
    }
}