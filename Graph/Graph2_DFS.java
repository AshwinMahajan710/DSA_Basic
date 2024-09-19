import java.util.*;

public class Graph2_DFS {
    public static void main(String[] args) {
        
        // The total no of nodes in our graph
        int noOfNodes = 7;

        // Each sublist
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0,5));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,6));
        ArrayList<Integer> list7 = new ArrayList<>(Arrays.asList());
        
        // Formation of complete adjacecy list
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);
        adj.add(list5);
        adj.add(list6);
        adj.add(list7);
        
        // Create the class object and directly get the output
        Solution sol = new Solution();
        ArrayList<Integer> ans = sol.dfsOfGraph(noOfNodes, adj);    
        
        // The final answer
        System.out.print("The final DFS answer of the graph is :- ");
        for(int ele: ans){
            System.out.print(ele + " ");
        }
    }
}

class Solution {
    
    public void dfs(int node,ArrayList<Integer> ans,boolean []visited,ArrayList<ArrayList<Integer>> adj){
        ans.add(node);
        visited[node] = true;
        ArrayList<Integer> list = adj.get(node);
        for(int ele: list){
            if(!visited[ele]){
                dfs(ele,ans,visited,adj);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<> ();
        boolean [] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,ans,visited,adj);
            }
        }
        return ans;
    }
}
