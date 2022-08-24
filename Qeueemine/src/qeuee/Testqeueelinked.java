package qeuee;

public class Testqeueelinked {

	public static void main(String[] args) {
		QueeLinkedlist ql=new QueeLinkedlist();
		ql.enquee(2344);
		ql.enquee(23);
		ql.enquee(23);
		ql.enquee(23);ql.enquee(23);
		
		ql.enquee(23);
		ql.enquee(23);ql.enquee(23);
		ql.enquee(23);
		ql.enquee(33);
		ql.deqeuee();
		ql.deqeuee();
		System.out.println(ql.getSize());
		System.out.println(ql);

	}

}
