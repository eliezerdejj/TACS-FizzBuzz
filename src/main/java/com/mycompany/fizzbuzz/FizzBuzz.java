/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz;

/**
 *
 * @author aluno
 */
public class FizzBuzz {
    
    public void fizzbuzz(int a, int b){
            
            if((a%3)==0 && (a%5)!=0){
              System.out.println("Jogador A: fizz");
            }
            
            if(((a%5)==0) && ((a%3)!=0 )){
                System.out.println("Jogador A: buzz");
            }
            
            if ((a%3==0) && (a%5==0)){
                System.out.println("Jogador A: fizz buzz");  
            }
            
            if((b%3)==0 && (b%5)!=0){
              System.out.println("Jogador B:fizz");
            }
            
            if((b%5)==0 && (b%3)!=0 ){
                System.out.println("Jogador B: buzz");
            }
            
            if (b%3==0 && b%5==0){
                System.out.println("Jogador B: fizz buzz");             
            }
            
            if (a%3!=0 && a%5!=0){
                System.out.println("Jogador A: "+a);              
            }
            
            if (b%3!=0 && b%5!=0){
                System.out.println("Jogador B: "+b);              
            }
        }    
}
