package mobile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mobile.model.Mobile;
import mobile.model.MobileStatus;


@Service
public class MobileService {

	
public MobileStatus addMobile(Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Adding Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}	
	
public MobileStatus updateMobile(Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Updating Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}
	
public MobileStatus removeMobile(int imeiNO) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed removing mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}
	


public List<Mobile> getAllMobile() {
	
	List<Mobile> mobiles=new ArrayList<Mobile>();
	
	mobiles.add(new Mobile(1,"Nokia",2,3,4));
	mobiles.add(new Mobile(2,"LG",1,3,4));
	mobiles.add(new Mobile(3,"HTC",2,3,4));
	mobiles.add(new Mobile(4,"VIVO",2,3,4));
	mobiles.add(new Mobile(5,"OPPO",2,3,4));
	
	return mobiles;
	
}
	
	

}
