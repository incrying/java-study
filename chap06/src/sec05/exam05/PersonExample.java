package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1=new Person("12346-1234567","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*
		p1.nation="USA";
		p1.ssn="654321-6789032";
		*/
		p1.name="감자바";
		
	}
}
