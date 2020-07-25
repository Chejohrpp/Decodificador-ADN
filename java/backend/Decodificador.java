package backend;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class Decodificador {
        String ADN_1;
        String ADN_2;    
    public Decodificador(String ADN_1, String ADN_2){
        this.ADN_1 = ADN_1;
        this.ADN_2 = ADN_2;
    }
    public String resultado(){
        String cadenaAux = "";
        String cadenaTotal = "";
        for (int i = 0; i < ADN_1.length(); i++) {
            String letraADN1 = Character.toString(ADN_1.charAt(i));
            for (int j = 0; j < ADN_2.length(); j++) {
                String letraADN2 = Character.toString(ADN_2.charAt(j));
                if (letraADN1.equalsIgnoreCase(letraADN2)) {
                    cadenaAux = cadenaAux + letraADN2;
                    int cont = 1;
                    for (int k = j; k < ADN_2.length()-1; k++) { 
                        String LSADN1 = null;
                        if (i+cont >= ADN_1.length()) {
                            break;
                        }else{
                            LSADN1 = Character.toString(ADN_1.charAt(i+cont));
                        }                
                        String LSADN2 = Character.toString(ADN_2.charAt(k+1));
                        if (LSADN1.equalsIgnoreCase(LSADN2)) {
                            cadenaAux = cadenaAux + LSADN2;
                            cont++;
                        }else{
                            break;
                        }
                    }
                    if (cadenaAux.length() > cadenaTotal.length()) {
                        cadenaTotal = cadenaAux;
                    }
                    cadenaAux = "";
                }
                
            }
        }
        if (cadenaTotal.length() <= 1) {
            return ("No hay una cadena que se repita");
        }else{
            return ("La cadena mas larga que se repite es:  " + cadenaTotal);
        }
    }
    
}
