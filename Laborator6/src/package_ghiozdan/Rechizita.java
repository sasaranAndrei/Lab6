package package_ghiozdan;

abstract public class Rechizita {

    protected String eticheta;

    Rechizita (String eticheta){
        this.eticheta = eticheta;
    }

    public String getEticheta() {
        return eticheta;
    }

    abstract public String getNume();
}
