package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1157 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String word = br.readLine().toUpperCase();
    int[] count = new int[26];
    int maxCount = 0;
    char result = '?';

    for (int i = 0; i < word.length(); i++) {
      count[word.charAt(i) - 'A']++;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxCount) {
        maxCount = count[i];
        result = (char)(i + 'A');
      } else if (count[i] == maxCount) {
        result = '?';
      }
    }
    bw.write((char)result + "\n");
    bw.flush();
  }
}