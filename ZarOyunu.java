import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZarOyunu {
	Scanner scan = new Scanner(System.in);
	int atýlanZar1;
	int atýlanZar2;
	
public void ZarOyunuBaslangýc(ArrayList<Integer> birinciZarlar,ArrayList<Integer> ikinciZarlar) {
	try {
		while(true) {
			int cevap =0;
			
			System.out.println("Zar Atýldý");
			Random random = new Random();
			atýlanZar1 = random.nextInt(6)+ 1;
			atýlanZar2 =random.nextInt(6)+ 1;
			System.out.println("1. Zar: "+atýlanZar1);
			System.out.println("2. Zar: "+atýlanZar2);
			System.out.println("Kaydetmek istiyor Musunuz?| Evet ise 1 giriniz |");
			cevap = scan.nextInt();
			if(cevap == 1) {
				birinciZarlar.add(atýlanZar1);
				ikinciZarlar.add(atýlanZar2);
			}
			else {
				System.out.println("Kaydedilmedi");
			}
			System.out.println("Tekrar Zar atmak istiyor musunuz?|Evet : 1  Hayýr: 0|");
			cevap = scan.nextInt();
			if(cevap == 0) {
				break;
			}
		}
		
	}
	catch (Exception e) {
		System.out.println("Hatalý giriþ.");
	}
	
}
public void KayýtlýZarlarýGöster(ArrayList<Integer> birinciZarlar,ArrayList<Integer> ikinciZarlar) {
	for (int i = 0; i < birinciZarlar.size(); i++) {
		System.out.println((i+1) +". atýþ: "+ birinciZarlar.get(i)+"," + ikinciZarlar.get(i) );
	}
}

}
