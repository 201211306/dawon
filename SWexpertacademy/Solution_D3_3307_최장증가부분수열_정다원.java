package com.ssafy.step1.dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3307_최장증가부분수열_정다원 {
	static int T;
	static int N;
	static int[] arr;
	static int[] DP;
	static int MAX;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(bf.readLine());
		for(int i = 1 ; i <=T ; i++) {
			N = Integer.parseInt(bf.readLine());
			arr = new int[N];
			DP = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			DP[0] = 1;
			MAX = 1;
			for(int j = 1 ; j < N; j++) {
				DP[j] = 1;
				for (int k = j-1; k >= 0; k--) {
					if(arr[j] > arr[k]) {
						if(DP[j] < DP[k] + 1) {
							DP[j] = DP[k] + 1;
						}
					}
				}
				
				if(DP[j] > MAX) MAX = DP[j];
			}
			
			
			System.out.println("#"+ i + " " + MAX);
		}
	}
}
