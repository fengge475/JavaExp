package book.abstractPrc.example13;

public class MobileTelephone {
	Sim card;
	public void useSim(Sim card) {
		this.card=card;
	}
	public void showMess() {
		System.out.println("ʹ�õĿ���"+card.giveCorpName()+"�ṩ��");
		System.out.println("�ֻ�������"+card.giveNumber());
	}

}
