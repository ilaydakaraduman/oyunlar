import java.util.Iterator;
import java.util.Scanner;

public class RafDizimi {

	public  String[] DizilisB(String yesil,String mavi,String kirmizi) {
		
		String[] rafB =new String[42];
		int uzunluk = rafB.length;
		int uzunlukbas,uzunlukson;
		for (int i = 0; i<uzunluk;i++ ) {
		if (i<14) {
			uzunlukbas=0;
			uzunlukson=14;
			Ekle(rafB,kirmizi,uzunlukbas,uzunlukson);
		}	
		else if (i>13&&i<28) {
			uzunlukbas=14;
			uzunlukson=28;
			Ekle(rafB,yesil,uzunlukbas,uzunlukson);
		}	
		if (i>27 &&i<41) {
			uzunlukbas=28;
			uzunlukson=42;
			Ekle(rafB,mavi,uzunlukbas,uzunlukson);
		}	
			
		}
		RafYazdir(rafB, uzunluk,'B');
		return rafB;
	}
	public  int Arttir(int a) {
		return a+1;
	}
	public  String[] DizilisA(String yesil,String mavi,String kirmizi) {
		
		String[] rafA =new String[42];
		int uzunluk = rafA.length;
		 int uzunlukbasA=0,uzunluksonA=1;
		
		for (int i = 0; i<uzunluk/3;i++ ) {
			for(int j=0; j<3;j++) {
				if (j==0) {
					Ekle(rafA,kirmizi,uzunlukbasA,uzunluksonA);
					uzunlukbasA= Arttir(uzunlukbasA);
					uzunluksonA= Arttir(uzunluksonA);
					
				}
				else if (j==1) {
					Ekle(rafA,yesil,uzunlukbasA,uzunluksonA);
					uzunlukbasA= Arttir(uzunlukbasA);
					uzunluksonA= Arttir(uzunluksonA);
				}
				if (j==2) {
					Ekle(rafA,mavi,uzunlukbasA,uzunluksonA);
					uzunlukbasA= Arttir(uzunlukbasA);
					uzunluksonA= Arttir(uzunluksonA);
				}
				
				
			}
			
		}
		RafYazdir(rafA, uzunluk, 'A');
		
		return rafA;
	}
 
 public  void  Ekle(String[] raf,String ekleKitap,int uzunlukbas,int uzunlukson) {
	 for (int i = uzunlukbas; i<uzunlukson;i++ ) {
			
			raf[i]=ekleKitap;
		}
	
 }
	
	public  void RafYazdir(String[] dizilis, int uzunluk,char Ad) {
		
		
		System.out.print("|");
		for (int i = 0; i<uzunluk;i++ ) {
			System.out.print(dizilis[i].toString()+ " ");
		}
		System.out.println("|");
		System.out.print("|");
		for (int i = 0; i<uzunluk*2;i++ ) {
			System.out.print("_");
		}
		System.out.print("|");		
		System.out.println("DÝZÝLÝÞ :" + Ad);
		System.out.println(" ");
	}
	public void Calýstýr() {
		Scanner scan = new Scanner(System.in);
		String Yesil="Y";
		String Kirmizi ="K";
		String Mavi="M";
		try{
			System.out.println("Seçiminizi yapýnýz");
			System.out.println("1- Dizilis 1");
			System.out.println("2- Dizilis 2");
			int secim = scan.nextInt();
			if(secim == 1) {
				DizilisA(Yesil,Mavi,Kirmizi);
			}else if(secim  ==2) {
				DizilisB(Yesil,Mavi,Kirmizi);	
			}
			else {
				System.out.println("Yanlýþ seçim yaptýnýz.");
			}
			
		}catch (Exception e) {
			System.out.println("Hatalý Giris");
		}
	
	}

}