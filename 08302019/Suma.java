//Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju godina. 
//Oznaka vrste je S. Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje). Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
//*Ovo se ostvaruje pozivom super.toString();

public class Suma extends Parcela {
	private double povrsinaStabla;
	private double prinosPoZrelomStablu;
	private int sazrevanje;

	public Suma(double povrsina, double povrsinaStabla, double prinosPoZrelomStablu, int sazrevanje) {
		super(povrsina);
		this.povrsinaStabla = povrsinaStabla;
		this.prinosPoZrelomStablu = prinosPoZrelomStablu;
		this.sazrevanje = sazrevanje;
		this.oznaka = 'S';
	}

	

	

	@Override
	public double getPrinos(int godine) {

		return povrsina/povrsinaStabla*prinosPoZrelomStablu*(godine/sazrevanje);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()+":("+povrsinaStabla+","+ prinosPoZrelomStablu+","+sazrevanje+")");
		return sb.toString();
	}

}
