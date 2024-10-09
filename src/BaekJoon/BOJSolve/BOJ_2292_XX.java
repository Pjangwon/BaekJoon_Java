package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2292_XX {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long roomNum = Long.parseLong(br.readLine());
    long roomCount = 1;
    long divNum = 1;


    if (roomNum == 1) {
      bw.write(1 + "\n");
    } else {
      while (divNum < roomNum) {
        divNum += 6 * roomCount;
        roomCount++;
      }
      bw.write(roomCount + "\n");
    }
    bw.flush();
  }
}