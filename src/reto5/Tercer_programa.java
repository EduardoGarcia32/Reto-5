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
public class Tercer_programa {
    
        public static void main(String[] args) {
            
            double ladoA;
            double ladoB;
            double resultado;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer lado del triangulo con punto decimal");
            ladoA = sc.nextDouble();
            
            System.out.println("Ingrese el segundo lado del triangulo con punto decimal");
            ladoB = sc.nextDouble();

            resultado = CalculoHipotenusa(ladoA,ladoB);
            
            System.out.println("El resultado es "+resultado);
        }
        
        public static double CalculoHipotenusa(double ladoA, double ladoB){
            return Math.sqrt(ladoA*ladoA+ladoB*ladoB);
            
        }
        private static boolean comprobacion(double lado){
            return lado > 0;
        }
}
