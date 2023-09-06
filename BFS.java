import java.util.*;
import java.util.LinkedList;

class Graph{
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Graph(int v){
        for(int i = 0; i<v; i++){
            arr.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        arr.get(u).add(v);
        arr.get(v).add(u);
    }
    public void display(){
        for(int i = 0; i<arr.size(); i++){
            System.out.println("Vertex "+ i);
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void BFS(int v){
        boolean[] visit = new boolean[arr.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        visit[v] = true;
        while(q.size() != 0) {
            int ver = q.remove();
            System.out.print(ver + " ");
            for (int i = 0; i < arr.get(ver).size(); i++) {
                if (!visit[arr.get(ver).get(i)]) {
                    q.add(arr.get(ver).get(i));
                    visit[arr.get(ver).get(i)] = true;
                }
            }
        }
    }
}

public class BFS{
    public static void main(String args[]){
        Graph g = new Graph(5);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.display();
        System.out.println("BFS");
        g.BFS(1);
    }
}
