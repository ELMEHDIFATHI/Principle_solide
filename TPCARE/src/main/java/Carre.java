public class Carre extends Rectangle {


    public Carre(int largeur, int hateur) {
        super(largeur, hateur);
    }

    @Override
public void setHauteur(int h) 
{ this.hauteur = h;	}
@Override
public void setLargeur(int l) 
{ this.hauteur = l;}

public void setCote(int s)
{
    this.setHauteur(s);
    this.setLargeur(s);
}
public int getCote() {
    return this.getHauteur();
}

public int aire() {
        return this.hauteur*this.largeur;
    }
}

