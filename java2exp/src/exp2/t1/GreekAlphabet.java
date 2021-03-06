package exp2.t1;
/**
 * 采用utf-16编码，因为Unicode编码962号，在gbk下无法输出
 * @author fengge
 */
public class GreekAlphabet {

	public static void main(String[] args) {

		int startPosition=0,endPosition=0;
		char cStart='α',cEnd='ω';
		//【代码1】 cStart做int型转换运算，并将结果赋值给startPosition
		startPosition=(int)cStart;
		//【代码2】 cEnd做int型转换运算，并将结果赋值给endPosition
		endPosition=(int)cEnd;
		System.out.println("希腊字母\'α\'在Unicode表中的顺序位置："+startPosition);
		System.out.println("希腊字母表：");
		
		for (int i = startPosition; i <= endPosition; i++) {
			char c='\0';
			//【代码3】i做char型转换运算，并将结果赋值给c
			c=(char)i;
			System.out.println(" "+c);
			if((i-startPosition+1)%10==0)
				System.out.println("");
		}
	}

}
