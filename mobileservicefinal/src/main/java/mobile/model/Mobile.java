package mobile.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int imeiNumber;
	private String make;
	private int ramsize;
	private int storage;
	private int expandedstorage;
	public int getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(int imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getExpandedstorage() {
		return expandedstorage;
	}
	public void setExpandedstorage(int expandedstorage) {
		this.expandedstorage = expandedstorage;
	}
	public Mobile(int imeiNumber, String make, int ramsize, int storage, int expandedstorage) {
		super();
		this.imeiNumber = imeiNumber;
		this.make = make;
		this.ramsize = ramsize;
		this.storage = storage;
		this.expandedstorage = expandedstorage;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [imeiNumber=" + imeiNumber + ", make=" + make + ", ramsize=" + ramsize + ", storage=" + storage
				+ ", expandedstorage=" + expandedstorage + "]";
	}
	
	
	

}
