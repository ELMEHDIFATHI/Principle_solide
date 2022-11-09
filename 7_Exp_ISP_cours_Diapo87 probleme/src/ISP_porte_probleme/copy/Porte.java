package ISP_porte_probleme.copy;
public class Porte implements IPorte {

	@Override
	public void fermer() {
		System.out.println("Porte est fermee");
	}
	@Override
	public void ouvrir() {
		System.out.println("Porte est ouverte");
	}
	@Override
	public void generergenererAlerte() {
		System.out.println("Alerte fermeture...");
	}
}
