package BaekJoon.Buffered;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10813_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer NM = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(NM.nextToken());
    int M = Integer.parseInt(NM.nextToken());

    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = i+1;
    }

    for (int i = 0; i < M; i++) {
      StringTokenizer changeNum = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt(changeNum.nextToken());
      int num2 = Integer.parseInt(changeNum.nextToken());

      int temp = 0;
      temp = arr[num1-1];
      arr[num1-1] = arr[num2-1];
      arr[num2-1] = temp;
    }

    for (int i =0; i<N; i++) {
      bw.write(arr[i] + " ");
    }
    bw.flush();
  }
}