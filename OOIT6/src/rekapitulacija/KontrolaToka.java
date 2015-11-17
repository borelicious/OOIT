package rekapitulacija;

public class KontrolaToka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*	System.out.println("Hello world!");

		int a;
		a = 2+2;
		int b = 0;
		if (a>0)
			System.out.println("Broj je pozitivan!");
		else if(a<0)
			System.out.println("Broj je negativan!");
		else
			System.out.println("Broj je jednak nulli!");

		String text = "Ovo je neki text!";
		System.out.println(text);

		String prviText = "Ovo je text";
		String drugiText = "iz dva dela";
		String ceoText = prviText + drugiText;
		System.out.println(ceoText);
		System.out.println(prviText+" "+drugiText);

		System.out.println("Vrednost broja a je "+a+", a broja b je "+b+"!");

		int i = 10;
		System.out.println("Ispis brojeva od 10 do 5:");
		while(i>=5){
			System.out.println(i--);
		}

		System.out.println("Ispis brojeva for petljom: ");
		for(int j = 0; j<11; j++)
			System.out.println(j);

		System.out.println("Ispis parnih brojefva od 20 do 0: ");
		for(i = 20; i>=0; i-=2)
			System.out.println(i);

		System.out.println("Suma prvih 10 prirodnih brojeva: ");
		int k, sum = 0;
		for(k = 0; k<11 ; k++)
			sum+=k;
		System.out.println(sum);
		
		// NIZOVI
		
		int niz[] = new int[5];
		niz[0] = 10;
		niz[1] = 20;
		niz[2] = 30;
		niz[3] = 40;
		niz[4] = 50;
		
		int niz1[] = {10,20,30,40,50};
		System.out.println("Treci element niza: "+niz1[2]);
		
		System.out.println("Ispis elemenata niza: ");
		for(i = 0; i<niz1.length; i++)
			System.out.println((i+1)+". elemenat niza je: "+niz1[i]);*/

		int zbir = sabiranje(5, 6);
		System.out.println(zbir);
		System.out.println(povrsinaKruga(2));
		konobar("Sinisa");
		konobarDonesi("Nes", "fAnta");
		

	}
	
	public static int sabiranje(int x, int y) {
		int zbir = x+y;
		return zbir;
	}
	
	public static double povrsinaKruga(int r) {
		double povrsina = r*r*Math.PI;
		return povrsina;
	}
	
	public static void konobar(String ime) {
		System.out.println("Dobar dan, izvolite " + ime +"!");
		return;
	}
	
	public static double konobarDonesi(String kafa, String sok) {
		double sokCena = 139.99, kafaCena = 108.99;
		double racun = 0;
		if(kafa.equalsIgnoreCase("nes") && sok.equalsIgnoreCase("fanta")){
			racun = sokCena + kafaCena;
			System.out.println("Vas racun je " + racun);
		}
		return racun;
	}

}
