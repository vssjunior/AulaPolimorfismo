/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe que representa um Trator.
 * Carro herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * Esta classe não possui nenhum atributo adicional.
 * @author junior
 */
public class Trator extends Veiculo{
    
    /**
     * Controi objeto da classe Trator a partir dos parametros passados
     * Obs: a velocidade inicial do trator eh definida na classe Veiculo
     * @param modelo
     * @param marca
     * @param placa 
     */
    public Trator(String modelo, String marca, String placa){
        super(modelo, marca, placa);
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     * Placa   Modelo  Marca Imposto   Velocidade km/h     Capacidade
     * Sobrescrevendo o metodo getDescricaoVeiculo na super classe
     * @return A descricao do caminhao (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoVeiculo() {
        return super.getDescricaoVeiculo() + "\t\tR$" + calculaImposto();
    }
    
    /**
     * Metodo que busca o valor base do imposto na super classe
     * faz o calculo de acordo com as normas da prefeitura
     * retorna um double com o valor do imposto calculado
     * @return 
     */
    public double calculaImposto(){
        double impostoCalculado = 0;
        return impostoCalculado;
    } 
}
