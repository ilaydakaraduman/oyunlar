import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> birinciZarlar = new ArrayList<Integer>();
			ArrayList<Integer> ikinciZarlar = new ArrayList<Integer>();
		
			char cevap='1';
			while(true) {
				System.out.println("\n\n********************");
				System.out.println("1-Harita Oyunu");
				System.out.println("2-�sim Bulma Oyunu");
				System.out.println("3-Kelime Oyunu");
				System.out.println("4-K�t�phane");
				System.out.println("5-Zar");
				System.out.println("6-Hesaplama");
				System.out.println("7-��k��");
				System.out.println("------------------");
				
				System.out.println("Se�im yap�n�z");
				cevap =  scan.next().charAt(0);
				switch (cevap) {
				case '1': {
					KacisOyunu kacisOyunu = new KacisOyunu();
					kacisOyunu.Oyna();
					break;
				}
				case '2': {
					KelimeBul kelimeBul = new KelimeBul();
					kelimeBul.Kelimesec();
					break;
				}
				case '3': {
					KelimeIslem kelimeIslem = new KelimeIslem();
					kelimeIslem.KelimeIste();
					break;
				}
				case '4': {
					RafDizimi rafDizimi = new RafDizimi();
					rafDizimi.Cal�st�r();
					break;
				}
				case '5': {
					ZarOyunu zarOyunu = new ZarOyunu();
					int secim =0;
					System.out.println("1-Zar At");
					System.out.println("2-Zarlar� Listele");
					System.out.println("Se�im yap");
					secim = scan.nextInt();
					if(secim ==1) {
						zarOyunu.ZarOyunuBaslang�c(birinciZarlar, ikinciZarlar);
					}
					else if(secim ==2) {
						zarOyunu.Kay�tl�Zarlar�G�ster(birinciZarlar, ikinciZarlar);
					}
					else {
						System.out.println("Ge�ersiz se�im");
					}
					break;
				}
				case '6': {
					MatematikselIslem matematikselIslem = new MatematikselIslem();
					matematikselIslem.Hesapla();
					break;
				}
				case '7': {
					System.out.println("��k�� ger�ekle�ti");
					System.exit(0);
					break;
				}
				default:
					System.out.println("Hatal� giri�");
				}
			}
		}catch (Exception e) {
		System.out.println("Hatal� Giri�");
		}
	
	
	}
	

}
