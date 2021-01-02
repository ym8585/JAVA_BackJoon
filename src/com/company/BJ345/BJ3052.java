package com.company.BJ345;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[]=new int[10];

        for(int i=0;i<10;i++){
            int num=Integer.parseInt(br.readLine());
            arr[i]=num%42;
        }

    }
}
