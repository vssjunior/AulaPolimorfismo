import java.util.ArrayList;

/**
 * Classe que sera responsavel pelos testes automatizados de Simulacao do Transito.
 * Por enquanto, ela apenas trata as colecoes de veiculos (carros, caminhoes, onibus, tratores e motos).
 * 
 * @author Valdeci Soares da Silva Junior
 * @version 2017-05-27
 */
public class TesteSimulador{
    // colecao de Veiculos do simulador
    private static Simulador simulador = new Simulador();    
    /**
     * Adiciona um carro ao simulador para teste automatizado com:
     * modelo do carro a ser criado
     * marca do carro a ser criado
     * placa do carro a ser criado
     * Flex tipo do combustivel do carro a ser criado
     */
    public static void adicionarCarro1() {
        String modelo = "F50";
        String marca = "Ferrari";
        String placa = "AAA1111";
        boolean ehFlex = true;
        Carro carro = new Carro(modelo, marca, placa, ehFlex);
        carro.setVelocidadeAtual(240);
        simulador.adicionarCarro(modelo, marca, placa, ehFlex);
    }
    
    /**
     * Adiciona um carro ao simulador para teste automatizado com:
     * modelo do carro a ser criado
     * marca do carro a ser criado
     * placa do carro a ser criado
     * Flex tipo do combustivel do carro a ser criado
     */
    public static void adicionarCarro2() {
        String modelo = "Fusca";
        String marca = "VW";
        String placa = "bbb2222";
        boolean ehFlex = false;
        Carro carro = new Carro(modelo, marca, placa, ehFlex);
        carro.setVelocidadeAtual(50);
        simulador.adicionarCarro(modelo, marca, placa, ehFlex);
    }
    
    /**
     * Adiciona um trator ao simulador para testes automatizados com:
     * modelo do trator a ser criado
     * marca do trator a ser criado
     * placa do trator a ser criado
     */
    public static void adicionarTrator(){
        String modelo = "4230";
        String marca = "Agrale";
        String placa = "ccc3333";
        Trator trator = new Trator(modelo, marca, placa);
        trator.setVelocidadeAtual(10);
        simulador.adicionarTrator(modelo, marca, placa);
    }
    
    /**
     * Adiciona uma moto ao simulador para teste automatizado com:
     * modelo da moto a ser criada
     * marca da moto a ser criada
     * placa da moto a ser criada
     * cilindrada da moto a ser criada
     */
    public static void adicionarMoto(){
        String modelo = "CG";
        String marca = "Honda";
        String placa = "ddd4444";
        int cilindrada = 125;
        Moto moto = new Moto (modelo, marca, placa, cilindrada);
        moto.setVelocidadeAtual(80);
        simulador.adicionarMoto(modelo, marca, placa, cilindrada);
    }
    
    /**
     * Adiciona um caminhao ao simulador para teste automatizado com:
     * modelo Modelo do caminhao a ser criado.
     * marca Marca do caminhao a ser criado.
     * placa Placa do caminhao a ser criado.
     * capacidadeCarga Capacidade de carga do caminhao (em toneladas).
     */
    public static void adicionarCaminhao(){
        String modelo = "Atego";
        String marca = "Mercedes";
        String placa = "eee5555";
        double capacidadeCarga = 15;
        Caminhao caminhao = new Caminhao(modelo, marca, placa, capacidadeCarga);
        caminhao.setVelocidadeAtual(60);
        simulador.adicionarCaminhao(modelo, marca, placa, capacidadeCarga);
    }
    
    /**
     * Adiciona um onibus ao simulador para teste automatizado com:
     * 
     * modelo Modelo do onibus a ser criado.
     * marca Marca do onibus a ser criado.
     * placa Placa do onibus a ser criado.
     * capacidadePassageiros Quantidade de passageiros que o onibus pode carregar.
     */
    public static void adicionarOnibus(){
        String modelo = "Brutus";
        String marca = "Scania";
        String placa = "fff6666";
        int capacidadePassageiros = 40;
        Onibus onibus = new Onibus(modelo, marca, placa, capacidadePassageiros);
        onibus.setVelocidadeAtual(60);
        simulador.adicionarOnibus(modelo, marca, placa, capacidadePassageiros);
    }
    
    /**
     * Classe principal que faz as chamadas dos metodos para automatização dos testes
     * @param args 
     */
    public static void main(String[] args) {
        adicionarCarro2();
        adicionarCarro1();
        adicionarTrator();
        adicionarCaminhao();
        adicionarMoto();
        adicionarOnibus();
        simulador.getDescricaoFrota();
    }
}