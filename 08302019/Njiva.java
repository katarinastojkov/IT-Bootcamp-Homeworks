//Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos po kvadratnom metru moze da se promeni. 
//Oznaka vrste je N. Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. Tekstualni oblik je Parcela:PrinosPoKvM.
public class Njiva extends Parcela {
	private double prinosPoKv;
	

	public Njiva(double povrsina, double prinosPoKv) {
		super(povrsina);
		this.oznaka='N';
		this.prinosPoKv=prinosPoKv;
	}

	@Override
	public double getPrinos(int godine) {
		return povrsina*prinosPoKv;
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()+":"+ prinosPoKv);
		return sb.toString();
	}

}
