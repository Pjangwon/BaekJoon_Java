package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_25206 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    double sumScore = 0;
    double subjectNum = 0;

    for (int i = 0; i < 20; i++) {

      String subject = br.readLine();

      float grade = Float.parseFloat(subject.split(" ")[1]);
      String score = subject.split(" ")[2];

      switch (score) {
        case "A+":
          sumScore += 4.5 * grade;
          subjectNum += grade;
          break;
        case "A0":
          sumScore += 4 * grade;
          subjectNum += grade;
          break;
        case "B+":
          sumScore += 3.5 * grade;
          subjectNum += grade;
          break;
        case "B0":
          sumScore += 3 * grade;
          subjectNum += grade;
          break;
        case "C+":
          sumScore += 2.5 * grade;
          subjectNum += grade;
          break;
        case "C0":
          sumScore += 2 * grade;
          subjectNum += grade;
          break;
        case "D+":
          sumScore += 1.5 * grade;
          subjectNum += grade;
          break;
        case "D0":
          sumScore += 1 * grade;
          subjectNum += grade;
          break;
        case "F":
          sumScore += 0 * grade;
          subjectNum += grade;
          break;
      }

    }
    bw.write(sumScore / subjectNum + "\n");
    bw.flush();
  }
}
