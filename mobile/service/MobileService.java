package mobile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobile.dao.MobileDao;
import mobile.model.Mobile;
import mobile.model.MobileStatus;


@Service
public class MobileService {

	
	@Autowired
	private MobileDao  mobileDao;
	
public MobileStatus addMobile(Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Adding Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		if(!mobileDao.existsById(m.getImeiNumber()))
		{
			mobileDao.save(m);
			mobileStatus.setStatuCode(1);
			mobileStatus.setMessage("Added Successfully");
		}
		
		return mobileStatus;
		
	}	
	
public MobileStatus updateMobile(Mobile m) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed Updating Mobile",new Mobile(-1,"A",-1,-1,-1));
		
		if(mobileDao.existsById(m.getImeiNumber()))
		{
			mobileDao.save(m);
			mobileStatus.setStatuCode(1);
			mobileStatus.setMessage("Updated Successfully");
		}
		
		return mobileStatus;
		
	}
	
public MobileStatus removeMobile(int imeiNO) {
	
		
		MobileStatus mobileStatus = 
				new MobileStatus(0,"Failed removing mobile",new Mobile(-1,"A",-1,-1,-1));
		
		if(mobileDao.existsById(imeiNO))
		{
			mobileDao.deleteById(imeiNO);
			mobileStatus.setStatuCode(1);
			mobileStatus.setMessage("Removed Successfully");
		}
		
		return mobileStatus;
		
	}
	


public List<Mobile> getAllMobile() {
	
	return mobileDao.findAll();
	
}
	
	

}
