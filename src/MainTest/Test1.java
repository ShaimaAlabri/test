package MainTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		int add;
		ArrayList< Integer> num1 =new ArrayList< Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		ArrayList< Integer> num2 =new ArrayList< Integer>();
		num2.add(5);
		num2.add(6);
		num2.add(7);
		num2.add(8);
		
		ArrayList< Integer> merge =new ArrayList< Integer>();
		for(int i=0;i<num1.size();i++) {
			merge.add(num1.get(i));
		}
		for(int i=0;i<num2.size();i++) {
			merge.add(num2.get(i));
		}
		merge.sort(null);
		System.out.println(merge);
	
	}
}
