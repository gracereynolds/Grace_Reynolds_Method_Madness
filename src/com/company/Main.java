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
    public static int sumUpTo(int num)
    {
        int sum = 0;
        for(int n = 1; n <= num; n++)
        {
            sum += n;
        }
        return sum;
    }
    public static String quadsolver(double a, double b, double c)
    {
        double root1, root2;
        if((b*b-4*a*c) < 0)
        {
            return "Imaginary root";
        }
        root1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        root2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        return "The roots are " + root1 + "and " + root2;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("zara"));
        System.out.println(cutOut("catatonic", "cat"));
        System.out.println(cutOut("fish", "i"));
        System.out.println(sumUpTo(3));
        System.out.println(sumUpTo(6));
        System.out.println(quadsolver(3,4,5));
    }
}
