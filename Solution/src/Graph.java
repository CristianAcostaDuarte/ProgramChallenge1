
import java.util.*;


 public class Graph {

    public class Edge {
        int source;
        int destination;
        int weight;
    
     public Edge( int source, int destination, int weight) {
    
        this.source = source;
        this.destination = destination;
        this.weight = weight;
     }
     }


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
    
                if(i!=j){
    
    
    
                    if((NodeListHash.get(i).getValue() >= 0) & (NodeListHash.get(j).getValue() >= 0)){
    
    
                        if((NodeListHash.get(i).getUp().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getUp().getId2()==NodeListHash.get(j).getId2())){
    
                            m=NodeListHash.get(i).getValue()-NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
     
    
                        }else if((NodeListHash.get(i).getDown().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getDown().getId2()==NodeListHash.get(j).getId2())){
    
                            m=NodeListHash.get(i).getValue()-NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                        }else if((NodeListHash.get(i).getLeft().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getLeft().getId2()==NodeListHash.get(j).getId2())){
    
                            m=NodeListHash.get(i).getValue()-NodeListHash.get(j).getValue();
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                        }else if((NodeListHash.get(i).getRight().getId1()==NodeListHash.get(j).getId1()) & (NodeListHash.get(i).getRight().getId2()==NodeListHash.get(j).getId2())){
    
                            m=NodeListHash.get(i).getValue()-NodeListHash.get(j).getValue();                        
                            Edge edge = new Edge(NodeListHash.get(i).getValue(), NodeListHash.get(j).getValue(), m);
                            adjacencylist[i].addFirst(edge); //for directed graph
    
    
                            
    
                        }
    
    
                    }
    
    
                
    
            }
    
            
            
        }
        
           
    }
    
 }

 public void printGraph(){
    for (int i = 0; i <vertices ; i++) {
        LinkedList<Edge> list = adjacencylist[i];
        for (int j = 0; j <list.size() ; j++) {
            System.out.println("Node-" + i + " is connected to " +
            list.get(j).destination + " with weight " + list.get(j).weight);
        }
    }
}

public LinkedList<Edge> getAdjacencylist(){ return this.getAdjacencylist();}
 }



