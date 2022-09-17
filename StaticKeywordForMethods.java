/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2;

/**
 *
 * @author Mohammad Tauheed
 */
public class StaticKeywordForMethods {
    
    
    public static double Percentage(int number, int sub1, int sub2,int sub3,int sub4,int sub5){
        double percent = 0;
         
        float total = sub1+sub2+sub3+sub4+sub5;
        
        percent = percent + (number/total)*100;
        
        System.out.println("Percentage : "+ percent);
        
        return percent;
    }
    
    public static void main(String[] args) {
       
    }
}
