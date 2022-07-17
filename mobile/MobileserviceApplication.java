package mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mobile.model.Mobile;
import mobile.model.MobileStatus;
import mobile.service.MobileService;

@SpringBootApplication
public class MobileserviceApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MobileserviceApplication.class, args);
	}
	
	@Autowired
	private MobileService mobileService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	/*
	 
       //Add Mobile data	 	
	 	Mobile m=new Mobile(3,"JIO",1331,322,333);
		
		MobileStatus x=mobileService.addMobile(m);
		
		if(x.getStatuCode()==1) {
			System.out.println("added mobile details");
		}
		
		else
			System.out.println("Could not add");
	}*/
	
		
	
	
		
	/*
	 
	 //Show All Mobiles 
	 * List<Mobile> mobiles= mobileService.getAllMobile();
	 * 
	 * if(mobiles.size()==0) System.out.println("no mobile found"); else
	 * System.out.println(mobiles+"           ");
	 */
	
	
	/*
	 
	 //Update Mobile data
	 * Mobile m=new Mobile(1,"JIOOOO",1331,322,333); MobileStatus
	 * x=mobileService.updateMobile(m);
	 * 
	 * if(x.getStatuCode()==1) { System.out.println(" Updated Mobile details"); }
	 * 
	 * else System.out.println("Could not Update");
	 */
	
	
	//Delete Mobile
		
		int imeinumber=4;
		
        MobileStatus x=mobileService.removeMobile(imeinumber);
		
		if(x.getStatuCode()==1) {
			System.out.println("removed mobile details");
		}
		
		else
			System.out.println("Could not remove details");
		
	}
	
	}

