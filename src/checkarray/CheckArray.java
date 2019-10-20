/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarray;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author 17862
 */

public class CheckArray {
    public boolean has4or5(int [] arr){
        boolean test = false;
        
        for(int i : arr){
            if(i == 4 || i == 5){
                test = true;
                return test;
         }
            
        }
        return test;
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("If number 4 or number 5 is present in array: true will be returned.");
       System.out.println("Enter 5 Integers: ");
        final int MAX_INPUT = 5;
        int arr[] = new int[MAX_INPUT];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < MAX_INPUT; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(new CheckArray().has4or5(arr));
        //Do not change the main method.
        
    }
    
}
