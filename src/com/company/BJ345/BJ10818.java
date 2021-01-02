package com.company.BJ345;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        int [] arr = new int[num];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            //int a = Integer.parseInt(st.nextToken());
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int max=arr[0];
        int min=arr[0];
        for(int j=0;j<num;j++){
            if(arr[j]>max) max=arr[j];
            if(arr[j]<min) min=arr[j];
        }
        System.out.println(min + " "+ max);


    }
}
