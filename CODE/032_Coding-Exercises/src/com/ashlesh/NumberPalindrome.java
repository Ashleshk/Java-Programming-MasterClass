package com.ashlesh;

public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int reverse=0;
        int placeholder=Math.abs(number);

        while(placeholder>0)
        {
            int lastdigit =placeholder %10;
            reverse *= 10;
            reverse += lastdigit;
            placeholder /= 10;
        }
        return reverse==Math.abs(number);
    }

}
