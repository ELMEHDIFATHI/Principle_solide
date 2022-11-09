package tp1.versionInterface;

public class AireCal2 implements InterfaceAire{


    @Override
    public double Aire() {
        Rectangle r=new Rectangle(12,3);
        double aire=r.getHauteur()*r.getLargeur();
        return aire;
    }
}
