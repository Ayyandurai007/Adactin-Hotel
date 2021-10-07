package org.abs;

public class Tamilnadu extends Kerala {

	@Override
	public void smokingHabit() {
System.out.println("smoking is injurious to health");		
	}
	
	public static void main(String[] args) {
		Tamilnadu a= new Tamilnadu();
		a.voterId();
		a.panCard();
		a.smokingHabit();
	}
	

}




//QUESTION 1:------------
//Project :Abstraction1
//Package :org.abs
//Class :Tamilnadu
//Methods : @override the abstract
//Class :Kerala
//Methods :voterID(),panCard()
//Abstract : smokingHabit()
//Description:You have to override the abstract in Tamilnadu class.