# README.md

## Exercício Greedy - Rally pelo Deserto de Dakkar

Este repositório contém a implementação de um algoritmo greedy para resolver o problema do rally pelo deserto de Dakkar, conforme proposto na disciplina de Projeto e Otimização de Algoritmos. O objetivo é determinar o menor número de paradas necessárias para completar o rally, respeitando a distância máxima que pode ser percorrida em um dia.

### Objetivos do Trabalho

1. Desenhar, analisar e implementar um algoritmo greedy.
2. Determinar se é possível chegar ao próximo ponto de parada antes do anoitecer.
3. Minimizar o número de paradas durante o rally.

### Problema

Você e um grupo de amigos deseja realizar um rally pelo deserto de Dakkar. Os regulamentos da corrida determinam que os times podem viajar apenas durante o dia. Após analisar o mapa, seus colegas identificaram um conjunto de pontos de parada. O desafio é determinar se é possível chegar ao próximo ponto de parada antes do anoitecer e encontrar o menor número de paradas necessárias para completar o rally.

#### Premissas

- A trilha do rally é modelada como um segmento de linha de comprimento \( L \).
- A distância máxima que pode ser percorrida em um dia é \( d \) quilômetros.
- Os pontos de parada estão localizados a distâncias \( x_1, x_2, \ldots, x_n \) do ponto de partida.
- Um conjunto de pontos de parada é válido se a distância entre cada par adjacente for no máximo \( d \).

### Algoritmo

1. **Inicialização**:
   - Ordenar os pontos de parada em ordem crescente de distância.
   - Adicionar o ponto de partida como o primeiro ponto de parada.

2. **Iteração**:
   - Para cada ponto de parada, verificar se é possível chegar ao próximo ponto de parada dentro da distância máxima \( d \).
   - Se for possível, continuar para o próximo ponto.
   - Se não for possível, adicionar o ponto atual como uma parada e reiniciar a verificação a partir deste ponto.

3. **Conclusão**:
   - Adicionar a linha de chegada como o último ponto de parada.

### Análise do Algoritmo

O algoritmo proposto é ótimo no sentido de que encontra o menor conjunto de pontos de parada válidos que completam o rally. Ele garante que cada ponto de parada selecionado maximiza a distância percorrida, minimizando assim o número total de paradas.

### Implementação e Tempo de Execução

#### Exemplo de Casos de Teste

1. **Caso de Teste 1**:
   - Pontos de parada: {0, 200, 400, 600, 800, 1000}
   - Distância máxima por dia: 200 km

2. **Caso de Teste 2**:
   - Pontos de parada: {0, 100, 200, 300, 400, 500, 600, 700, 800}
   - Distância máxima por dia: 100 km

3. **Caso de Teste 3**:
   - Pontos de parada: {0, 500, 1000, 1500}
   - Distância máxima por dia: 500 km

4. **Caso de Teste 4**:
   - Pontos de parada: {0, 200, 400, 600, 800, 1000, 1200}
   - Distância máxima por dia: 400 km

#### Saída Esperada

Para cada caso de teste, o algoritmo calcula o menor número de paradas necessárias e as posições dos pontos de parada. A saída inclui:

- Chegada \( L \)
- Distância \( d \)
- Quantidade de pontos de parada
- Tempo de execução em nanossegundos
- Posições dos pontos de parada

#### Representação Visual

Para ilustrar a solução, considere a representação visual de um dos casos de teste:

##### Exemplo de Saída

```plaintext
Caso: 0
==============================
Chegada L = 1000
Distancia D = 200
Quantidade de Pontos: 5
Tempo de execução em nanossegundos: 123456
Ponto de parada na posição: 0 Km: 0
Ponto de parada na posição: 1 Km: 200
Ponto de parada na posição: 2 Km: 400
Ponto de parada na posição: 3 Km: 600
Ponto de parada na posição: 4 Km: 800
==============================
```

### Conclusão

O algoritmo greedy desenvolvido resolve eficientemente o problema de encontrar o menor número de paradas para o rally pelo deserto de Dakkar, respeitando a distância máxima percorrida por dia. A implementação em Java foi testada com vários casos de teste, confirmando a eficácia do algoritmo.

### Contato

Para mais informações, entre em contato com os desenvolvedores.

---

Este trabalho foi realizado como parte da disciplina de Projeto e Otimização de Algoritmos, sob a orientação do professor Rafael Scopel.
