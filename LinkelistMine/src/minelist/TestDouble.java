package minelist;

public class TestDouble {

	public static void main(String[] args) {
		DoubleLinkedList db=new DoubleLinkedList();
		db.add(23);
		db.add(33);
		db.add(43);
		db.add(53);
		db.add(63);
		db.add(73);
		db.add(83);
		db.add(93);
		db.add(13);
		System.out.println(db);
		db.remove();
		
		System.out.println(db);
		System.out.println(db.getsize());
		System.out.println(db.get(5));
		db.replaceAt(3, 0);
		
		System.out.println(db);
		db.insertAt(3,500);
		System.out.println(db);
		
	}

}
