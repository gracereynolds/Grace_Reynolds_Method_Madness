package com.company;

public class Main {
    public static boolean isPalindrome(String pal)
    {
        String str1 = "";
        for(int i = pal.length()-1; i >= 0; i--)
        {
            str1 += pal.substring(i,i+1);
        }
        return str1.equals(pal);
    }
    public static String cutOut(String str1, String cut)
    {
        int ind = str1.indexOf(cut);
        return str1.substring(0,ind) + str1.substring(ind + cut.length());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("zara"));
        System.out.println(cutOut("catatonic", "cat"));
        System.out.println(cutOut("fish", "i"));
    }
}

