package com.driver;

import java.util.*;

import com.utilities.Dijkastras;

public class Graph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Scanner sr=new Scanner(System.in);
		int [][]graph=new int[n][n];
		System.out.println("enter graph");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				graph[i][j]=sr.nextInt();
				if(graph[i][j]<=0){
					graph[i][j]=999;
					
				}
			}
		}
		for(int i=0;i<n;i++){
			Dijkastras.dij(graph, n, i);
		}
		System.out.println("shortest path graph is: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(graph[i][j] +" ");
				
			}
			System.out.println();
		}
	}

}/*0 2 1 0 0
2 0 3 4 0
1 3 0 1 2
0 4 1 0 3
0 0 2 3 0*/
