/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangalnum;  

 import java.util.Scanner;

public class TriangalNum {
public static void main(String[] args) {
     int TriNum=0;
          
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number");
        int n= input.nextInt();
       for(int i=1;i<=n;i++){
           
           for(int j=i;j<=i;j++){
               TriNum=TriNum+i;
                            System.out.println(i+"TriNum is"+TriNum);
              
               
               
           
           
       }
    }
    
}
}