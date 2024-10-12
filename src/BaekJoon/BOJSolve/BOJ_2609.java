package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2609 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();

    int num1 = Integer.parseInt(st.split(" ")[0]);
    int num2 = Integer.parseInt(st.split(" ")[1]);

    int gcd = gcd(num1, num2);

    bw.write(gcd + "\n");
    bw.write(num1 * num2 / gcd + "\n");

    bw.flush();
  }

  private static int gcd(int num1, int num2) {

    int temp = num1 % num2;

    if (temp == 0) {
      return num2;
    }
    return gcd(num2, temp);
  }
}
