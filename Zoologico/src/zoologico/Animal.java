/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 * Implementa as caracteristicas principais
 * dos animais do zoologico
 * @author JUNIOR
 */
public abstract class Animal {
    String nome = null;
    String especie = null;
    int qtdPatas;

    /**
     * Constroi a classe animais passando os seguintes parametros:
     * @param nome
     * @param especie
     * @param qtdPatas 
     */
    public Animal(String nome, String especie, int qtdPatas) {
        this.nome = nome;
        this.especie = especie;
        this.qtdPatas = qtdPatas;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
    
    
    /**
     * emitir som, retorna uma string, que emite o som do respectivo
     * animal, sendo assim deve ser sobrescrito pelas classes filhas.
     * @return String
     */
    public abstract String emitirSom();
    
    /**
    * Retorna a descricao do animal no formato:
    *  Nome   especie  quantidade de patas
    * @return A descricao do animal (seus campos separados por tabulacoes)
    */
    public String getDescricaoAnimal() {
        return nome + "\t" + especie + "\t" + qtdPatas + "\t";
    }
}
