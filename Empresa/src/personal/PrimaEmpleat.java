package personal;

public class PrimaEmpleat {
	private String nom;
	private String directiu;
	private int antiguitat;

	public static void main(String[] args) {

		PrimaEmpleat e = new PrimaEmpleat("Elvira", "S", 11);

		calculaPrima(e);
	}

	private static void calculaPrima(PrimaEmpleat e) {
		int p = 0;
		if (e.antiguitat >= 0 && e.antiguitat < 1000) {
			if (e.directiu == "S") {
				if (e.antiguitat > 12)
					p = 660;
				else {
					p = 440;
				}
			} else if (e.directiu == "N") {
				if (e.antiguitat > 12)
					p = 165;
				else
					p = 110;
			} else
				System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
			if (p!=0)
			   System.out.println("La prima que li correspon a " + e.nom
			 		          + " és de " + p + " Euros");
		} else
			System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
	}

	public PrimaEmpleat(String nome, String dire, int ante) {
		this.nom = nome;
		this.directiu = dire;
		this.antiguitat = ante;
	}
}
