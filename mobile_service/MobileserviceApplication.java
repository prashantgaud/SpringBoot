package mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mobile.model.Mobile;
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
		Mobile m=new Mobile(4,"Nokia",1,2,3);
		
		MobileStatus x=mobileService.addMobile(m);
		
		if(x.getStatuCode()==1) {
			System.out.println("added mobile details");
		}
		
		else
			System.out.println("Could not add");
	}
	*/
		
	
	
		List<Mobile> mobiles= mobileService.getAllMobile();
		
		if(mobiles.size()==0)
			System.out.println("no mobile found");
		else
			System.out.println(mobiles+"           ");
	
		
		
		
		
	}
}
