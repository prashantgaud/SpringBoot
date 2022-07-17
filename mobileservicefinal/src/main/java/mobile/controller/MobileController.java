package mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mobile.model.Mobile;
import mobile.model.MobileStatus;
import mobile.service.MobileService;

@RestController	
public class MobileController {
	 
	@Autowired
	private MobileService mobileService;

@PostMapping("/add")
public MobileStatus addMobile(@RequestBody Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Adding Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileService.addMobile(m);
		
	}	
	

@PutMapping("/update")
public MobileStatus updateMobile(@RequestBody Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Updating Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileService.updateMobile(m);
		
	}

@DeleteMapping("/delete/{imeiNO}")
public MobileStatus removeMobile(@PathVariable int imeiNO) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed removing mobile",new Mobile(-1,"A",-1,-1,-1));
		
		return mobileService.removeMobile(imeiNO);
		
	}
	


@GetMapping("all")
public List<Mobile> getAllMobile() {
	
	return mobileService.getAllMobile();
	
}
	


}
