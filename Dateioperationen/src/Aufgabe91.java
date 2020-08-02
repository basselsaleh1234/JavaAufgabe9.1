import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;






public class Aufgabe91 {

	public static void main(String[] args) throws IOException {

	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Bitte Die Datei Name Eingeben ");
String name=b.readLine();

String path=name+".txt";

	Scanner scan=new Scanner(new FileReader(path));
	  
	System.out.println(scan.nextLine());
	System.out.println(scan.nextInt());
	System.out.println(scan.next());
	
	
	}

}
