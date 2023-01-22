package MainTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Patient implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter patient name:");
		String patientName = sc.next();
		
		System.out.println("Enter patient ID:");
		Integer id=sc.nextInt();
		
	  try {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Atyab\\pat.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		
		out.writeObject(patientName);
		out.writeObject(id);
		out.flush();
		out.close();
		System.out.println("Sirializton is been successfuly");
		
	}
		catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Atyab\\pat.txt"));
			
			in.readObject();
			
			in.close();
			System.out.println("patient name :"+patientName );
			System.out.println("patient ID:"+id);
			System.out.println("deserilaization is been successfully executed");
	
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
