import java.util.*;


class machine {
	
	
	public String toString() {
		
		return "I'm a machine";
		
	}	
	
	
	public String start() {
		
		return "machine started";
	}
 }



class camera extends machine {
	
	public String toString() {
		
		return "I'm a camera";
	}
	
	
public String snap() {
		
		return "took a photo";
	}


}



public class App {
	
	
	public static void main(String[] args) {
	
	ArrayList<machine> list = new ArrayList<machine>(); 
	
	ArrayList<camera> list2 = new ArrayList<camera>(); 

	
	list.add(new machine());
	list.add(new machine());
	list.add(new camera()); 
		
	list2.add(new camera());
	
	
	
	showList(list2);


	
   }

	


	public static void showList(ArrayList<? extends machine> list) {
	
	
		for (Object s : list) {
			
			System.out.println(s);
		}
		
		
	}
	
	
}
