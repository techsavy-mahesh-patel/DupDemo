package com.example.demo;

import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args){
      List<Integer> numbers = Arrays.asList(1,5,2,5,3,7,8);
      System.out.println(findFirstDup(numbers));
    }
    
    private static Integer findFirstDup(List<Integer> numbers) {
        //return the first dup that you find
        boolean match = false;
       
        Integer tmpNumber = null;
        if( numbers !=null)
        {
          for(int i=0; i< numbers.size(); i++){
            for(int j= i+1; j< numbers.size();j++)
            if(numbers.get(i).equals(numbers.get(j)))
            {
              match = true;
              tmpNumber = numbers.get(i);
              break;
              
            }
            
         }
        
        }
        if(match){
          return tmpNumber;
        }
        //otherwise return null
        return null;
    }
}