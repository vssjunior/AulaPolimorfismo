/**
 * Classe que representa um Carro.
 * Carro herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta se o carro é flex ou comum (em relacao ao combustivel).
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Carro extends Veiculo {
    // definimos apenas os atributos que sao especificos do carro
    private boolean ehFlex;

    /**
     * Controi objeto da classe Carro a partir dos parametros passados
     * Obs: a velocidade inicial do carro eh definida na classe Veiculo
     * 
     * @param modelo Modelo do carro a ser criado.
     * @param marca Marca do carro a ser criado.
     * @param placa Placa do carro a ser criado.
     * @param ehFlex Indica se o carro eh flex ou nao (em relacao ao combustivel)
     */
    public Carro(String modelo, String marca, String placa, boolean ehFlex) {
        super(modelo, marca, placa);
        this.ehFlex = ehFlex;
    }

    /**
     * Retorna se o carro eh flex ou nao (em relacao ao combustivel)
	 *
	 * @return Indicacao se o carro eh flex ou nao
     */
    public boolean getEhFlex() {
        return ehFlex;
    }
    
        /**
     * Retorna a descricao do carro no formato:
     * Placa   Modelo  Marca   Imposto     Velocidade km/h     Flex (ou Comum)
     * Sobrescrevendo o metodo getDescricaoVeiculo na super classe
     * @return A descricao do carro (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoVeiculo() {
        String descricao = super.getDescricaoVeiculo();
        if (ehFlex) {
            descricao = descricao + "\t\tR$" + calculaImposto() + "\t\tFlex";
        }
        else {
            descricao = descricao + "\t\tR$" + calculaImposto() + "\t\tComum";
        }
        return descricao;
    }
    
    /**
     * Metodo que busca o valor base do imposto na super classe
     * faz o calculo de acordo com as normas da prefeitura
     * retorna um double com o valor do imposto calculado
     * @return 
     */
    public double calculaImposto(){
        double impostoCalculado = 0;
        if (ehFlex == true){
            impostoCalculado = (super.getImposto() - ((10/100)*super.getImposto()));
        }else{
            impostoCalculado = (super.getImposto() + ((5/100)*super.getImposto()));
        }
        return impostoCalculado;
    }
}
