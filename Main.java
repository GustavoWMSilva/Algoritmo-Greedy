package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<int[]> testCases = new ArrayList<>();
        // Caso simples
        int[] testCase1 = { 0, 200, 400, 600, 800 };
        testCases.add(testCase1);

        // Caso com pontos de parada próximos
        int[] testCase2 = { 0, 100, 150, 250, 350, 400, 500 };
        testCases.add(testCase2);

        // Caso com pontos de parada mais distantes
        int[] testCase3 = { 0, 400, 800, 1200, 1600 };
        testCases.add(testCase3);

        // Caso com pontos de parada esparsos
        int[] testCase4 = { 0, 100, 500, 800, 1100, 1500, 1800 };
        testCases.add(testCase4);

        // Caso com ponto de parada no final da trilha
        int[] testCase5 = { 0, 200, 400, 600, 800, 1000 };
        testCases.add(testCase5);

        int maxDistancePerDay = 300;

        RallySolver solver = new RallySolver();
        int j = 0;
        for (int[] i : testCases) {

            List<StopPoint> selectedStops = solver.solveRally(i, maxDistancePerDay);
            System.out.println("Caso: "+j);
            System.out.println("\n==============================");
            for (StopPoint stop : selectedStops) {
                
                System.out.println("Ponto de parada na posição: " + stop.position);
            }
            System.out.println("==============================\n");
            j++;
        }
    }
}
