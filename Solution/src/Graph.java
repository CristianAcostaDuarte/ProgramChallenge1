
import java.util.*;


 public class Graph {




    int vertices;
    LinkedList<Edge> [] adjacencylist;

 public Graph(int vertices) {
    this.vertices = vertices;
    this.adjacencylist = new LinkedList[vertices];


 //initialize adjacency lists for all the vertices
 for (int i = 0; i <vertices ; i++) {
    this.adjacencylist[i] = new LinkedList<>();
 }
 

}

 public void addEgde(HashMap<Integer,Node> NodeListHash) {

    int m=0;
  

    for( int i=0;i< NodeListHash.size();i++){


            for (int j = 0; j< NodeListHash.size();j++ ){
    
                
    
    
    
                    if((NodeListHash.get(i).getValue() >= 0) & (NodeListHash.get(j).getValue() >= 0)){
    
    
                        if((NodeListHash.get(i).getUp().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getUp().getId2()==NodeListHash.get(j).getId2())){
    
                            m=-NodeListHash.get(i).getValue()+NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
     
    
                        }else if((NodeListHash.get(i).getDown().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getDown().getId2()==NodeListHash.get(j).getId2())){
    
                            m=-NodeListHash.get(i).getValue()+NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                        }else if((NodeListHash.get(i).getLeft().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getLeft().getId2()==NodeListHash.get(j).getId2())){
    
                            m=-NodeListHash.get(i).getValue()+NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                        }else if((NodeListHash.get(i).getRight().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getRight().getId2()==NodeListHash.get(j).getId2())){
    
                            m=-NodeListHash.get(i).getValue()+NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                            
    
                        }
    
    
                    }
    
    
                
    
            }
    
            
            
        }
            
 }

 public void printGraph(){
    for (int i = 0; i <vertices ; i++) {
        LinkedList<Edge> list = adjacencylist[i];
        for (int j = 0; j <list.size() ; j++) {
            System.out.println("Node-" + i +" has a head-> "+ list.get(j).source+ " and is connected to " +
            list.get(j).destination + " with weight " + list.get(j).weight);
            
        }
    }
    
    //System.out.println("The size of the linked list is :"+ this.adjacencylist[0].get(1).source);
}

public LinkedList<Edge> getAdjacencylist(){ return this.getAdjacencylist();}


//BFS to print the shortest path 

public int[] BFS(int v)
    {
        int n = this.adjacencylist.length;

        // dist[i] is the distance from v to i
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // seen[i] is true if there is a path from v to i
        boolean[] seen = new boolean[n];

        dist[v] = 0;

        // determine n-1 paths from v
        for (int j = 0; j < n; j++) {
            // choose closest unseen vertex
            int u = -1;

        
            for (int k = 0; k < n; k++) {
                if (!seen[k]) {
                    // check if u needs updating
                    if (u < 0 || dist[k] < dist[u]) {
                        u = k;
                    }
                }
            }

            if (u < 0 || dist[u] == Integer.MAX_VALUE) {
                break;
            }

            // at this point dist[u] is the cost of the
            // shortest path from v to u

            // set seen[u] to true and update the distances
            seen[u] = true;

            for (Edge e : this.adjacencylist[u]) {

                int nbr = e.destination;
                int altDist = dist[u] + e.weight;
                dist[nbr] = Math.min(dist[nbr], altDist);
            }


        }

        return dist;

    }

 }

            






    

 





