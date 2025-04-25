public class Student {

    private String ime;
    private String prezime;
    private String oib;
    private String jmbg;
    private String nazivFakulteta;

    public Student(String ime, String prezime, String oib, String jmbg, String nazivFakulteta) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.jmbg = jmbg;
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    @Override
    public String toString() {
        return ime + "," + prezime + "," + oib + "," + jmbg + "," + nazivFakulteta;
    }
}
