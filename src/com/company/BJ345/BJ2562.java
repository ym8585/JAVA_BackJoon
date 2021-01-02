package com.company.BJ345;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int [] arr = new int[9];

        for(int i=0;i<9;i++){
            st= new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            arr[i]= a;
        }
        int max=arr[0];
        int index=0;
        for(int j=0;j<9;j++){
            if(arr[j]>max) {
                max=arr[j];
                index=j;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
