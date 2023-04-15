package com.company;

import java.sql.SQLOutput;

public class factorial {
    public static void main(String[] Args){
        System.out.println(find_factorial(5));

    }
    static int find_factorial(int value){
        if(value==0){
            return 1;
        }
        return value*find_factorial(value-1);
    }
}
