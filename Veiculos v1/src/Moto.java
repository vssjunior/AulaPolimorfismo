/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe que representa uma Moto.
 * Carro herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta se a cilindrada da moto.
 * @author junior
 */
public class Moto extends Veiculo {
    int cilindrada;
    
    /**
     * Controi objeto da classe Moto a partir dos parametros passados
     * Obs: a velocidade inicial da moto eh definida na classe Veiculo
     * @param modelo
     * @param marca
     * @param placa
     * @param cilindrada 
     */
    public Moto(String modelo, String marca, String placa, int cilindrada){
        super(modelo, marca, placa);
        this.cilindrada = cilindrada;
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     * Placa   Modelo  Marca Imposto   Velocidade km/h     Capacidade
     * Sobrescrevendo o metodo getDescricaoVeiculo na super classe
     * @return A descricao do caminhao (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoVeiculo() {
        return super.getDescricaoVeiculo() + "\tR$" + calculaImposto() + "\t";
    }
    
    /**
     * Metodo que busca o valor base do imposto na super classe
     * faz o calculo de acordo com as normas da prefeitura
     * retorna um double com o valor do imposto calculado
     * @return 
     */
    public double calculaImposto(){
        double impostoCalculado = super.getImposto();
        if(cilindrada == 125){
            impostoCalculado = (impostoCalculado + ((5/100)*impostoCalculado));
        }else if(cilindrada == 250){
            impostoCalculado = (impostoCalculado + ((15/100)*impostoCalculado));
        }else{
            impostoCalculado = (impostoCalculado + ((25/100)*impostoCalculado));
        }
        return impostoCalculado;
    } 
}
