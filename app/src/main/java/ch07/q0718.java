package ch07;

public class q0718 {
  static void action(Robot r) {
    if (r instanceof DanceRobot) {
      DanceRobot danceRobot = new DanceRobot();
      danceRobot.dance();
    } else if (r instanceof SingRobot) {
      SingRobot singRobot = new SingRobot();
      singRobot.sing();
    } else if (r instanceof DrawRobot) {
      DrawRobot drawRobot = new DrawRobot();
      drawRobot.draw();
    } else {
      System.out.println("None");
    }

  }

  public static void main(String[] args) {
    Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
    for(int i=0; i< arr.length;i++)
      action(arr[i]);
  } // main
}
class Robot {}
class DanceRobot extends Robot {
  void dance() {
    System.out.println("춤을 춥니다.");
  }
}
class SingRobot extends Robot {
  void sing() {
    System.out.println("노래를 합니다.");
  }
}
class DrawRobot extends Robot {
  void draw() {
    System.out.println("그림을 그립니다.");
  }
}