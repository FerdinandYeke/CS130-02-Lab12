package ArrayPractice;
import java.util.ArrayList;


public class PersonArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A. Starts here
		ArrayList<String>arraylist1 = new ArrayList<String>();
		arraylist1.add("Olivia");
		arraylist1.add("Emma");
		arraylist1.add("Ava");
		arraylist1.add("Charlotte");
		arraylist1.add("Sophia");
		System.out.println("Arraylist1: "+arraylist1);
		
		//A. ends here; B. Starts here
		ArrayList<String>arraylist2 = new ArrayList<String>();
		arraylist2.add("Noah");
		arraylist2.add("Liam");
		arraylist2.add("William");
		arraylist2.add("Mason");
		arraylist2.add("James");
		System.out.println("Arraylist2: "+arraylist2);
		
		//B. ends here C. Starts here
		arraylist2.addAll(arraylist1);
		
		//C. Ends here; D. Starts here
		arraylist1.set(4, "Sophie");
		
		//D. Ends here; E. Starts here
		arraylist1.add(2,"Anne");
		
		//E. Ends here; F. Starts here
		System.out.println("Does Arraylist1 contains the name Liam?: "+arraylist1.contains("Liam"));
		
		//F. Ends here; G. Starts here
		System.out.println("Does Arraylist1 contains the name Sam?: "+arraylist1.contains("Sam"));
		
		//G. Ends here; H. Starts here
		arraylist1.remove(1);//removes Emma from arraylist1
		
		//H. Ends here; I. Starts here
		System.out.println("Size of Arraylist2 mergeed with Arraylist2: "+arraylist2.size());
		
		//I. Ends here; J. Starts here
		
		for(int i = 0; i < arraylist2.size(); i++)
		{
			System.out.println("All Array's names: "+arraylist2.get(i)+arraylist2.indexOf(i));
		}
		
		
		
	}

}
