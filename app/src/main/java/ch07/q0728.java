package ch07;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class q0728 {
  public static void main(String[] args) {
    Frame f = new Frame();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
      }
    });
  }
}

//class EventHandler extends WindowAdapter{
//  public void windowClosing(WindowEvent e) {
//    e.getWindow().setVisible(false);
//    e.getWindow().dispose();
//    System.exit(0);
//  }
//}



/* 메서드가 종료되었을때 저장되어 있는 ?
 * 
 */

