import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                // Impressão do cabeçalho com informações do curso e versão da calculadora.
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&Centro Universitário UniAlfa&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&Curso: Análise e Desenvolvimento de Sistemas - ADS&&&&&");
        System.out.println("&&&&&&Disciplina: Programação Orientada a Objetos - Java&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&Professor: George Mendes Marra****&&&&&&&&&&&&");
        System.out.println("&Aluno(a):Daniel Henrique Alves Bento                        &");
        System.out.println("&Data: 24/03/2025                                            &");
        System.out.println("&&&&&&&&&&&&Programa Calculadora em Java. Versão: 3.0&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble(); // Lê o primeiro número como um double.

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble(); // Lê o segundo número como um double.

        System.out.println(); // Imprime uma linha em branco para melhorar a formatação.
        System.out.println("Escolha a operação:");
        System.out.println("1 - Fatorial do primeiro número");
        System.out.println("2 - Valor absoluto");
        System.out.println("3 - Convertendo radianos para graus");
        System.out.println("4 - Calcula a tangente");
        System.out.println(); // Imprime uma linha em branco para melhorar a formatação.

        // Lê a operação escolhida pelo usuário (agora utilizando int ao invés de char)
        int operacao = scanner.nextInt(); // Lê a operação como um inteiro.

        double resultado; // Declara a variável para armazenar o resultado da operação.

        // Estrutura switch para realizar a operação escolhida pelo usuário
        switch (operacao) {
            case 1: // Fatorial do primeiro número
                if (numero1 != (int) numero1 || numero1 < 0) {
                    System.out.println("Erro: Fatorial é definido apenas para números inteiros não negativos!");
                    return; // Encerra a execução se o número não for inteiro ou for negativo.
                }
                resultado = fatorial((int) numero1); // Calcula o fatorial do primeiro número.
                System.out.println("Fatorial de " + (int) numero1 + " é = " + resultado);
                return; // Encerra a execução após calcular o fatorial.
            case 2: // Valor absoluto
                resultado = Math.abs(numero1); // Calcula o valor absoluto do primeiro número.
                System.out.println("Valor absoluto de " + numero1 + " é = " + resultado);
                return; // Encerra a execução após calcular o valor absoluto.
            case 3: // Convertendo radianos para graus
                resultado = Math.toDegrees(numero1); // Converte o número de radianos para graus.
                System.out.println(numero1 + " radianos é igual a " + resultado + " graus.");
                return; // Encerra a execução após a conversão.
            case 4: // Calcula a tangente
                resultado = Math.tan(numero1); // Calcula a tangente do primeiro número.
                System.out.println("Tangente de " + numero1 + " é = " + resultado);
                return; // Encerra a execução após calcular a tangente.
            default: // Operação inválida
                System.out.println("Operação inválida!");
                return; // Encerra o programa se a operação for inválida.
        }
    }

    // Função para calcular o fatorial de um número
    public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
