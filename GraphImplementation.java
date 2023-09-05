import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Graph(int vertex){
        for(int i = 0; i<vertex; i++){
            arr.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        arr.get(u).add(v);
        arr.get(v).add(u);
    }
    public void display(){
        for(int i = 0; i<arr.size();i++){
            System.out.println("vertex "+ i);
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.println(arr.get(i).get(j));
            }
        }
    }
}

public class Main{
    public static void main(String args[]){
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.display();
    }
}
