package test.encapsulation;

public class MyProfile {
	String name="이장원";
	MyDate birthday=new MyDate();
	
	public void setBirthday() {
		//birthday.year=1980;
		birthday.setYear(1994);
		birthday.setMonth(12);
		birthday.setDay(12);
		
		System.out.println(birthday.getYear()+"년"
		+birthday.getMonth()+"월"+birthday.getDay()+"일");
		
	}
	

}
