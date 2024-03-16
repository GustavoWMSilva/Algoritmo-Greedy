package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<int[]> testCases = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        
        int[] testCase1 =  {0, 200, 400, 600, 800, 1000};;
        testCases.add(testCase1);

        int[] testCase2 = {0, 100, 200, 300, 400, 500, 600, 700, 800};
        testCases.add(testCase2);

        int[] testCase3 = {0, 500, 1000, 1500};
        testCases.add(testCase3);

        int[] testCase4 = {0, 200, 400, 600, 800, 1000, 1200};
        testCases.add(testCase4);

        d.add(200 );
        d.add(100  );
        d.add(500  );
        d.add(400  );


        RallySolver solver = new RallySolver();
        int j = 0;
        for (int i = 0; i < testCases.size(); i++ ) {

            List<StopPoint> selectedStops = solver.solveRally(testCases.get(i), d.get(i));
            System.out.println("Caso: "+j);
            System.out.println("\n==============================");
            System.out.println("Chegada L = " + testCases.get(i)[testCases.get(i).length-1]+
                                "\nDistancia D = "+d.get(i)+
                                "\nQuantidade de Pontos: "+ (testCases.get(i).length-1));
            for (StopPoint stop : selectedStops) {
                
                System.out.println("Ponto de parada na posição: " + stop.position + " Km: "+testCases.get(i)[stop.position]);
            }
            System.out.println("==============================\n");
            j++;
        }
    }
}
