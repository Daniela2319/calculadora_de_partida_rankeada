# Calculadora de Partidas Rankeadas

Este é um programa em Java que simula uma calculadora de partidas ranqueadas, onde o usuário insere o número de vitórias e derrotas de um "herói" e, com base no saldo de vitórias, o programa determina o nível do herói. O nível é exibido com cores no terminal e um efeito de digitação simula o texto sendo impresso de forma gradual.

## Funcionalidades

- Entrada dinâmica para o número de vitórias e derrotas.
- Validação de entrada (somente números inteiros são aceitos).
- Exibição do saldo de vitórias e do nível do herói em cores.
- Efeito de digitação para melhorar a experiência do usuário.
- Sistema de loop que permite inserir vários heróis consecutivamente, até que o usuário decida encerrar o programa.

## Níveis de Heróis

Os níveis dos heróis são baseados no número de vitórias:

- **Ferro**: Menos de 10 vitórias
- **Bronze**: Entre 10 e 20 vitórias
- **Prata**: Entre 21 e 50 vitórias
- **Ouro**: Entre 51 e 80 vitórias
- **Diamante**: Entre 81 e 90 vitórias
- **Lendário**: Entre 91 e 100 vitórias
- **Imortal**: Mais de 100 vitórias

## Cores Utilizadas

O programa utiliza códigos ANSI para colorir o texto no terminal, com as seguintes cores associadas aos níveis:

- **Ferro**: Ciano
- **Bronze**: Amarelo
- **Prata**: Ciano
- **Ouro**: Amarelo claro
- **Diamante**: Azul claro
- **Lendário**: Verde
- **Imortal**: Vermelho

## Requisitos

- Java JDK 8 ou superior
- Um terminal que suporte ANSI escape codes para exibição de cores (a maioria dos terminais modernos suporta).


