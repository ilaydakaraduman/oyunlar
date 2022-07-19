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
					System.out.println("Do�ru tahmin");
					TahminYazdir++;
				}				
				
			}
			else if(i==uzunluk-1 && sayac!=0){
				if (TahminYazdir==sayac) {
					System.out.println("Yanl�� tahmin");
					TahminYazdir++;
					//TahminYazdir=sayac;
				}
				
			}
			
		}
		
		for(int i=0; i<uzunluk ;i++) {
			
			temp2+=dizi[i];
		}
		temp=temp2;
		Yazd�r(temp,uzunluk, sayac);
		
		return temp;
	}
	 public void Yazd�r(String temp, int uzunluk, int sayac) {
		 char[] diziYazdir =temp.toCharArray();
		 
		 for(int i=0 ;i<uzunluk ;i++) {
				
			 System.out.print( "  "+ diziYazdir[i]);
				
			}
      
       //System.out.print( "  "+ temp);
		System.out.println(" ");	
		
	
	}

	public  void Kelimesec() {
		
		String[] isimler = {"BEHL�L" , "RIFAT" , "EDA","SEL�M", "N�SAN", "DORUK", "FERD�","CAN", "D�LAN","Z�NNET"};
		Random rn = new Random();
		int Sayac=0;
		int secilenIs�mSira = rn.nextInt(9) ;
		
		 int uzunluk=isimler[secilenIs�mSira].length();
		 String isim=isimler[secilenIs�mSira];
		String Harf;
		char SecilenHarf=' ';
		String SonaKalan="";
		Scanner scan=new Scanner(System.in);
		System.out.println("\t KEL�ME OYUNUNA HO�GELD�N�Z \n");
		
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
					System.out.println(" \n  Kalan Hakk�n�z : " + (5-Sayac));
				}
				else {
					System.out.println("Harf giriniz..");
				}
				
				
			} catch (Exception e) {
				
				System.out.println("Hatal� giris" + e.getMessage());
				
			}
						
		}
	
		if (SonaKalan.contains("_")==false && Sayac<=5) {
			
			System.out.println("Tebrikler oyunu kazand�n�z"+"  Arad���n�z kelime :" +isim);
			
		}
		else if(Sayac==5) {
			
			System.out.println("Malesef oyunu bitiremediniz  .."  +"  Arad���n�z kelime :" +isim );
		
			
			
		}
			 
		 								

	}

}