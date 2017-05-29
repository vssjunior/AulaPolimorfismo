/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author junior
 */
public class InterfaceUsuario {
    
    private static Simulador simulador;
    
    /**
     * Metodo principal que inicial a execucao do programa
     * @param args the command line arguments
     */
    public static void menu() {
        // TODO code application logic here
        
        /**
         * inicialização da variavel simulador
         */
        simulador = new Simulador();
        
        int opcaoMenu;
        do {
            opcaoMenu = exibirMenu();
            
            switch (opcaoMenu) {
                case 1:
                    adicionarAnimal();
                    break;
                case 2:
                    buscarAnimal();
                    break;
                case 3:
                    exibirAnimais();
                    break;
                case 4:
                    emitirSomAnimal();
                    break;
                case 5: // nao faz nada, apenas vai sair do programa
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcaoMenu != 5);
    }
    
    /**
     * Exibe o menu para o usuario e retorna a opcao escolhida por ele
     * 
     * @return Opcao de menu escolhida pelo usuario
     */
    private static int exibirMenu() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\n1) Adicionar Animal");
        System.out.println("2) Exibir dados de um animal");
        System.out.println("3) Listar todos Animais");
        System.out.println("4) Emitir som de um animal");        
        System.out.println("5) Sair");
        System.out.print("\tDigite sua opcao: ");
        
        return entrada.nextInt();
    }
    
    /**
     * Permite ao usuario adicionar um animal ao simulador.
     * O usuario passa os dados de acordo com o tipo de veiculo.
     */
    private static void adicionarAnimal() {        
        String nome, especie, capVoo, corPelo;
        int qtdPatas = 0;
        int tipo;
        boolean adicionado = false;
        Scanner entrada = new Scanner(System.in);
        
        try {
            System.out.print("Digite o Nome: ");
            nome = entrada.next();
            System.out.print("Digite a qtdPatas: ");
            qtdPatas = entrada.nextInt();
            System.out.print("Qual o tipo de animal (1-Aguia, 2-Cachorro, 3-Galinha, 4-Gato, 5-Lobo)? ");
            tipo = entrada.nextInt();
        
            switch (tipo) {
                case 1: // Aguia
                    System.out.print("Digite a capacidade de voo, bem ou mal): ");
                    capVoo = entrada.next();
                    especie = " aguia ";
                    simulador.adicionarAguia(nome, especie, qtdPatas, capVoo);
                    adicionado = true;
                    break;
                case 2: // Cachorro
                    System.out.print("Digite a cor do pelo: ");
                    corPelo = entrada.next();
                    especie = " cachorro ";
                    simulador.adicionarCachorro(nome, especie, qtdPatas, corPelo);
                    adicionado = true;
                    break;
                case 3: // Galinha
                    System.out.print("Digite a capacidade de voo, bem ou mal: ");
                    capVoo = entrada.next();
                    especie = " galinha ";
                    simulador.adicionarGalinha(nome, especie, qtdPatas, capVoo);
                    adicionado = true;
                    break;
                case 4: // Gato
                    System.out.print("Digite a cor do pelo: ");
                    corPelo = entrada.next();
                    especie = " gato ";
                    simulador.adicionarGato(nome, especie, qtdPatas, corPelo);
                    adicionado = true;
                    break;
                case 5: // Lobo
                    System.out.print("Digite a cor do pelo: ");
                    corPelo = entrada.next();
                    especie = " lobo ";
                    simulador.adicionarLobo(nome, especie, qtdPatas, corPelo);
                    adicionado = true;
                    break;
                default:
                    System.out.println("Tipo de animal invalido!");
            }
        }
        catch(InputMismatchException e){
            System.out.println(" Apenas numeros inteiros ");
        }
        if (adicionado) {
            System.out.print("Animal adicionado!");
        }
	// espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Exibe na tela o texto "ENTER para continuar" e aguarda um ENTER
     */
    private static void esperarTecla() {
        try {
            System.out.print("\n\nENTER para continuar...");
            Scanner entrada = new Scanner(System.in);
            entrada.nextLine();
        } catch (Exception e) {}
    }
    
    /**
     * Exibe na tela os dados do animal retornados pelo simulador
     */
    private static void buscarAnimal() {
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do Animal: ");
        nome = entrada.next();
        if (simulador.buscarAnimal(nome) != null){
            System.out.println(simulador.buscarAnimal(nome));
        }
        else{
            System.out.println(" O animal nao esta cadastrado no zoologico");
        }
        
        
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Exibe na tela os animais retornados pelo simulador
     */
    private static void exibirAnimais() {
        System.out.println(simulador.getDescricaoAnimal());
        
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }   

    /**
     * emite o som de um animal, passando sua especie
     */
    private static void emitirSomAnimal() {
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do Animal: ");
        nome = entrada.next();
        if (simulador.buscarAnimal(nome) != null){
            System.out.println(simulador.emitirSomAnimal(nome));
        }
        else{
            System.out.println(" O animal nao esta cadastrado no zoologico");
        }
        
        
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
}
