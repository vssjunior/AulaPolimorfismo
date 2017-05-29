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
    private static ArrayList<Animal> animais = new ArrayList<Animal>();
    
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
        animais.add(aguia);    
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
        animais.add(galinha);    
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
        animais.add(cachorro);
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
        animais.add(gato);    
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
        animais.add(lobo);    
    }
    
    /**
     * Retorna uma String com a descricao de todos os animais do teste automatizado.
     * Cada animal aparece em uma linha.
     * Cada animal eh represetado como definido pela sua classe.
	 *
	 * @return Descricao completa do teste automatizado para zoologico
         * com um animal por linha por linha
     */
    public static String getDescricaoAnimal() {
        String descricao = "ANIMAIS DO ZOOLOGICO";
        
            if( animais.isEmpty()){
                descricao += "\n Nao ha animais no zoologico ";
            }
            else{
                for (Animal c: animais) {
                    descricao += "\n" + c.getDescricaoAnimal() + "\n Som:" + c.emitirSom() + "\n";
                }
            }
        return descricao;
    } 
    
    /**
     * Retorna um animal a partir da especie passada.
     * Se houver duas especies com o mesmo tipo retorna o primeiro encontrado.
     * 
     * @param especie do animal a ser buscado
     * @return Retorna a especie encontrada ou null se ele nao existir.
     */
    private static Animal buscarAnimais(String especie) {
        if ( animais.isEmpty()){
            return null;
        }
        else{
            for (Animal c : animais) {
                if (c.getEspecie().equals(especie)) {
                    return c;
                }
            }
        }
        return null;
    }
    
    /**
     * Busca um animal através de seu nome
     * @param nome
     * @return 
     */
    public static String buscarAnimal(String nome) {
        for (Animal c : animais) {
            if (c.getNome().equals(nome)) {
                return c.getDescricaoAnimal();
            }
        }
        return null;
    }
    
    /**
     * Emite o som de um animal apartir de seu nome
     * @param nome
     * @return 
     */
    public static String emitirSomAnimal(String nome) {
        if ( animais.isEmpty()){
            return " O zoologico esta vazio"
                    + " cadastre o animal para que ele possa emitir seu som! ";
        }
        else{
            for (Animal a : animais) {
                if (a.getNome().equals(nome) && a.getNome() != null) {
                    return a.emitirSom();
                }
                else {
                    return " Este animal nao esta presente no zoologico"
                            + " cadastre-o para que ele possa emitir seu som! ";
                }
            }
            return " Erro inesperado ";
        }
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
        System.out.println(getDescricaoAnimal());
        
    }
}
