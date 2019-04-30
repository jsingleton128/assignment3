import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(-1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(15);
		list.add(15);
		list.add(16);
		
		countUnique(list);
	}

	private static void countUnique(ArrayList<Integer> list) {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(list.get(0));
		for(int i: list) {
			if(!testList.contains(i)) {
			testList.add(i);
			}
		}
		System.out.println(testList.size());
	}

}
