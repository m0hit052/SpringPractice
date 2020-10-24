package src;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
class Graph {
    int v;
    List<List<Integer>> adj;
    Graph(int x) {
        v = x;
        adj = new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v) {
        adj.get(u).add(v);
        adj.get(v).get(u);
    }
}
public class Question {
    static int count=0;
    static boolean found = false;
    private static int helper(Graph g) {

    }
    private static void dfs(boolean[] visited,int i,Graph g,int end) {
        if(found) {
            return;
        }
        visited[i] =true;
        for(Integer key : g.adj.get(i)) {
            if(key==end) {
                found=true;
            }
            if(!visited[key]) {
                dfs(visited, key, g, end);
            }
            if(found) {
                if(g.adj.get(key).size()==1) {
                    count++;
                }
            }
        }
    }
    private static String getString() {
        int n = 10000;
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        StringBuilder sb  = new StringBuilder();
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String primeString = getString();
        System.out.println(primeString);
        System.out.println(primeString.substring(n,n+5));
    }
}
