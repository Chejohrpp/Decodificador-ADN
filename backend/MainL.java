/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class MainL {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingrese el primer ADN");
        String ADN_1 = scanner.nextLine();
        System.out.println("Ingrese el segundo ADN");
        String ADN_2 = scanner.nextLine();
        Decodificador decodificador = new Decodificador(ADN_1,ADN_2);
        String resultado = decodificador.resultado();
        System.out.println(resultado);        
    }
}
