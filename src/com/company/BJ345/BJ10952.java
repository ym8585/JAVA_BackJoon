package com.company.BJ345;

import java.io.*;
import java.util.StringTokenizer;

public class BJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a!=0 && b!=0) {
                int sum = a + b;
                bw.write(sum + "\n");
            }
            if(a+b==0) break;
        }
        bw.flush();

    }
}
