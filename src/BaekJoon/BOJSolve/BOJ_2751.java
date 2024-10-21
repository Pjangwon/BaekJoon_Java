package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_2751 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }

    Collections.sort(list);

    for (int num : list) {
      bw.write(num + "\n");
    }
    bw.flush();
  }
}