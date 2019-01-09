class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashSet<Integer>nodes=new HashSet<>();
        for (int i = 0; i<graph.length; i++){
            explore(i,i,graph, 0, nodes, new ArrayList<>());   
        }
        return new ArrayList<Integer>(nodes);
    }
 
    public static void explore(int start, int current, int [][]graph, int n, HashSet<Integer>nodes, ArrayList<Integer>visited){
        System.out.print("-->"+current);
        if (graph[current].length==0){
            nodes.add(start);
                 System.out.print("END"+n);

            return;  
        }
        if (n>graph.length)return;
            for (int j=0; j<graph[current].length; j++){
                 if(visited.contains(graph[current][j]))continue;
                 ArrayList<Integer>newvisited=new ArrayList<>(visited);
                 newvisited.add(graph[current][j]);
                 explore(start, graph[current][j], graph, n+1,nodes,newvisited);
            }
        
       
    }
}
