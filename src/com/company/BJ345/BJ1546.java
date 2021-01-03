package com.company.BJ345;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine()); //과목수

        double arr []=new double[num]; //과목수만큼 크기의 배열 생성

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){             //배열에 점수 넣기
            int score = Integer.parseInt(st.nextToken());
            arr[i]=score;
        }

        double max=0;
        int maxIndex=0;
        for(int j=0;j<num;j++){
            if(arr[j]>max){
                max=arr[j];
                maxIndex=j;
            }
        }
        //System.out.println(max+" "+maxIndex);

        for(int k=0;k<num;k++){        //점수 조작
            arr[k]=(arr[k]/max)*100;
        }

//        for(double temp:arr){
//            System.out.println(temp);
//        }

        //평균 구하기
        double sum=0;
        for(int x=0;x<num;x++){
            sum=sum+arr[x];
        }
        double mean=sum/num;

        System.out.println(mean);

    }
}
