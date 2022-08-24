package minelist;

public class Test {

	public static void main(String[] args) {
		
	
	
	   LInkedListMine lsm=new LInkedListMine();
	   lsm.add(10);
	   lsm.add(20);
	   lsm.add(30);
	   lsm.add(40);
	   lsm.add(50);
	   lsm.add(60);
	   lsm.add(70);
	   lsm.add(80);
	   lsm.remove();
	   lsm.insertAt(3, 66);
	   lsm.insertAt(0, 667);
	   lsm.deleteAt(4);
	   System.out.println(lsm);
	   System.out.println(lsm.getSize());
	   System.out.println(lsm.get(3));
}
 
}
