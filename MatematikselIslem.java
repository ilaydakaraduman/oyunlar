import java.util.Scanner;

public class MatematikselIslem {
	public  double Islem4(double sayi1, double sayi2, char SecilenHarf) {
		double cevap=0;
		switch (SecilenHarf) {
		case 'A': {
			cevap=sayi1+sayi2;
			break;	
		}
		case 'B': {
			cevap=sayi1-sayi2;
			break;
		}
		case 'C': {
			cevap=sayi1*sayi2;
			break;	
		}	
		case 'D': {
			cevap=sayi1/sayi2;
			break;
		}
		default:
			System.out.println(" \n Yanl�� harf tu�lad�n�z :\n");
			break;
		}
		return cevap;
	}
	public  double  KarekokAlma(double sayi1) {
		
		return Math.sqrt(sayi1);
	}
	public  double Kupkokalma(double sayi1) {
		//double kok=1/2;
		return Math.cbrt(sayi1);
	}
	public  double kuvvetAlma(double sayi1, double sayi2) {
		return Math.pow(sayi1, sayi2);
	}
	public static double Faktoriyel(double sayi1) {
		if (sayi1==1 ||sayi1==0) {
			
			return 1;
		}
		
		return Faktoriyel(sayi1-1)*sayi1;
	}
	
	

	public void Hesapla () {

		try {
			int secenek=5;
			double sonuc=0 ;
			double sayi1,sayi2=1;
			String Sec;
			char SecilenHarf =' ';
			Scanner scan =new Scanner(System.in);
			System.out.println("     \n HO�GELD�N�Z \n");
			
			
			while (secenek!=0) {
				System.out.println("     \n YAPMAK �STED���N�Z ��LEM� SE��N�Z :\n");
				System.out.println("\t 1-) Dort Islem \n \t 2-) Karek�k Alma \n \t 3-) K�pk�k Alma \n\t 4-) Kuvvet alma  \n\t 5-) Fakt�riyel hesab�  \n\t 0-) I�lemleri Bitir \n");
				secenek=scan.nextInt();
				
				if (secenek==1) {
					System.out.println("   \n YAPMAK �STED���N�Z  4 ��LEM� SE��N�Z :\n");
					System.out.println("\t A-) Toplama(+) \n \t B-) ��karma(-) \n \t C-) Carpma(*) \n\t D-) Bolme \n");
					Sec=scan.next();
					Sec= Sec.toUpperCase();
					SecilenHarf=Sec.charAt(0);
					
					
				}
				if(secenek == 0) {
					break;
				}
				System.out.println(" \n 1.Say�y� giriniz :\n");
				sayi1=scan.nextDouble();
				
				if (secenek==1 || secenek==4) {
					
					System.out.println(" \n 2.Say�y� giriniz :\n");
					sayi2=scan.nextDouble();
				}
				switch (secenek) {
				case 1: {
					
					sonuc=Islem4(sayi1,sayi2, SecilenHarf);
					
					break;
				}
				case 2: {
					sonuc=KarekokAlma(sayi1);
					break;
				}
				case 3: {
					sonuc=Kupkokalma(sayi1);
					break;
				}
				case 4: {
					sonuc=kuvvetAlma(sayi1, sayi2);
					break;
				}
				case 5: {
					sonuc=Faktoriyel(sayi1);
					break;
				}
				
				default:
					System.out.println(" \n Yanl�� deger tu�lad�n�z :\n");
					break;
				}
				
			System.out.println("Cevab�n�z  :" + sonuc);	
			}
			

			
		}
			
		 catch (Exception e) {
			 System.out.println("Harf Tuslamayiniz " + e.getMessage());
			
		}
		
}
}