package partie2;

public class MainProjet {
    public static void main(String[] args) {
        //  Création des tâches
        Tache[] taches = {
            new Tache(1, "Tache 1", "Desc 1", "Ali", "en cours"),
            new Tache(2, "Tache 2", "Desc 2", "Ali", "realisee"),
            new Tache(3, "Tache 3", "Desc 3", "Fatima", "annulee"),
            new Tache(4, "Tache 4", "Desc 4", "Fatima", "en cours")
        };

        // Création des projets
        Projet projet1 = new Projet("P1", "Projet Java", "TD Java", taches, "Informatique");
        Projet projet2 = new Projet("P2", "Projet Web", "Site e-commerce", new Tache[0], "Web");
        Projet projet3 = new Projet("P3", "Projet Mobile", "App Android", new Tache[0], "Informatique");

        // Tableau de projets
        Projet[] tousLesProjets = {projet1, projet2, projet3};

        //  Tester l'affichage des tâches et leur état
        System.out.println("État des tâches du projet " + projet1.getIntitule() + " :");
        projet1.afficherEtatTaches();
        System.out.println("--------------------------------------------------");

        //  Tester la recherche des tâches par responsable
        System.out.println("Tâches réalisées par 'Ali' :");
        projet1.afficherTachesParResponsable("Ali");
        System.out.println("--------------------------------------------------");
        

        //  Tester la recherche d’une tâche par ID
        int idRecherche = 2;
        int indexTache = projet1.verifierTacheParId(idRecherche);
        if (indexTache != -1) {
        	System.out.println("Tâche trouvée : " + projet1.getTaches()[indexTache].getIntitule());
        } else {
            System.out.println("Aucune tâche trouvée avec l'ID " + idRecherche);
        }
        System.out.println("--------------------------------------------------");

        // Tester le filtrage des projets par catégorie
        String categorieRecherchee = "Informatique";
        Projet[] projetsFiltres = Projet.filtrerProjetsParCategorie(tousLesProjets, categorieRecherchee);

        System.out.println("Projets dans la catégorie '" + categorieRecherchee + "' :");
        for (Projet p : projetsFiltres) {
            System.out.println(" - " + p.getIntitule());
        }
        System.out.println("--------------------------------------------------");
    
}
}
