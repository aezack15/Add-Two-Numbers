import java.util.*;

public class add{
	
	public ArrayList<Integer> l1 = new ArrayList<Integer>();
	public ArrayList<Integer> l2 = new ArrayList<Integer>();;
	
	public static void main(String[] args){
		add a = new add();
		a.getInput();
		a.addNums();
	}
	
	private void getInput(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter L1 separated by ',': > ");
		String a = in.next();
		System.out.print("Enter L2 separated by ',': > ");
		String b = in.next();
		String[] a1 = a.split(",");
		String[] b1 = b.split(",");
		
		for(int i=0; i<a1.length; i++){
			l1.add(Integer.parseInt(a1[i]));
		}
		for(int i=0; i<b1.length; i++){
			l2.add(Integer.parseInt(b1[i]));
		}
	}
	
	private void addNums(){
		String s = Integer.toString(arrayToInt(l1) + arrayToInt(l2));
		String[] sumArray = s.split("");
		printArray(sumArray);
	}
	
	private int arrayToInt(ArrayList<Integer> l){
		String s = "";
		for(int i=l.size()-1; i>=0; i--){
			s = s + l.get(i);
		}
		return Integer.parseInt(s);
	}
	
	private void printArray(String[] ans){
		System.out.print("[");
		for(int i=ans.length-1; i>=0; i--){
			System.out.print(ans[i]);
			if(i!=0){
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
