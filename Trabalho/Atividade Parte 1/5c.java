public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[5]; // Supondo 5 matérias
    }

    public void atribuirNota(int indice, double nota) {
        if (indice >= 0 && indice < notas.length) {
            notas[indice] = nota;
        }
    }

    public void calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno " + nome + " é: " + media);
    }

