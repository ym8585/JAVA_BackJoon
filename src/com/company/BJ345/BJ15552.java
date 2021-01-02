package com.company.BJ345;

import java.io.*;
import java.util.StringTokenizer;

public class BJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        for(int i = 0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = a+b;

            bw.write(sum+"\n");
        }
        bw.flush();
    }
}
// 버퍼(buffer) : 데이터를 다흔 한곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시
// 메모리 영역, 입출력 속도 향상
//버퍼 플러시(buffer flush) : 버퍼에 남아있는 데이터를 출력시킴(버퍼를 비우는 동작)
//BufferedReader : 버퍼를 이용한 입력
//BufferedWriter : 버퍼를 이용한 출력
