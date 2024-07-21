#include<iostream>
using namespace std;
#define n 8;
#include<climits>
#define INF INT_MAX;


int shortestpath(int graph[n][n]){
    int dist[n];
    dist[n-2]=0;
    for(int i = n-2;i>=0;i--){
        dist[i]=INF;
        for(int j=0;j<n;j++){
            if(graph[i][j]==INF)
                continue;
            dist[i]=min(dist[i],graph[i][j]+dist[j]);
        }
    }
}