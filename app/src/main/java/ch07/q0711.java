package ch07;

class MyTv3 {
  boolean isPowerOn;
  int channel;
  int volume;
  int prevChannel;
  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public int getChannel() {
    return channel;
  }
  public void setChannel(int channel) {
    this.prevChannel = this.channel;
    this.channel = channel;
  }
  public int getVolume() {
    return volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void gotoPrevChannel() {
    int temp = this.channel;
    this.channel = this.prevChannel;
    this.prevChannel = temp;
  }
}

public class q0711 {
  public static void main(String args[]) {
    MyTv3 t = new MyTv3();
    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
  }
}

/* 7-12 : e
 * 7-13 : 안에 있는것을 보여주지 않으면서 초기화 시키기위함?
 * 
 */

