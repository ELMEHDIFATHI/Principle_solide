package tp1.versionInterface;

public class AireCal1 implements InterfaceAire{


    @Override
    public double Aire() {
        Cercle c=new Cercle(12);
        double aire=c.getRayon()*c.getRayon()*Math.PI;
        return aire;
    }
}
