/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;


import java.util.ArrayList;

/**
 * Classe que sera responsavel pela Simulacao do zoologico.
 * @author Valdeci Junior
 * @version 2017-02-16
 */
public class TesteZoologico {
    
    /**
     * Unico atributo da classe é uma lista de animais, do tipo Animal
     */
    private static Simulador simulador = new Simulador();
    
    /**
     * Adiciona uma Aguia a lista de animais do zoologico
     * com os respectivos dados:
     * nome
     * especie
     * qtdPatas
     * capVoo 
     */
    public static void adicionarAguia(){
        String nome = " Falcao ";
        String especie = " Aguia ";
        int qtdPatas = 2;
        String capVoo = " Bom ";
        Animal aguia = new Aguia(nome, especie, qtdPatas, capVoo);
        simulador.adicionarAguia(nome, especie, qtdPatas, capVoo);
    }
    
    /**
     * Adiciona uma Galinha a lista de animais do zoologico
     *  com os respectivos dados:
     * nome
     * especie
     * qtdPatas
     * capVoo 
     */
    public static void adicionarGalinha(){
        String nome = " Galinha Pintadinha ";
        String especie = " Galinha ";
        int qtdPatas = 2;
        String capVoo = " ruim ";
        Animal galinha = new Galinha(nome, especie, qtdPatas, capVoo);
        simulador.adicionarGalinha(nome, especie, qtdPatas, capVoo);
    }
    
    /**
     * Adiciona um cachorro a lista de animais do zoologico
     *  com os respectivos dados:
     * nome
     * especie
     * qtdPatas
     * corPelo 
     */
    public static void adicionarCachorro(){
        String nome = " Scooby-Doo ";
        String especie = " Cachorro ";
        int qtdPatas = 4;
        String corPelo = " Marrom ";
        Animal cachorro = new Cachorro(nome, especie, qtdPatas, corPelo);
        simulador.adicionarCachorro(nome, especie, qtdPatas, corPelo);
    }
    
    /**
     * Adiciona um Gato a lista de animais do zoologico
     *  com os respectivos dados:
     * nome
     * especie
     * qtdPatas
     * corPelo 
     */
    public static void adicionarGato(){
        String nome = " Gato de Botas";
        String especie = " Gato ";
        int qtdPatas = 4;
        String corPelo = " Amarelo ";
        Animal gato = new Gato(nome, especie, qtdPatas, corPelo);
        simulador.adicionarGato(nome, especie, qtdPatas, corPelo);
    }
    
    /**
     * Adiciona um Lobo a lista de animais do zoologico
     * com os respectivos dados:
     * nome
     * especie
     * qtdPatas
     * corPelo 
     */
    public static void adicionarLobo(){
        String nome = " Fantasma ";
        String especie = " Lobo ";
        int qtdPatas = 4;
        String corPelo = " Preta ";
        Animal lobo = new Lobo(nome, especie, qtdPatas, corPelo);
        simulador.adicionarLobo(nome, especie, qtdPatas, corPelo);
    }
    
    /**
     * Metodo principal que inici os demais metodos para os testes automatizados
     * @param args 
     */
    public static void main(String[] args) {
        adicionarAguia();
        adicionarGalinha();
        adicionarCachorro();
        adicionarGato();
        adicionarLobo();
        System.out.println(simulador.getDescricaoAnimal());
    }
}
