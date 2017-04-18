package book.abstractPrc;

public class Application1 {
	public static void main(String[] args) {
		Test1 test1 =new Test1();
		test1.show();
		test1.speak();
	}

}

class Test1 extends AbstractDemo1{
	void speak(){
		System.out.println("I am class Test1!");
	}
}
