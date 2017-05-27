/**
 * Classe que representa um Caminhao.
 * Caminhao herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a capacidade de carga do caminhao em toneladas.
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Caminhao extends Veiculo
{
    // capacidade de carga do caminhao
    private double capacidadeCarga;

    /**
     * Controi objeto da classe Caminhao a partir dos parametros passados
     * Obs: a velocidade inicial do caminhao eh definida na classe Veiculo
     * 
     * @param modelo Modelo do caminhao a ser criado.
     * @param marca Marca do caminhao a ser criado.
     * @param placa Placa do caminhao a ser criado.
     * @param capacidadeCarga Capacidade de carga do caminhao (em toneladas).
     */
    public Caminhao(String modelo, String marca, String placa, double capacidadeCarga) {
        super(modelo, marca, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Retorna a capacidade de carga do caminhao (em toneladas)
	 * 
	 * @return A capacidade de carga do caminhao (em toneladas)
     */
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     * Placa   Modelo  Marca Imposto   Velocidade km/h     Capacidade
     * Sobrescrevendo o metodo getDescricaoVeiculo na super classe
     * @return A descricao do caminhao (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoVeiculo() {
        return getDescricaoVeiculo() + "\tR$" + calculaImposto() + "\t" + capacidadeCarga;
    }
    
    /**
     * Metodo que busca o valor base do imposto na super classe
     * faz o calculo de acordo com as normas da prefeitura
     * retorna um double com o valor do imposto calculado
     * @return 
     */
    public double calculaImposto(){
        double impostoCalculado = 0;
        if(capacidadeCarga < 10){
            impostoCalculado = (super.getImposto() - (10/100));
        }else if (capacidadeCarga > 10 && capacidadeCarga < 30){
            impostoCalculado = super.getImposto();
        }else{
            impostoCalculado = (super.getImposto() + (200/100));
        }
        return impostoCalculado;
    }
}