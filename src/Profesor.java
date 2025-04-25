public class Profesor {

    private String ime;
    private String prezime;
    private String oib;
    private String nazivFakulteta;

    public Profesor(String ime, String prezime, String oib, String nazivFakulteta) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    @Override
    public String toString() {
        return ime + "," + prezime + "," + oib + "," + nazivFakulteta;
    }
}
