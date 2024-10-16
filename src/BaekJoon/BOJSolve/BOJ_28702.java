package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_28702 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String num1 = br.readLine();
    String num2 = br.readLine();
    String num3 = br.readLine();

    int num4 = 0;

    if (num1.charAt(0) >= '1' && num1.charAt(0) <= '9') {
      num4 = Integer.parseInt(num1) + 3;
    } else if (num2.charAt(0) >= '1' && num2.charAt(0) <= '9') {
      num4 = Integer.parseInt(num2) + 2;
    } else if (num3.charAt(0) >= '1' && num3.charAt(0) <= '9') {
      num4 = Integer.parseInt(num3) + 1;
    }

    if (num4 % 3 == 0 && num4 % 5 == 0) {
      bw.write("FizzBuzz \n");
    } else if (num4 % 3 == 0 && num4 % 5 != 0) {
      bw.write("Fizz \n");
    }else if (num4 % 3 != 0 && num4 % 5 == 0) {
      bw.write("Buzz \n");
    } else {
      bw.write(num4 + "\n");
    }
    bw.flush();
  }
}

