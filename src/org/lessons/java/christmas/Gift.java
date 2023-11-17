package org.lessons.java.christmas;

public class Gift {
	
	protected String person;
	protected String gift;
	
	public Gift(String person, String gift) {
		
		
		setPerson(person);
		setGift(gift);
		
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}
	
	
	@Override
	public String toString() {
		
		
		return "* " + person + " --> " + gift + " *";
	}
	
	
}
