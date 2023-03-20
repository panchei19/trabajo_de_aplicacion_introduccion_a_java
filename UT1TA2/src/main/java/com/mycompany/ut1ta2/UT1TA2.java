/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ut1ta2;

/**
 *
 * @author franc
 */
public class UT1TA2 {

    public static int factorial(int num){
        int i = 1;
        int result = 1;
        for (i = num ; i>1; i--)
            result = (result * i);
        return(result);       
    }
    public static void main(String[] args) {
            System.out.println(factorial (5));
    }
}
