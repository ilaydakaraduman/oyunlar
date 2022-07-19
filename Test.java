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
				System.out.println("2-Ýsim Bulma Oyunu");
				System.out.println("3-Kelime Oyunu");
				System.out.println("4-Kütüphane");
				System.out.println("5-Zar");
				System.out.println("6-Hesaplama");
				System.out.println("7-Çýkýþ");
				System.out.println("------------------");
				
				System.out.println("Seçim yapýnýz");
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
					rafDizimi.Calýstýr();
					break;
				}
				case '5': {
					ZarOyunu zarOyunu = new ZarOyunu();
					int secim =0;
					System.out.println("1-Zar At");
					System.out.println("2-Zarlarý Listele");
					System.out.println("Seçim yap");
					secim = scan.nextInt();
					if(secim ==1) {
						zarOyunu.ZarOyunuBaslangýc(birinciZarlar, ikinciZarlar);
					}
					else if(secim ==2) {
						zarOyunu.KayýtlýZarlarýGöster(birinciZarlar, ikinciZarlar);
					}
					else {
						System.out.println("Geçersiz seçim");
					}
					break;
				}
				case '6': {
					MatematikselIslem matematikselIslem = new MatematikselIslem();
					matematikselIslem.Hesapla();
					break;
				}
				case '7': {
					System.out.println("Çýkýþ gerçekleþti");
					System.exit(0);
					break;
				}
				default:
					System.out.println("Hatalý giriþ");
				}
			}
		}catch (Exception e) {
		System.out.println("Hatalý Giriþ");
		}
	
	
	}
	

}
