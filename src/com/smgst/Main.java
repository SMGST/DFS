package com.smgst;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int [][]Graph = {{0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}};

        DFS(Graph,7,4);

    }
    public static int [] visited = {0,0,0,0,0,0,0};
    public static void DFS(int [][]Graph,int n,int start){
        int j;

        if(visited[start]==0){
            System.out.print( start + "\t");
            visited[start]=1;
            for(j=1;j<n;j++){
                if(Graph[start][j] == 1 && visited[j] == 0){
                    DFS(Graph,n,j);
                }
            }
        }
    }
}
