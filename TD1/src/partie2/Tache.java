package partie2;

public class Tache {
    private int id;
    private String intitule;
    private String description;
    private String responsable;
    private String etat; // "en cours", "annulee", "realisee"

    public Tache() {
        this.id = 0;
        this.intitule = "Non défini";
        this.description = "Non définie";
        this.responsable = "Non assigné";
        this.etat = "en cours"; // Valeur par défaut
    }

    public Tache(int id, String intitule, String description, String responsable, String etat) {
        setId(id);
        this.intitule = intitule;
        this.description = description;
        this.responsable = responsable;
        setEtat(etat); // Validation via setter
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Error ! L'ID doit être un nombre positif.");
        }
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

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        // Validation : L'état doit être "en cours", "annulee" ou "realisee"
        if (etat.equalsIgnoreCase("en cours") || etat.equalsIgnoreCase("annulee") || etat.equalsIgnoreCase("realisee")) {
            this.etat = etat.toLowerCase();
        } else {
            System.out.println("Erreur : État invalide. Valeurs possibles : en cours, annulee, realisee.");
        }
    }
}
