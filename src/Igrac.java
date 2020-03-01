public class Igrac {
    String ime;
    String pozicija;

    public Igrac(String ime, String pozicija) {
        this.ime = ime;
        this.pozicija = pozicija;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }
    public void print(){
        System.out.print(ime + " (" + pozicija + ") ");
    }
}
