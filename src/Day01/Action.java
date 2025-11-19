package Day01;

public class Action {
	public static void display() {
		StoreData myObj = new StoreData();
		if(myObj.flag == true) {
			System.out.println(myObj.x);
			System.out.println(myObj.y);
		}
	}
}
