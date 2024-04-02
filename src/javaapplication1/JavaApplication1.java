/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner; 
/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        
        int linhas =3; 
        int colunas = 3; 
        int [][] matrix = new int[linhas][colunas]; 
        
        
        for (int i = 0; i < linhas ; i++){
            for(int j = 0 ; j < colunas; j++){
                System.out.print("Digite um numero: "); 
                int num = scanner.nextInt(); 
                
                
                
            }
        
        
        }
        System.out.print("Digite um numero para ser procurado: ");
        int num = scanner.nextInt();
        String response =  "O número não existe na matriz"; 
        for (int i = 0; i < linhas; i++){
            for(int j = 0 ; j <  colunas ; j++){
            int num2 = matrix[i][j] ; 
            if(num ==  num2){
                response = "O numero existe na matriz"; 
                
            }
            else{
               
                
            }
            
                  
            
            
        
        }
            
            
        
        }
                     System.out.println(response); 
 
       
        

    }
    
}
