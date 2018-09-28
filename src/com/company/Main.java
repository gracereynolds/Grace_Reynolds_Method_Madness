package com.company;

public class Main {
    private static boolean isPalindrome(String pal)
    {
        String str1 = "";
        for(int i = pal.length()-1; i >= 0; i--)
        {
            str1 += pal.substring(i,i+1);
        }
        return str1.equals(pal);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("zara"));
    }
}

