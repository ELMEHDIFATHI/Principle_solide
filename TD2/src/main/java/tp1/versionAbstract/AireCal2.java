package tp1.versionAbstract;

public class AireCal2 implements InterfaceAire {


    @Override
    public double Aire() {
        Rectangle r=new RectangleHerite(12,3);
        double aire=r.getHauteur()*r.getLargeur();
        return aire;
    }
}
