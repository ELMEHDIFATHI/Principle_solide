public  class Rectangle extends Forms {

protected int hauteur;
protected int largeur;

    public Rectangle(int largeur, int hateur) {
        super(largeur, hateur);
    }

    public void setHauteur(int h) { this.hauteur = h; }
public int getHauteur() { return this.hauteur; }
public void setLargeur(int l) { this.largeur = l; }
public int getLargeur() { return this.largeur; }
    @Override
public int aire() {
    return this.hauteur*this.largeur;
}
}


