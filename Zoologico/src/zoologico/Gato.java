/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author JUNIOR
 */
public class Gato extends Animal {
    String corPelo;
    /**
     * constroi a classe gato, herdando os paramentros da classe Animal
     * @param nome
     * @param especie
     * @param qtdPatas 
     */
    public Gato(String nome, String especie, int qtdPatas, String corPelo) {
        super(nome, especie, qtdPatas);
        this.corPelo = corPelo;
    }
    
    /**
     * sobrescreve o metodo emitSom para alterar o tipo de som
     * @return 
     */
    @Override
    public String emitirSom(){
        return " Miau "; 
    }
    
     /**
     * Retorna a descricao do animal no formato:
     * Nome
     * especie
     * quantidade de patas
     * Cor
    * @return A descricao do animal (seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoAnimal() {
        return "Nome: " + nome + "\n" +
               "Especie: " + especie + "\n" +
               "Quantidade de Patas: " + qtdPatas + "\n" + 
               "Cor do Pelo: " + corPelo + "\n";
    }    
}
