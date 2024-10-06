package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_1978 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    int n = Integer.parseInt(br.readLine());

    StringTokenizer stt = new StringTokenizer(br.readLine());
    int count = 0;

    for (int i = 0; i < n; i++) {
      int isPrimeNum = Integer.parseInt(stt.nextToken());
      if (isPrime(isPrimeNum)) {
        count++;
      }
    }

    bw.write(count + "");
    bw.flush();
  }

  public static boolean isPrime(int isPrimeNum) {

    if (isPrimeNum == 2) {
      return true;
    } else if (isPrimeNum == 1) {
      return false;
    }

    for (int i = 2; i < isPrimeNum; i++) {
      if (isPrimeNum % i == 0) {
        return false;
      }
    }
    return true;
  }
}