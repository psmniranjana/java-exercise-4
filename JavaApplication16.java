/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import  java.util.Scanner;

public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice=sc.nextInt();
        if(choice <0 || choice >5){
             System.out.println("Invalid");
            
        }
        else{
           System.out.println(menu[choice]);
        }
    }

}
    
    

