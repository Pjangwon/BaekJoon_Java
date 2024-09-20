package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1546_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine()); //시험과목 개수 입력
    float[] scoreArr = new float[N]; //점수 배열 생성
    float avgScore;
    float sumScore = 0;
    float maxScore = 0;
    StringTokenizer score = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) { //점수 입력
      scoreArr[i] = Float.parseFloat(score.nextToken());
      if (scoreArr[i] > maxScore) {
        maxScore = scoreArr[i];
      }
    }

    for (int i = 0; i < N; i++) { //배열 재정렬(평균 조작)
      scoreArr[i] = scoreArr[i] / maxScore * 100;
      sumScore += scoreArr[i];
    }

    avgScore = sumScore / N;

    bw.write(avgScore + "\n");
    bw.flush();
  }
}