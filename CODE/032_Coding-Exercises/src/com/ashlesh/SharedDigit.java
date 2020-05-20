package com.ashlesh;

public class SharedDigit {
    public static boolean hasSharedDigit(int num0, int num1) {
        if(num0<10 || num1<10 || num0>99 || num1>99)
            return false;
        while(num0>0)
        {
            int temp =num1;
            while(temp>0)
            {
                if(num0 %10 == temp %10)
                    return true;
                temp /=10;
            }
            num0/=10;
        }
        return false;
    }
}
