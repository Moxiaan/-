package model;

public class card {
	private  String card1;
	private  String card2;
	private  String card3;
	private  String card4;
	private  String card5;
	public card(String card1, String card2, String card3, String card4,
			String card5) {
		super();
		this.card1 = card1;
		this.card2 = card2;
		this.card3 = card3;
		this.card4 = card4;
		this.card5 = card5;
	}
	public String getCard1() {
		return card1;
	}
	public void setCard1(String card1) {
		this.card1 = card1;
	}
	public String getCard2() {
		return card2;
	}
	public void setCard2(String card2) {
		this.card2 = card2;
	}
	public String getCard3() {
		return card3;
	}
	public void setCard3(String card3) {
		this.card3 = card3;
	}
	public String getCard4() {
		return card4;
	}
	public void setCard4(String card4) {
		this.card4 = card4;
	}
	public String getCard5() {
		return card5;
	}
	public void setCard5(String card5) {
		this.card5 = card5;
	}

void showCardDetail(int cardIDs[], int selectedCardIndex)
{
  
    switch(cardIDs[selectedCardIndex])
    {

    case 0: 
        card1 = "������:\n\n����:���Ի�ö����Ǯ.\n\nʹ�ö���:�Լ�";
        break;

    case 1: 
        card2 = "�����:\n\n����:����������һ�ſ�Ƭ.\n\nʹ�ö���:�Լ�!";
        break;

    case 2: 
        card3 = "���⿨:\n\n����:·��̫ҽԺ���Բ���ͣ����.\n\nʹ��ʱ��:·��̫ҽԺʱ.";
        break;

   
    }
   
}
}