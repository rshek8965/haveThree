package com.company;

public class haveThree {
    public static boolean check(int[] arr)
    {
        int count=1;
        for (int i = 0;i<arr.length-1; i++)
        {
            if (arr[i]==3)
            {
                count++;
                if (arr[i+1]==3)
                {
                    return false;
                }
            }
        }
        if (count==3)
        {return true;}
        else return false;
    }
}
