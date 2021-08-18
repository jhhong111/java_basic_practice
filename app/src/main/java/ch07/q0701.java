package ch07;

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];
  SutdaDeck() {
    for (int i=0; i<CARD_NUM; i++) {
      SutdaCard card = new SutdaCard();
      int cardNum = i+1;
      if (cardNum==1||cardNum==3||cardNum==8) {
        card.num = cardNum;
      } else if (cardNum>10) {
        card.num = cardNum-10;
        card.isKwang = false;
      } else {
        card.num = cardNum;
        card.isKwang = false;
      }
      cards[i] = card;
    }

  }
}
class SutdaCard {
  int num;
  boolean isKwang;
  SutdaCard() {
    this(1, true);
  }
  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }
  // info() Object toString() . 대신 클래스의 을 오버라이딩했다
  @Override
  public String toString() {
    return num + ( isKwang ? "K":"");
  }
}


public class q0701 {
  public static void main(String args[]) {
    SutdaDeck deck = new SutdaDeck();
    for(int i=0; i < deck.cards.length;i++)
      System.out.print(deck.cards[i]+",");
  }
}

