package mobile.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mobile.model.Mobile;
import mobile.model.MobileStatus;

@RestController	
public class MobileController {
	

@PostMapping("/add")
public MobileStatus addMobile(@RequestBody Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Adding Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}	
	

@PutMapping("/update")
public MobileStatus updateMobile(@RequestBody Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Updating Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}

@DeleteMapping("/delete/{imeiNO}")
public MobileStatus removeMobile(@PathVariable int imeiNO) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed removing mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileStatus;
		
	}
	


@GetMapping("all")
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
