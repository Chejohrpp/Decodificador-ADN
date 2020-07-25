/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import front.InterfaceDecodificador;

/**
 *
 * @author sergi
 */
public class MainI {
    public static void main(String[] args){
        InterfaceDecodificador front = new InterfaceDecodificador();
        front.setVisible(true);
    }
}
