
package iskola;

import java.util.Scanner;

public class MainOrak {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sor = sc.nextLine();
		String st[] = sor.split(" ");
		Orarend orarend = new Orarend(st[0]);
		
		
		
		int n = Integer.parseInt(st[1]);
		for (int i = 0; i<n; i++) {
			
			
			sor = sc.nextLine();
			st = sor.split(" ");
			int kód = Integer.parseInt(st[0]);
			int szam = Integer.parseInt(st[2]);
			Ora temp = new Ora(kód,szam , st[1]);
			
			if (orarend.oratHozzáad(temp)) {
				System.out.println("Sikeres hozzáadás!");
			} else {
				System.out.println("Sikertelen hozzáadás!");
			}
		}
		System.out.println(orarend);
		

                
	}
}
