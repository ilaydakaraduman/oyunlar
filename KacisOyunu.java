import java.util.Scanner;

public class KacisOyunu {
	 int Xindex=1 ,Yindex=1;
	 boolean Kazandi= false;

	public  void Yonlendir(char Kontrol) {
	
		try {
			switch (Kontrol) {
			case 'A': {
				 Yindex--;	
				if (Yindex<0) {
					System.out.println("Yazd�g�n�z deger tablo d�s�na ��kart�r");
					++Yindex;
				}			
			   break;
			}
			case 'W': {
				Xindex--;
				if (Xindex<0) {
					System.out.println("Yazd�g�n�z deger tablo d�s�na ��kart�r");
					++Xindex;
				}
				
				break;
			}
			case 'S': {
				Xindex++;
				
				if (Xindex>2 && Yindex==2) {
					System.out.println("KAZANDINIZ ..OYUN B�TT�..");
					Kazandi=true;
					
				}
				else if (Xindex>2) {
					System.out.println("Yazd�g�n�z deger tablo d�s�na ��kart�r");
					--Xindex;
				}
				
				break;
			}
			case 'D': {
				Yindex++;
				if (Yindex>2) {
					System.out.println("Yazd�g�n�z deger tablo d�s�na ��kart�r");
					--Yindex;
				}
				break;
			}
			default:
				
				break;
			}

			System.out.format("\t%n");
			String leftAlignFormat = "| %-3s ";
				
			System.out.format("._________________.%n");
			for(int i =0 ; i<3; i++) {
				
				for(int j=0; j<3;j++) {
					if (Xindex==i&& Yindex==j) {
						 System.out.format(leftAlignFormat,  " X");			
					}			
					else {
						System.out.format(leftAlignFormat,  "");		  					
					}
				}
				
				System.out.format("|%n");
				if(i==2) {
					System.out.format("|_____|_____|_ _ _|");	
				}
				else {
					System.out.format("|_____|_____|_____|");	
				}
				 
				System.out.format("\t%n");
								
				
			}
			if(Kazandi==true) {				
				
				System.out.format( "	       X");
			}
			
		}
		catch (Exception e) {
			
		}	
	}

	public void Oyna() {
		
		Scanner scan =new Scanner(System.in);
		String Sec;
		String komut="WASD";
		char SecilenHarf =' ';
		Yonlendir(SecilenHarf);
		while (SecilenHarf!='C' && Kazandi==false) {
			System.out.println("\n Gidece�iniz Yonu belirtiniz : A=sol , S=Asag�, D=sa�, W=yukar�. Bitirmek i�in 'C' :");
			Sec=scan.next();
			Sec= Sec.toUpperCase();
			SecilenHarf=Sec.charAt(0);
			if (komut.contains(String.valueOf(SecilenHarf))) {				
				
				Yonlendir(SecilenHarf);				
			}
			else if (SecilenHarf=='C') {
				break;
			}
			else {
				System.out.println("Komutlar d���nda bir deger  yazd�n�z tekrar deneyiniz.");
			}
		}
		
	}

}