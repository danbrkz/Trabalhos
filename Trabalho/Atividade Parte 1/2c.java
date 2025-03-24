public class Carro {
    private String modelo;
    private int ano;
    private double velocidade;

    
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }

    
    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        if (velocidade > 0) {
            velocidade -= 10;
        }
    }

    public void mostrarVelocidade() {
        System.out.println("A velocidade do carro é " + velocidade + " km/h.");
    }