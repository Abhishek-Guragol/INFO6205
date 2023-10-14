package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class HWQUPC_Solution {

    public static int count(int n){
        UF_HWQUPC uf = new UF_HWQUPC(n, true);
        Random rd = new Random();

        int totalcount = 0;
        while(uf.components() > 1) {
            int num1 = rd.nextInt(n);
            int num2 = rd.nextInt(n);
            if(!uf.connected(num1, num2)) {
                uf.union(num1, num2);
            }
            totalcount += 1;
        }
        return totalcount;
    }

    public static void main(String args[]){
        for(int i = 10; i < 200000; i*=5) {
            System.out.println("n = "+i);
            System.out.println("No. of connections:"+count(i));
            System.out.println("=========================================================");
        }
    }
}
