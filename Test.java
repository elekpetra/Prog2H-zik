import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static ArrayList<Person> personLi = new ArrayList<Person>(); 
	
	public static boolean exist(String name) {
		for (Person p : personLi) {
			if(p.getNev().contains(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static void increase(String name, String tura, int tav) {
		for (Person p : personLi) {
			if(p.getNev().contains(name)) {
				p.addNewTura(new Tura(tura, tav));
			};
		}
	}
	
	public static void read(File f) throws FileNotFoundException {
		Scanner sc =  new Scanner(f);
		while(sc.hasNextLine()) {			
			
			String line = sc.nextLine();
			String[] l = line.split(":");
			
			String nev = l[0];
			String tura = l[1];
			int tav = Integer.parseInt(l[2]);
			
			if(personLi.size() == 0) {
				Person p = new Person(nev);
				p.addNewTura(new Tura(tura, tav));
				personLi.add(p);
				
			} else if(exist(nev)) {
				increase(nev, tura, tav);
			}
			else {
				Person p = new Person(nev);
				p.addNewTura(new Tura(tura, tav));
				personLi.add(p);
			}
		}
	}
	
	public static void main(String[] args) {

		File f = new File("sample.txt");
		
		try {
			read(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Person p : personLi) {
				//p.printTurak();
			System.out.println(p.getNev() + " " + p.leghosszabbTura());
		}

	}

}