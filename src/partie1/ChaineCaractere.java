package partie1;
import java.lang.Character;


import java.util.Arrays;

public class ChaineCaractere {
    private String texte;

    // Constructeur par défaut
    public ChaineCaractere() {
        texte = "";
    }

    // Constructeur avec paramètre
    public ChaineCaractere(String ch) {
       this.texte = ch;
    }
    
    // Méthode pour vérifier si tous les caractères sont des chiffres

//	public boolean estNumerique() {
//	  for (int i = 0; i < texte.length(); i++) {	      
//		  if (!Character.isDigit(texte.charAt(i))) {	          
//			  return false;
//	      }
//	  }	  return true;
//	}
//	
    
    
    
    
    // Expression Régulière
    public boolean estNumerique() {
        return texte.matches("\\d+");  // Vérifie si `texte` ne contient que des chiffres
    }

    public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	// Méthode pour convertir le texte en entie	r
    public int convertirEnEntier() {
    	if(estNumerique()) {
    		 return Integer.parseInt(texte);
    		
    	}
    	return -1;
       
    }


// Méthode pour convertir chaque chiffre en tableau d'entiers
    
    public int[] convertirEnTableau() {
        int[] tableau = new int[texte.length()];
        for (int i = 0; i < texte.length(); i++) {
            tableau[i] = Character.getNumericValue(texte.charAt(i));
        }
        return tableau;

    }
      
    public int[] ConvertTab() {
    	
    	int [] tab = new int[texte.length()];
        for (int i = 0; i < texte.length(); i++) {  	
        	tab[i]= Character.getNumericValue(texte.charAt(i));   
        }    	
        
        return tab;
    }
  
   
   // Méthode pour trier un tableau d'entiers (tri par insertion)
    public void triInsertion(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            int temp = tableau[i];
            int j = i -1 ;
            while (j >= 0 && tableau[j] > temp) {
                tableau[j + 1] = tableau[j];
                j--;
            }
            tableau[j + 1] = temp;
        }
    }
   
    public void affichertableau(int[] tab) {
			System.out.print("[");
    	for (int i = 0; i < tab.length; i++) {
    		if (i == tab.length -1) {
				System.out.print(tab[i]+"]");
			}else {
				System.out.print(tab[i]+",");
			}
			
		}
    	

	}

public static void main(String[] args) {
		
		ChaineCaractere chaine = new ChaineCaractere("639920");
		
		if(chaine.estNumerique()) {
			System.out.println("La chaine est Numérique.");
			int s = chaine.convertirEnEntier();
			System.out.println("L'entier est:"+ s);
			int [] tab = chaine.convertirEnTableau();
			System.out.print("Tableau avant Tri: ");
//			System.out.println(Arrays.toString(tab));
			chaine.affichertableau(tab);
			System.out.print("\nTableau apres Tri: ");
			chaine.triInsertion(tab);
			System.out.println(Arrays.toString(tab));
			
		}else {
			System.out.println("La chaine n'est pas Numérique.");
		}
}
}
