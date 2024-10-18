package BaekJoon.BOJSolve;

import java.io.*;
import java.util.Arrays;

public class BOJ_1181 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] words = new String[Integer.parseInt(br.readLine())];

    for (int i = 0; i < words.length; i++) {
      words[i] = br.readLine();
    }

    Arrays.sort(words);

    String tmp;

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < words.length - 1 - i; j++) {
        if (words[j].length() > words[j + 1].length()) {
          tmp = words[j];
          words[j] = words[j + 1];
          words[j + 1] = tmp;
        }
      }
    }

    bw.write(words[0] + "\n");
    for (int i = 1; i < words.length; i++) {
      if (!words[i].equals(words[i -1])) {
        bw.write(words[i] + "\n");
      }
    }
    bw.flush();
  }
}