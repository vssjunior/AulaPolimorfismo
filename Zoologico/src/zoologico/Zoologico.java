/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Classe principal que faz a interface com usuario do simulador.
 * Permite cadastrar aguias, cachorro, galinha, gato, lobo, e lista-los.
 * @author JUNIOR
 */
public class Zoologico {
    
    private static InterfaceUsuario interfaceUsuario;
    
    /**
     * Metodo principal que inicial a execucao do programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interfaceUsuario = new InterfaceUsuario();
        interfaceUsuario.menu();
    }
}
