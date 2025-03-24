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

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
