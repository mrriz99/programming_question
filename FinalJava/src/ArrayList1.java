import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		list.add(12);
		System.out.println(list);
		System.out.println(list.size());
		list.add(0,13);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		
		

	}

}
