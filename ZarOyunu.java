import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZarOyunu {
	Scanner scan = new Scanner(System.in);
	int at�lanZar1;
	int at�lanZar2;
	
public void ZarOyunuBaslang�c(ArrayList<Integer> birinciZarlar,ArrayList<Integer> ikinciZarlar) {
	try {
		while(true) {
			int cevap =0;
			
			System.out.println("Zar At�ld�");
			Random random = new Random();
			at�lanZar1 = random.nextInt(6)+ 1;
			at�lanZar2 =random.nextInt(6)+ 1;
			System.out.println("1. Zar: "+at�lanZar1);
			System.out.println("2. Zar: "+at�lanZar2);
			System.out.println("Kaydetmek istiyor Musunuz?| Evet ise 1 giriniz |");
			cevap = scan.nextInt();
			if(cevap == 1) {
				birinciZarlar.add(at�lanZar1);
				ikinciZarlar.add(at�lanZar2);
			}
			else {
				System.out.println("Kaydedilmedi");
			}
			System.out.println("Tekrar Zar atmak istiyor musunuz?|Evet : 1  Hay�r: 0|");
			cevap = scan.nextInt();
			if(cevap == 0) {
				break;
			}
		}
		
	}
	catch (Exception e) {
		System.out.println("Hatal� giri�.");
	}
	
}
public void Kay�tl�Zarlar�G�ster(ArrayList<Integer> birinciZarlar,ArrayList<Integer> ikinciZarlar) {
	for (int i = 0; i < birinciZarlar.size(); i++) {
		System.out.println((i+1) +". at��: "+ birinciZarlar.get(i)+"," + ikinciZarlar.get(i) );
	}
}

}
