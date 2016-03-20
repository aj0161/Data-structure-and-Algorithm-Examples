/**
 // Bellman-Ford's single source shortest path. The
 // function also detects negative weight cycle
 */
public class BellmanFordAlgorithm extends AlgorithmExamples {

    private static final int infinity = 1000;
    private int[] Distances;
    private int[][] vertices;
    private int source;

    public BellmanFordAlgorithm(int[][] vertices, int source)
    {
        this.vertices = vertices;
        this.source = source;
    }
    //Find the single shortest path using bellman Ford Algorithm.
    public int[][] Implementation()
    {
        System.out.println("Num of vertex: "+this.vertices.length);
        Distances = new int[this.vertices.length];
        //setting all the values to infinity
        for (int distance =0; distance < Distances.length; ++distance) {
            Distances[distance] = infinity;
        }

         Distances[this.source]=0;

        int UVLength = vertices[0].length;
        /*
        repeatedly update the distance |V|-1 times where |V| represents
        number of vertices
        */
        //step 1: loop through all the vertices -1.
        for ( int distanceIterator =1; distanceIterator <= vertices.length-1; distanceIterator++) {

            //step 2: loop through all the source vertex
            for (int from =0; from < UVLength; from++) {

                //step 3:loop through all the destination vertex
                for(int to=0; to < UVLength;to++) {

                    if (vertices[from][to] != infinity){

                        String fs = String.format("distanceIterator: %d " +"(from,to)---> (%d"+ ",%d)", distanceIterator, from,to );
                        System.out.println(fs+ " ==== "+vertices[from][to]);
                        //Relax all edges |V| - 1 times
                        relax(from,to);
                    }
                }
            }
        }

        //negative cycle check
        if(IsThereNegativeCycle(UVLength)) {
            System.out.println("The Graph contains negative egde cycle");
        }
        else
        {
            System.out.println("No negative egde cycle found !!");
        }

        for (int vertex = 0; vertex < vertices.length; vertex++)
        {
            System.out.println("distance of source  " + source + " to "
                    + vertex + " is " + Distances[vertex]);
        }
        return vertices;
    }

    // relax u & v
    private void relax(int from, int to)
    {
        if(Distances[to] > Distances[from] + this.vertices[from][to]) {

            Distances[to] = Distances[from] + this.vertices[from][to];
            System.out.println("Relaxing-->Distance"+Distances[to]+"\n" );
        }
        else
        {
            System.out.print(String.format("Distance[to] --> %d is less than" + "%d", from ,to));
            System.out.print("+("+Distances[to]+ ")"+"\n" );
        }

    }

    private boolean IsThereNegativeCycle(int UVLength)
    {
        for (int from =0; from < UVLength; from++) {
            for(int to=0; to < UVLength;to++) {
                if (vertices[from][to] != infinity){
                    if(Distances[to] > Distances[from] + this.vertices[from][to]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void TimeAndSpaceCOmplexity()
    {

    }
}
