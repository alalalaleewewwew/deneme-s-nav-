/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author mdoru
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dogru sayisini giriniz");
        int dogru = sc.nextInt();
        System.out.println("yanlis sayinizi giriniz");
        int yanlis = sc.nextInt();
        
         
        if(dogru+yanlis>20 || dogru<0 || yanlis<0)
        System.out.println("girdiginiz sayi gecersiz");
        else{
            int bos = 20 - (dogru+yanlis);
            
         double    net =  dogru - yanlis/4.0;
         if (net>=0 || 5>=net)
                 System.out.println(20+" "+dogru+" "+yanlis+" "+bos+" "+net+" kotu");
         else if (net>5 && 10>=net)
             System.out.println(20+" "+dogru+" "+yanlis+" "+bos+" "+net+" orta");
        else if (net>10 && 15>=net)
              System.out.println(20+" "+dogru+" "+yanlis+" "+bos+" "+net+" iyi");
        else if(net>15 && 20>=net)
            System.out.println(20+" "+dogru+" "+yanlis+" "+bos+" "+net+" cok iyi");
         


     
