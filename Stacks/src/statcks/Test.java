package statcks;

public class Test {

	public static void main(String[] args) {
	
		Stackmine sm=new Stackmine();
		sm.push(34);
		sm.push(44);
		sm.push(54);
		sm.push(64);
		sm.push(74);
		sm.push(84);
		sm.push(94);
		sm.push(14);
		sm.push(24);
		System.out.println(sm);
		
		sm.pop();
		System.out.println(sm.peek());
		System.out.println(sm);
	}

}
