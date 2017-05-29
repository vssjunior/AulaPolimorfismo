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
public class Simulador {
    
    /**
     * Unico atributo da classe é uma lista de animais, do tipo Animal
     */
    private ArrayList<Animal> animais;
    
    /**
     * Construtur da classe, que inicializa os animais com
     * uma nova lista de Animal do zoologico
     */
    public Simulador(){
        animais = new ArrayList<Animal>();
    }
    
    /**
     * Adiciona uma Aguia a lista de animais do zoologico
     *  com os respectivos parametros:
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param capVoo 
     */
    public void adicionarAguia(String nome, String especie, int qtdPatas, String capVoo){
        Animal aguia = new Aguia(nome, especie, qtdPatas, capVoo);
        animais.add(aguia);    
    }
    
    /**
     * Adiciona uma Galinha a lista de animais do zoologico
     *  com os respectivos parametros:
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param capVoo 
     */
    public void adicionarGalinha(String nome, String especie, int qtdPatas, String capVoo){
        Animal galinha = new Galinha(nome, especie, qtdPatas, capVoo);
        animais.add(galinha);    
    }
    
    /**
     * Adiciona um cachorro a lista de animais do zoologico
     *  com os respectivos parametros:
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param corPelo 
     */
    public void adicionarCachorro(String nome, String especie, int qtdPatas, String corPelo){
        try{
            Animal cachorro = new Cachorro(nome, especie, qtdPatas, corPelo);
            animais.add(cachorro);
        }
        catch (NullPointerException e){
            System.out.println(" Lista de animais inicializada como nula ");
            System.out.println(" Refaça a lista diferente de null ");
        }
    
    }
    
    /**
     * Adiciona um Gato a lista de animais do zoologico
     *  com os respectivos parametros:
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param corPelo 
     */
    public void adicionarGato(String nome, String especie, int qtdPatas, String corPelo){
        Animal gato = new Gato(nome, especie, qtdPatas, corPelo);
        animais.add(gato);    
    }
    
    /**
     * Adiciona um Lobo a lista de animais do zoologico
     * com os respectivos parametros:
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param corPelo 
     */
    public void adicionarLobo(String nome, String especie, int qtdPatas, String corPelo){
        Animal lobo = new Lobo(nome, especie, qtdPatas, corPelo);
        animais.add(lobo);    
    }
    
    /**
     * Retorna uma String com a descricao de todos os animais do simulado.
     * Cada animal aparece em uma linha.
     * Cada animal eh represetado como definido pela sua classe.
	 *
	 * @return Descricao completa do zoologico com um animal por linha por linha
     */
    public String getDescricaoAnimal() {
        String descricao = "ANIMAIS DO ZOOLOGICO";
        
            if( animais.isEmpty()){
                descricao += "\n Nao ha animais no zoologico ";
            }
            else{
                for (Animal c: animais) {
                    descricao += "\n" + c.getDescricaoAnimal();
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
    private Animal buscarAnimais(String especie) {
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
    
    public String buscarAnimal(String nome) {
        for (Animal c : animais) {
            if (c.getNome().equals(nome)) {
                return c.getDescricaoAnimal();
            }
        }
        return null;
    }
    
    public String emitirSomAnimal(String nome) {
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
}
