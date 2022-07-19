import java.util.Scanner;

public class KelimeIslem {
	Scanner scan = new Scanner(System.in);
	String girilenKelime ;
	char istenenHarf;
	public void KelimeIste() {
		try {
			System.out.println("Kelime giriþiniz gerçekleþtiriniz");
			String gecici;
			
			gecici = scan.nextLine();
			if(SayiGirisKontrol(gecici)== false) {
				girilenKelime = gecici;
				int secim = -1;
				int kontrol = 1;
				
				while(true) {
					Menu();
					System.out.println("Seçim yapýnýz:");
					secim = scan.nextInt();
					switch (secim) {
					case 1: {
						KelimeIcýndeHarfBulmaFirst();
						break;
					}
					case 2: {
						KelimeIcýndeHarfBulmaLast();
						break;
					}
					case 3: {
						HarfTekrarBulma();
						break;
					}
					case 4: {
						KelimeAralýkBulma();
						break;
					}
					case 5: {
						kontrol=0;
						break;
					}
					
					default:
						System.out.println("Geçersiz giriþ yapýldý.");
					}
					if(kontrol == 0) {
						break;
					}
				}
				
			}
			
			else {
				throw new Exception();
			}
		}catch (Exception e) {
			System.out.println("Hatalý giriþ");
		}
	}
	private void Menu() {
		System.out.println("1-Harfin ilk yerini bul");
		System.out.println("2-Harfin son yerini bul");
		System.out.println("3-Harften kaç adet var");
		System.out.println("4-Kelime içinde aralýk yazdýr");
		System.out.println("5-Ana Menü Dön");		
	}
	private boolean SayiGirisKontrol(String kelime) {
		boolean girdiMi = false;
		for (char harf : kelime.toCharArray()) {
			if(Character.isDigit(harf)) {
				girdiMi = true;
			}
		}
		return girdiMi;
	}
	private boolean SayiGirisKontrol(char harf) {
		boolean girdiMi = false;
			if(Character.isDigit(harf)) 
				girdiMi = true;

		return girdiMi;
	}
	public void KelimeIcýndeHarfBulmaFirst() {
		System.out.println("Bulmak istediðiniz harfi giriniz");
		int kontrol = 1;
		char gecici = scan.next().charAt(0);
		if(SayiGirisKontrol(gecici)==false) {
			istenenHarf = gecici;
			for (char harf : girilenKelime.toCharArray()) {
				if(harf == istenenHarf) {
					System.out.println(harf+" 'nin yeri" + (girilenKelime.indexOf(harf)+1));
					kontrol =0;
					break;
				}
			}
			if(kontrol ==1) {
				System.out.println("Harf bulunamadý");
			}
		}
		else {
			System.out.println("Hatalý Giriþ");
		}
	}
	public void KelimeIcýndeHarfBulmaLast() {
		System.out.println("Bulmak istediðiniz harfi giriniz");
		int kontrol = 1;
		char gecici =  scan.next().charAt(0);
		if(SayiGirisKontrol(gecici)==false) { 
			
			istenenHarf = gecici;
			int index=0;
			for (char harf : girilenKelime.toCharArray()) {
				if(harf == istenenHarf) {
					index =girilenKelime.lastIndexOf(harf);
					kontrol = 0;
				}
			}
			if(kontrol ==1) {
				System.out.println("Harf bulunamadý");
			}
			System.out.println(istenenHarf+" 'nin yeri" + (index+1));
		}else {
			System.out.println("Hatalý Giriþ");
		}
	}
	public void HarfTekrarBulma() {
		System.out.println("Aratmak istediðiniz harfi giriniz");
		char gecici =scan.next().charAt(0);
		if(SayiGirisKontrol(gecici)==false) { 
			istenenHarf =  gecici;
					int sayac=0;
					for (char harf : girilenKelime.toCharArray()) {
						if(harf == istenenHarf) {
							sayac++;
						}
					}
					System.out.println(istenenHarf+" 'nin tekrar sayýsý: " + sayac);
			
		}else {
			System.out.println("Hatalý Giriþ");
		}
	}
	public void KelimeAralýkBulma() {
		try {
			System.out.println("Bulmak istediðiniz aralýðýn baþlangýç deðerini giriniz");
			int x = scan.nextInt();
			System.out.println("Bulmak istediðiniz aralýðýn bitiþ deðerini giriniz");
			int y = scan.nextInt();
			if(x==0 && y == 0) {
				System.out.println(girilenKelime);
			}
			else if(x==0) {
				String sonKelime = girilenKelime.substring(0, y);
				System.out.println(sonKelime);
			}
			else if(y==0) {
				String sonKelime = girilenKelime.substring(x, girilenKelime.length());
				System.out.println(sonKelime);
			}
			else {
				String sonKelime = girilenKelime.substring(x-1, y);
				System.out.println(sonKelime);
			}
		}catch (Exception e) {
			System.out.println("Hatalý giriþ yapýldý");
		}
		
	}
}
