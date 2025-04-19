package partie2;

public class Projet {
    private String reference;
    private String intitule;
    private String description;
    private Tache[] taches;
    private String categorie;

    public Projet() {}

    public Projet(String reference, String intitule, String description, Tache[] taches, String categorie) {
        this.reference = reference;
        this.intitule = intitule;
        this.description = description;
        this.taches = taches;
        this.categorie = categorie;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tache[] getTaches() {
        return taches;
    }

    public void setTaches(Tache[] taches) {
        this.taches = taches;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afficherTachesParResponsable(String nom) {
//    	
//    	for (int i = 0; i < taches.length; i++) {
//			taches[i].
//		}
//    	
//    	for (Tache tache : taches) {
//			tache.
//		}
        for (Tache t : taches) {
            if (t.getResponsable().equalsIgnoreCase(nom)) {
                System.out.println("ID: " + t.getId() + ", Intitulé: " + t.getIntitule());
            }
        }
    }

    public int verifierTacheParId(int id) {
        for (int i = 0; i < taches.length; i++) {
            if (taches[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void afficherEtatTaches() {
        int enCours = 0, annulee = 0, realisee = 0;
        for (Tache t : taches) {
            switch (t.getEtat()) {
                case "en cours":
                    enCours++;
                    break;
                case "annulee":
                    annulee++;
                    break;
                case "realisee":
                    realisee++;
                    break;
            }
        }
        System.out.println("En cours: " + enCours + ", Annulées: " + annulee + ", Réalisées: " + realisee);
    }

    public static Projet[] filtrerProjetsParCategorie(Projet[] projets, String categorie) {
        int count = 0;
        
        // Compter le nombre de projets 
        for (Projet projet : projets) {
            if (projet.categorie.equalsIgnoreCase(categorie)) {
                count++;
            }
        }
        // Créer un tableau pour stocker les projets
        Projet[] projetsFiltres = new Projet[count];
        int index = 0;

        for (Projet projet : projets) {
            if (projet.categorie.equalsIgnoreCase(categorie)) {
                projetsFiltres[index++] = projet;
            }
        }
        
        return projetsFiltres;
    }

	
}
