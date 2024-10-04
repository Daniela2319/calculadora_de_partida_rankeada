import java.util.Scanner;

public class Calculadora {

    // Função para exibir texto com efeito de digitação
    public static void efeitoDigitar(String texto, long delay) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    // Função para exibir cores no terminal (usando ANSI codes)
    public static String corTexto(String texto, String cor) {
        String reset = "\033[0m";
        String corEscolhida;

        switch (cor.toLowerCase()) {
            case "vermelho":
                corEscolhida = "\033[91m";
                break;
            case "verde":
                corEscolhida = "\033[92m";
                break;
            case "amarelo":
                corEscolhida = "\033[93m";
                break;
            case "azul":
                corEscolhida = "\033[94m";
                break;
            case "ciano":
                corEscolhida = "\033[96m";
                break;
            default:
                corEscolhida = "";
        }

        return corEscolhida + texto + reset;
    }

    // Função para determinar o nível com base no número de vitórias
    public static String obterCorPorNivel(int vitoria) {
        if (vitoria < 10) {
            return corTexto("Ferro", "ciano");
        } else if (vitoria <= 20) {
            return corTexto("Bronze", "amarelo");
        } else if (vitoria <= 50) {
            return corTexto("Prata", "ciano");
        } else if (vitoria <= 80) {
            return corTexto("Ouro", "amarelo");
        } else if (vitoria <= 90) {
            return corTexto("Diamante", "azul");
        } else if (vitoria <= 100) {
            return corTexto("Lendário", "verde");
        } else {
            return corTexto("Imortal", "vermelho");
        }
    }

    // Função para calcular o saldo de vitórias e exibir o nível
    public static void partidas(int vitoria, int derrota) {
        int saldoVitorias = vitoria - derrota;
        String nivel = obterCorPorNivel(vitoria);

        // Exibindo a categoria com efeito de digitação
        efeitoDigitar("Avaliando o herói com " + vitoria + " vitórias e " + derrota + " derrotas...\n", 60);
        try {
            Thread.sleep(1000);  // Pequena pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibe o resultado com o saldo e o nível do herói
        System.out.println(corTexto("O Herói tem um saldo de " + saldoVitorias + " e está no nível de " + nivel + "\n", "verde"));
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            efeitoDigitar("Bem-vindo ao Calculador Partidas Rankeadas!\n", 40);

            int numVitorias = 0, numDerrotas = 0;

            // Entrada de vitórias e derrotas com validação
            while (true) {
                try {
                    System.out.print("Digite o número de vitórias (número inteiro): ");
                    numVitorias = Integer.parseInt(scanner.nextLine());

                    System.out.print("Digite o número de derrotas (número inteiro): ");
                    numDerrotas = Integer.parseInt(scanner.nextLine());

                    break;
                } catch (NumberFormatException e) {
                    System.out.println(corTexto("Valor inválido! Por favor, insira um número inteiro.", "vermelho"));
                }
            }

            // Chama a função de cálculo das partidas
            partidas(numVitorias, numDerrotas);

            // Pergunta se o usuário deseja continuar
            System.out.print(corTexto("Deseja Calcular novamente? (s/n): ", "azul"));
            String continuar = scanner.nextLine().toLowerCase();

            if (!continuar.equals("s")) {
                efeitoDigitar("Encerrando o programa... Obrigado por Calcular!", 60);
                break;
            }
        }

        scanner.close();
    }
}


