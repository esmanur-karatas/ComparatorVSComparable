import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ComparatorVsComparable {

	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<>() {
			{
				add(new Phone("Iphone", "13 Pro Max", 16, 256, 2021));
				add(new Phone("Xioami", "Redmi Note 13", 18, 512, 2023));
				add(new Phone("Samsung", "Galaxy s24", 32, 128, 2024));
				add(new Phone("Samsung", "Galaxy s23", 12, 256, 2022));
			}
		};

		for(Phone phone: phones) {
			System.out.println(phone);
		}
		
		System.out.println("\nCollectionlarla Yıla Göre Sıralı Listelenmesi:");
		Collections.sort(phones);
		Phone.PhoneWrite(phones);
		
		System.out.println("\nCollectionlarla Yıla Göre Büyükten Küçüğe Sıralı Listelenmesi:");
		Collections.reverse(phones);
		Phone.PhoneWrite(phones);
		
		System.out.println("\nComparator İle Hafızaya Göre Karşılaştırma:");
		Comparator<Phone> hafiza = new Comparator<Phone>() {

			@Override
			public int compare(Phone o1, Phone o2) {
				if(o1.getHafiza() > o2.getHafiza()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		Collections.sort(phones,hafiza);
		Phone.PhoneWrite(phones);
		
		System.out.println("\nHafızaya Göre Büyükten Küçüğe Sıralı Listelenmesi:");
		Collections.reverse(phones);
		Phone.PhoneWrite(phones);
		
		System.out.println("\nLambda İfadesiyle Ram'i Küçükten Büyüğe Sıralama: ");
		Collections.sort(phones,(tel1,tel2)->{if(((Phone)tel1).getRam()>tel2.getRam()) return 1; else return -1;});
		Phone.PhoneWrite(phones);
		
		System.out.println("\nLambda İfadesiyle Ram'i Büyükten Küçüğe Sıralama: ");
		Collections.reverse(phones);
		Phone.PhoneWrite(phones);
		
	}

}
