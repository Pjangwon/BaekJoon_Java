package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_30802 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long n = Long.parseLong(br.readLine());

    long[] sizeArr = new long[6];
    StringTokenizer clothes = new StringTokenizer(br.readLine());
    for (int i = 0; i < sizeArr.length; i++) {
      sizeArr[i] = Long.parseLong(clothes.nextToken());
    }

    StringTokenizer tp = new StringTokenizer(br.readLine());

    long t = Long.parseLong(tp.nextToken());
    long p = Long.parseLong(tp.nextToken());

    long countClothesBundle = 0;

    for (int i = 0; i < sizeArr.length; i++) {
      if (sizeArr[i] % t == 0) {
        countClothesBundle += sizeArr[i] / t;
      } else {
        countClothesBundle += (sizeArr[i] / t) + 1;
      }
    }

    bw.write(countClothesBundle + "\n");
    bw.write(n / p + " " + n % p);

    bw.flush();
  }
}