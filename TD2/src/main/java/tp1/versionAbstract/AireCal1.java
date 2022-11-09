package tp1.versionAbstract;

public class AireCal1 implements InterfaceAire {


    @Override
    public double Aire() {
        Cercle c=new CercleHerite(12);
        double aire=c.getRayon()*c.getRayon()*Math.PI;
        return aire;
    }
}
