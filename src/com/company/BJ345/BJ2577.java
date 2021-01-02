package com.company.BJ345;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int mul = A*B*C;

        String number = Integer.toString(mul); // int -> String으로 형변환
        //System.out.println(number);
        int arr[]= new int[number.length()];

        for(int i=0; i<number.length();i++){
            char num=number.charAt(i); //i번째 인덱스 숫자 받아오기
            arr[i]=Integer.parseInt(String.valueOf(num)); // 배열 arr[i]에 char로 받은 숫자를 다시 int로 변환해서 저장
        }
       int count[]=new int[10];
        for(int k=0;k<10;k++){
            count[k]=0;
        }
        for(int i=0;i<number.length();i++){
            int num = arr[i];
            //System.out.println(num);
            for(int j=0;j<10;j++){
                if(num==j){
                    count[j]++;
                }
            }
        }
        for(int temp:count){
            System.out.println(temp);
        }
    }
}
