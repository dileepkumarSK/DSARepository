package pack1;

public class Test {

	public static void main(String[] args) {
		
			ArrayListMine ar=new ArrayListMine();
			ar.add(10);
			ar.add(20);
			ar.add(30);
			ar.add(40);
			ar.add(50);
			ar.add(60);
			ar.add(70);
			ar.add(80);
			ar.add(50);
			ar.add(60);
			ar.add(70);
			ar.add(80);
			ar.add(80);
			System.out.println(ar);
			ar.remove();
			
			System.out.println(ar.getsize());
			System.out.println(ar.getCapacity());
			System.out.println(ar);
	}

}
