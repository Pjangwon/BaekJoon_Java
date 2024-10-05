package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_4153 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String line;

    while ((line = br.readLine()) != null) {

      StringTokenizer stt = new StringTokenizer(line);

      long A = Long.parseLong(stt.nextToken());
      long B = Long.parseLong(stt.nextToken());
      long C = Long.parseLong(stt.nextToken());

      List<Long> weight = Arrays.asList(A, B, C);

      Collections.sort(weight);

      if (weight.get(0) == 0) {
        break;
      } else if (Math.pow(weight.get(0), 2) + Math.pow(weight.get(1), 2) == Math.pow(weight.get(2), 2)) {
        bw.write("right \n");
      } else {
        bw.write("wrong \n");
      }
    }
    bw.flush();
  }
}