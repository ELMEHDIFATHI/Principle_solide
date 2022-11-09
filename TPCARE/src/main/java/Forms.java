public abstract class Forms {

    private int largeur;
    private int hateur;

    public Forms(int largeur, int hateur) {
        this.largeur = largeur;
        this.hateur = hateur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHateur() {
        return hateur;
    }

    public void setHateur(int hateur) {
        this.hateur = hateur;
    }

    private int calAire(){
        return 0;
    }

    public abstract int aire();
}
