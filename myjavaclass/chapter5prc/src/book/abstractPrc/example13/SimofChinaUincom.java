package book.abstractPrc.example13;

public class SimofChinaUincom extends Sim {
	
	String number;
	public void setNumber(String n) {
		number=n;
	}

	public String giveNumber() {
		return number;
	}
	
	public String giveCorpName() {
		return "中国联通";
	}

}
