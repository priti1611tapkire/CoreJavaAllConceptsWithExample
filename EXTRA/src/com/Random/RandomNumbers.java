package com.Random;

import java.util.Random;
public class RandomNumbers{
        public static void main(String[] args) {
        	Random objGenerator = new Random();
         //   for (int iCount = 0; iCount< 1; iCount++){
              int randomNumber = objGenerator.nextInt(1000);
              System.out.println("Random No : " + randomNumber); 
            // }
     }
}