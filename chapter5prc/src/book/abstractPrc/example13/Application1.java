/**
 * @author fengge
 * @version V1.2
 */
package book.abstractPrc.example13;

public class Application1 {

	public static void main(String[] args) {
		MobileTelephone telephone=new MobileTelephone();
		Sim sim = new SimOfChinaMoblie();
		sim.setNumber("13887656423");
		
		telephone.useSim(sim);
		telephone.showMess();
		
		sim=new SimofChinaUincom();
		sim.setNumber("13097656437");
		
		telephone.useSim(sim);
		telephone.showMess();

	}

}
