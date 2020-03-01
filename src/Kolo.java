import java.util.ArrayList;
import java.util.List;

public class Kolo {
    String ime;
    List<Natprevar> natprevari;

    public Kolo(String ime, List<Natprevar> natprevari) {
        this.ime = ime;
        this.natprevari = natprevari;
    }

    public Kolo(String ime) {
        this.natprevari = new ArrayList<>();
        this.ime = ime;
    }

    public void addNatprevar(Natprevar natprevar){
        natprevari.add(natprevar);
    }

    public void print(boolean sorted){
        if(sorted){
            System.out.println("Finished: ");
            for (int i = 0; i < natprevari.size(); i++) {
                if(natprevari.get(i).isZavrshen()){
                    natprevari.get(i).print();
                }
            }
            System.out.println("Ongoing: ");
            for (int i = 0; i < natprevari.size(); i++) {
                if(!natprevari.get(i).isZavrshen()){
                    natprevari.get(i).print();
                }
            }
        }else {
            for (int i = 0; i < natprevari.size(); i++) {
                natprevari.get(i).print();
            }
        }
    }
}
