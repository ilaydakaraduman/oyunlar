import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class KelimeBul {
	
	int uzunluk;
	 String temp= "";
	
	
	 public String Kelimebul(char SecilenHarf, int uzunluk, int sayac,String isim) {
		
	 String temp2= "";
	 int TahminYazdir=sayac;
		
		 for(int i=0; i<uzunluk; i++) {  
	    	   if (sayac==0) {
	    		   
	    		   temp +="_";
			}	    	   
					
			}
		
		 char[] dizi=temp.toCharArray();
		for(int i=0 ;i<uzunluk ;i++) {
			
			if (SecilenHarf==isim.charAt(i) ) {
				dizi[i]=SecilenHarf;
				
				if (TahminYazdir==sayac) {
					System.out.println("Doðru tahmin");
					TahminYazdir++;
				}				
				
			}
			else if(i==uzunluk-1 && sayac!=0){
				if (TahminYazdir==sayac) {
					System.out.println("Yanlýþ tahmin");
					TahminYazdir++;
					//TahminYazdir=sayac;
				}
				
			}
			
		}
		
		for(int i=0; i<uzunluk ;i++) {
			
			temp2+=dizi[i];
		}
		temp=temp2;
		Yazdýr(temp,uzunluk, sayac);
		
		return temp;
	}
	 public void Yazdýr(String temp, int uzunluk, int sayac) {
		 char[] diziYazdir =temp.toCharArray();
		 
		 for(int i=0 ;i<uzunluk ;i++) {
				
			 System.out.print( "  "+ diziYazdir[i]);
				
			}
      
       //System.out.print( "  "+ temp);
		System.out.println(" ");	
		
	
	}

	public  void Kelimesec() {
		
		String[] isimler = {"BEHLÜL" , "RIFAT" , "EDA","SELÝM", "NÝSAN", "DORUK", "FERDÝ","CAN", "DÝLAN","ZÝNNET"};
		Random rn = new Random();
		int Sayac=0;
		int secilenIsýmSira = rn.nextInt(9) ;
		
		 int uzunluk=isimler[secilenIsýmSira].length();
		 String isim=isimler[secilenIsýmSira];
		String Harf;
		char SecilenHarf=' ';
		String SonaKalan="";
		Scanner scan=new Scanner(System.in);
		System.out.println("\t KELÝME OYUNUNA HOÞGELDÝNÝZ \n");
		
		System.out.println("   Kelimeniz : \n");
	
																		
	
		SonaKalan= Kelimebul('x',uzunluk,Sayac,isim);
		while(SonaKalan.contains("_")==true && Sayac<5) {
			System.out.println("\t \n Harf Giriniz :  \n");
			
			try {
				Harf=scan.next();
				Harf= Harf.toUpperCase();
				SecilenHarf=Harf.charAt(0);
				if (!Character.isDigit(SecilenHarf)) {
					Sayac++;
					SonaKalan= Kelimebul(SecilenHarf,uzunluk,Sayac,isim);			
					System.out.println(" \n  Kalan Hakkýnýz : " + (5-Sayac));
				}
				else {
					System.out.println("Harf giriniz..");
				}
				
				
			} catch (Exception e) {
				
				System.out.println("Hatalý giris" + e.getMessage());
				
			}
						
		}
	
		if (SonaKalan.contains("_")==false && Sayac<=5) {
			
			System.out.println("Tebrikler oyunu kazandýnýz"+"  Aradýðýnýz kelime :" +isim);
			
		}
		else if(Sayac==5) {
			
			System.out.println("Malesef oyunu bitiremediniz  .."  +"  Aradýðýnýz kelime :" +isim );
		
			
			
		}
			 
		 								

	}

}