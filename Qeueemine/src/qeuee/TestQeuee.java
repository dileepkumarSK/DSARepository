package qeuee;

public class TestQeuee {

	public static void main(String[] args) {
		MyQeuee m=new MyQeuee();
		m.enquee(9233);
		m.enquee(9);
		m.enquee(9);
		
		m.enquee(9);
		m.enquee(9);
		
		m.enquee(9);
		m.enquee(92);
		m.deqeuee();
		m.deqeuee();

		
	
		System.out.println(m);
		System.out.println(m.getSize());

	}

}
