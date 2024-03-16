package Tarefa;

import java.util.ArrayList;
import java.util.List;


public class RallySolver {
    public List<StopPoint> solveRally(int[] stopDistances, int maxDistancePerDay) {
        List<StopPoint> stoppingPoints= new ArrayList<StopPoint>();
        int currentPoint = 0;

        stoppingPoints.add(new StopPoint(currentPoint, stopDistances[0]));


       while (currentPoint < stopDistances[stopDistances.length-1]) {
            int auxCurrentPoint = findNextStopIndex(stopDistances, currentPoint, maxDistancePerDay);

            if (auxCurrentPoint == currentPoint) {
                break;
            }
            else{
                currentPoint = auxCurrentPoint;
                stoppingPoints.add(new StopPoint(currentPoint, stopDistances[currentPoint]));

            }
       }
       return stoppingPoints;
        
    }

    private int findNextStopIndex(int[] stopDistances, int currentIndex, int maxDistancePerDay) {
        int nextIndex = currentIndex + 1;
        int originalDistance = stopDistances[currentIndex];

        while (nextIndex < stopDistances.length && 
            stopDistances[nextIndex] -  originalDistance <= maxDistancePerDay ) {
            
                nextIndex += 1;

        }

        return nextIndex-1;
    }
}
