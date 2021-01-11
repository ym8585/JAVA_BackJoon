package com.company.BJ345;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[]=new int[10];

        //나머지 값 배열에 넣는다.
        for(int i=0;i<10;i++){
            int num=Integer.parseInt(br.readLine());
            arr[i]=num%42;
        }

        //배열 오름차순 정렬
       Arrays.sort(arr);

        int result = 0;
        for(int i=0;i<10;i++){
            if(i<9){
                if(arr[i]!=arr[i+1]){
                    result++;
                }
            }
        }

        System.out.println(result+1);

    }
}
