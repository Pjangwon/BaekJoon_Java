package BaekJoon.BOJSolve;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1003_X {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine()); //테스트 케이스

    for (int i = 0; i < N; i++) {
      int fibonacciNum = Integer.parseInt(br.readLine());
      int[] arr = new int[2];
      StringTokenizer st = new StringTokenizer(fibonacci(fibonacciNum));
      arr[0] = Integer.parseInt(st.nextToken());
      arr[1] = Integer.parseInt(st.nextToken());
      bw.write(arr[0] + " " + arr[1] + "\n");
    }
    bw.flush();

  }

  public static String fibonacci(int fibonacciNum) {

    int count0 = 0;
    int count1 = 0;

    if (fibonacciNum == 1) {
      count1++;
      return count0 + " " + count1;
    } else if (fibonacciNum == 0) {
      count0++;
      return count0 + " " + count1;
    } else {
      String result1 = fibonacci(fibonacciNum - 1);
      StringTokenizer st1 = new StringTokenizer(result1, " ");
      count0 += Integer.parseInt(st1.nextToken());
      count1 += Integer.parseInt(st1.nextToken());

      String result2 = fibonacci(fibonacciNum - 2);
      StringTokenizer st2 = new StringTokenizer(result2, " ");
      count0 += Integer.parseInt(st2.nextToken());
      count1 += Integer.parseInt(st2.nextToken());

      return count0 + " " + count1;
    }
  }
}
