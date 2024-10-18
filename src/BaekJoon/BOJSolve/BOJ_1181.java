package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1181 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] words = new String[Integer.parseInt(br.readLine())];

    for (int i = 0; i < words.length; i++) {
      words[i] = br.readLine();
    }

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

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < words.length - 1 - i; j++) {
        if (words[j].length() == words[j + 1].length() && words[j].compareTo(words[j + 1]) > 0) {
          tmp = words[j];
          words[j] = words[j + 1];
          words[j + 1] = tmp;
        }
      }
    }

    for (String word : words) {
      bw.write(word + "\n");
    }
    bw.flush();
  }
}
