package statcks;

public class TestStacklinked {

	public static void main(String[] args) {
       StackLinkedList sl=new StackLinkedList();
       sl.push(12);
       sl.push(22);
       sl.push(32);
       sl.push(42);
       sl.push(52);
       sl.push(62);
       sl.push(72);
       sl.push(8);
      
      System.out.println( sl.peek());
       System.out.println(sl);

	}

}
