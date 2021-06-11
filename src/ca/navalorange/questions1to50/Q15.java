package ca.navalorange.questions1to50;

public class Q15 {

    public static final int size = 21;

    public static void run() {
        long x = latticePaths();
        System.out.println(x);
    }
    public static long latticePaths() {
        /*
        Did it with math. Every node on the graph's distance calculation is a sum of the 2 nodes (or one node) that precedes it. Giving us this graph.
        1  1  1  1  1
        1  2  3  4  5
        1  3  6 10 15
        1  4 10 20 35
        1  5 15 35 70
        Initially i thought it was a matter of take all the squares in the graph and choose 2, but that was silly, but it worked for the small cases.
        I was really focused on the fact that it had to be choose 2, because in each of the squares you only have 2 options.
        Ended up googling lattice paths to refresh my memory of combinations and pascals triangle
        ended up with when x coord and y coord of location you want to calculate the number of ways to get to a location
        you can calculate this with ((x + y) Choose y)  (it can also be ((x + y) Choose x) the value will be the same, especially for the square where x = y)
        In our case, 40 Choose 20 or N!/((N-K)!K!)
         */
        long[][] graph = new long[size][size];
        graph[0][0] = 1;
        for (int i = 1; i < size; i++) {
            graph[0][i] = 1;
            graph[i][0] = 1;
        }
        for (int h = 1; h < size; h++) {
            graph[h][h] = graph[h-1][h] + graph[h][h-1];
            for (int w = h+1; w < size; w++) {
                graph[h][w] = graph[h-1][w] + graph[h][w-1];
                graph[w][h] = graph[w-1][h] + graph[w][h-1];
            }
        }

        return graph[20][20];
    }
}

