package package_ghiozdan;

public class Caiet extends Rechizita {

    public Caiet (String eticheta) {
        super(eticheta);
    }

    public String getNume(){
        return "Caiet " + eticheta;
    }
}
