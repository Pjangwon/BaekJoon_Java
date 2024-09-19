package BaekJoon.OldSolve;

import java.util.Scanner;

public class Dice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dice1 = sc.nextInt();
    int dice2 = sc.nextInt();
    int dice3 = sc.nextInt();

    int reward = 0;

    if ((dice1 == dice2) && (dice2 == dice3)) { //주사위가 모두 같은 경우
      reward = 10000 + (dice1 * 1000);
    } else if ((dice1 != dice2) && (dice2 != dice3) && (dice1 != dice3)) { //주사위가 모두 다른 경우
      if ((dice1 > dice2) && (dice1 > dice3)) {
        reward = (dice1 * 100);
      } else if ((dice2 > dice1) && (dice2 > dice3)) {
        reward = (dice2 * 100);
      } else if ((dice3 > dice1) && (dice3 > dice2)) {
        reward = (dice3 * 100);
      }
    } else {
      if (dice1 == dice2) { // 주사위가 2개만 같은 경우
        reward = 1000 + dice1 * 100;
      } else if (dice2 == dice3) {
        reward = 1000 + dice2 * 100;
      } else if (dice3 == dice1) {
        reward = 1000 + dice3 * 100;
      }
    }
    System.out.println(reward);
  }
}
