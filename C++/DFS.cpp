#include <iostream>
#include <stdio.h>

using namespace std;

	int Graph[7][7] =  {{0,0,0,0,0,0,0},
						{0,0,1,1,0,0,0},
						{0,1,0,0,1,0,0},
						{0,1,0,0,1,0,0},
						{0,0,1,1,0,1,1},
						{0,0,0,0,1,0,0},
						{0,0,0,0,1,0,0}
	};
	const int n = 7;
	int visited[n] = {0,0,0,0,0,0,0};


void DFS(int start){
	int j;

	if(visited[start]==0){
		cout << start << "\t";
		visited[start]=1;
		for(j=1;j<n;j++){
			if(Graph[start][j] == 1 && visited[j] == 0){
				 DFS(j) ;
			}
		}
	}


}

int main(){


	DFS(1);


	return 0;
}
