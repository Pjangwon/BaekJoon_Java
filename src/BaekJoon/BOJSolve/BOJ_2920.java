package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2920 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String ascending = "1 2 3 4 5 6 7 8";
    String descending = "8 7 6 5 4 3 2 1";

    String music = br.readLine();

    if (music.equals(ascending)) {
      bw.write("ascending");
    } else if (music.equals(descending)) {
      bw.write("descending");
    } else {
      bw.write("mixed");
    }

    bw.flush();
  }
}