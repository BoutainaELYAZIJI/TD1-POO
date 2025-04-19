package partie1;

public class Main{
	
	public static void main(String[] args) {
		String texte = args.length >0 ? args[0] : "123";
		
		ChaineCaractere chaine =new ChaineCaractere(texte);
		
		if(chaine.estNumerique()) {
			System.out.println("La chaine est Numérique.");
			int nombre = chaine.convertirEnEntier();
			
			System.out.println("Le Nombre est "+nombre);
			int [] tab = chaine.convertirEnTableau();
			System.out.println("Tableau avant Tri :");
//			System.out.println(Arrays.toString(tab));
			chaine.affichertableau(tab);
			System.out.println("\nTableau apres Tri :");
			chaine.triInsertion(tab);
			chaine.affichertableau(tab); }
		
		else 
			System.out.println("La chaine n'est pas Numérique.");
		
	}	

	// Expression ternaire
	// System.out.println(chaine.estNumerique()?"La chaine est Numérique." : "La chaine n'est pas Numérique.");
		
		
		
}