package book.abstractPrc.example13;

public class MobileTelephone {
	Sim card;
	public void useSim(Sim card) {
		this.card=card;
	}
	public void showMess() {
		System.out.println("使用的卡是"+card.giveCorpName()+"提供的");
		System.out.println("手机号码是"+card.giveNumber());
	}

}
