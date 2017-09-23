/**
 * Created by I6113620 on 22-9-2017.
 */
public class drunkard {
    public static void main(String[] args) {
        randomwalker(10);
        RandomWalkers(200, 100000);
    }

    public static int getDirection() {
        //This is an integer method that returns 1 or 2 or 3 or 4 (they correspond to the 4 directions)
        return (int) (Math.random() * 4 + 1);
    }

    public static double randomwalker(int N) {
        //Starting point is (0,0)
        int x = 0, y = 0;
        while (N > 0) {
            int direction = getDirection();
            if (direction == 1) {
                y++;
            }
            if (direction == 2) {
                y--;
            }
            if (direction == 3) {
                x--;
            }
            if (direction == 4) {
                x++;
            }
            printLocation(x, y);
            N--;
        }
        double randomwalker = computeDistance(x, y);
        System.out.println("You walked " + randomwalker + " in square distance");
        return randomwalker;
    }


    public static void printLocation(int x, int y) {
        System.out.println(x + "," + y);
    }

    public static double computeDistance(int x, int y) {
        int squarex = x * x;
        int squarey = y * y;
        double computeDistance = (squarex + squarey);
        return computeDistance;
    }

    public static void RandomWalkers(int N, int T) {
        double totalDistance = 0;
        double totalMean = 0;
        double iteration = 0;
        int NN = N;
        int TT = T;
        while (T > 1) {
            int x = 0, y = 0;
            N = NN;
            while (N > 0) {
                int direction = getDirection();
                if (direction == 1) {
                    y++;
                }
                if (direction == 2) {
                    y--;
                }
                if (direction == 3) {
                    x--;
                }
                if (direction == 4) {
                    x++;
                }
                N--;
            }
            iteration = computeDistance(x, y);
            totalDistance = totalDistance + iteration;
            T--;
            if (T == 1) {
                totalMean = totalDistance / TT;
                System.out.println("The mean distance is " + totalMean);
                // estimate that for every N++, the distance increases 1

            }
        }
    }
}




