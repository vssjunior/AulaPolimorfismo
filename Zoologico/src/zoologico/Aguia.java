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
public class Aguia extends Animal {
    String capVoo;
    /**
     * constroi a classe Aguia, herdando os paramentros da classe Animal
     * @param nome
     * @param especie
     * @param qtdPatas 
     */
    public Aguia(String nome, String especie, int qtdPatas, String capVoo) {
        super(nome, especie, qtdPatas);
        this.capVoo = capVoo;
    }
    
    /**
     * sobrescreve o metodo emitSom para alterar o tipo de som
     * @return 
     */
    @Override
    public String emitirSom(){
        return " Piuuuuu "; 
    }

     /**
     * Retorna a descricao do animal no formato:
     * Nome
     * especie
     * quantidade de patas
     * Capacidade de Voo
    * @return A descricao do animal (seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoAnimal() {
        return "Nome: " + nome + "\n" +
               "Especie: " + especie + "\n" +
               "Quantidade de Patas: " + qtdPatas + "\n" + 
               "Capacidade de voo: " + capVoo + "\n";
    } 
}
