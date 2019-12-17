import java.util.HashMap;
import java.util.Scanner;

public class Test {

	static HashMap<Integer, Ogrenci> ogrHashMap = new HashMap<Integer, Ogrenci>();
	static Scanner input = new Scanner(System.in);
	Ogrenci ogrenci;

	public static void ogrenciEkle(Ogrenci ogrenci) {

		ogrHashMap.put(ogrenci.getOgrNo(), ogrenci);

	}

	public static void ogrenciYaz(int ogrNo) {

		if (ogrHashMap.containsKey(ogrNo)) {

			System.out.println("Öðrenci: " + ogrHashMap.get(ogrNo));   // to Stringsiz yazdýrmazzz
		} 

		else {
			System.out.println("Bu numaraya sahip bir öðrenci yok");
		}
	}

	public static void main(String[] args) {

		Ogrenci o1 = new Ogrenci("Songül", 12, 4, Ogrenci.Cinsiyetler.KIZ);
		Ogrenci o2 = new Ogrenci("Sude", 8, 2, Ogrenci.Cinsiyetler.ERKEK);
		Ogrenci o3 = new Ogrenci("Bengisu", 50, 6, Ogrenci.Cinsiyetler.KIZ);
		Ogrenci o4 = new Ogrenci("Hatice", 22, 11, Ogrenci.Cinsiyetler.ERKEK);

		ogrenciEkle(o1);
		ogrenciEkle(o2);
		ogrenciEkle(o3);
		ogrenciEkle(o4);

		System.out.print("Öðrenci nosunu girin : ");
		int no;
		no = input.nextInt();
		ogrenciYaz(no);
	}
}
