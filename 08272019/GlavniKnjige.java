package domaciklaseprvicas;

import java.io.ObjectInputStream.GetField;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige k = new Knjige ("Zahir", "Paulo Koeljo", "300");
		k.setGodinaIzdanja(1970);
		
		Knjige k2= new Knjige ("Formule ljubavi", "Zoran Milivojevic", "400");
		k2.setGodinaIzdanja(1980);
		
		Knjige k3= new Knjige ("Senka vetra", "Karlos Ruis Safon", "350");
		k3.setGodinaIzdanja(1975);
	
		System.out.println("Naziv knjige" + " | " + "Autor" + " | " + "Broj strana"+ " | " + "Godina izdanja");
		System.out.println(k.getNazivKnjige() + ", " + k.getAutor()+ ", " + k.getBrStrana()+ ", " + k.getGodinaIzdanja());
		System.out.println(k2.getNazivKnjige() + ", " + k2.getAutor()+ ", " + k2.getBrStrana()+ ", " + k2.getGodinaIzdanja());
		System.out.println(k3.getNazivKnjige() + ", " + k3.getAutor()+ ", " + k3.getBrStrana()+ ", " + k3.getGodinaIzdanja());
		

	}

}
