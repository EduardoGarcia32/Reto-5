/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.util.Scanner;

/**
 *
 * @author Eduardo Garcia
 */
public class conversiones_numericas {
  
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
            int numeroconv;
        String numeroconv2;
            int result;
        String son;
            int repetir = 1;
        
        System.out.println("Programa de conversiones para triangulos");
        System.out.println("A. Convertir de decimal a binario");
        System.out.println("B. Convertir de decimal a octal");
        System.out.println("C. Convertir de decimal a hexadecimal");
        System.out.println("D. Convertir de binario a decimal");
        System.out.println("E. Convertir de octal a decimal");
        System.out.println("F. Convertir de hexadecimal a decimal");
        
        while(repetir > 0){
            System.out.print("Tipo de conversion ");
            String solicitud = sc.nextLine();
        
        switch(solicitud){
            case "a":
                System.out.print("Numero a convertir ");
                numeroconv = sc.nextInt();
                sc.nextLine();
                String binario = Integer.toBinaryString(numeroconv);
                System.out.println("El numero "+numeroconv+" el base binario es: "+binario);
                break;
                
            case "b":
                System.out.print("Numero a convertir ");
                numeroconv = sc.nextInt();
                sc.nextLine();
                String octal=Integer.toOctalString(numeroconv);
                System.out.println("El numero "+numeroconv+" el base octal es: "+octal);
                break;
                
            case "c":
                System.out.print("Numero a convertir ");
                numeroconv = sc.nextInt();
                sc.nextLine();
                String hexadecimal=Integer.toHexString(numeroconv);
                System.out.println("El numero "+numeroconv+" el base hexadecimal es: "+hexadecimal);
                break;
                
            case "d": 
                System.out.print("Numero a convertir ");
                numeroconv2 = sc.nextLine();
                result = Integer.parseInt(numeroconv2, 2);
                System.out.println("El numero binario "+numeroconv2+" el decimal es: "+result);
                break;
                
            case "e":
                System.out.print("Numero a convertir ");
                numeroconv2 = sc.nextLine();
                result = Integer.parseInt(numeroconv2, 8);
                System.out.println("El numero octal "+numeroconv2+" el decimal es: "+result);
                break;
                
            case "f":
                System.out.print("Numero a convertir ");
                numeroconv2 = sc.nextLine();
                result = Integer.parseInt(numeroconv2, 16);
                System.out.println("El numero hexadecimal "+numeroconv2+" el decimal es: "+result);
                break; 
                
            default:
                
                System.out.println("No ingreso de forma correcta los datos, intente de nuevo");
                break;
            }
        
        System.out.print("¿Desea otra conversión (si/no)? ");
        son = leer.nextLine();
        if("si".equals(son)){
            repetir = 1;
        }else{
            repetir=0;
        }
      } 
    }     
}
