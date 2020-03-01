import java.util.ArrayList;
import java.util.List;

public class Natprevar {
    private Tim doma;
    private List<Igrac> poenterDoma;
    private Tim gosti;
    private List<Igrac> poenterGosti;
    private boolean isZavrshen;

    public boolean isZavrshen() {
        return isZavrshen;
    }

    public Natprevar(Tim doma, Tim gosti) {
        this.doma = doma;
        this.gosti = gosti;
        this.isZavrshen = false;
        this.poenterDoma = new ArrayList<>();
        this.poenterGosti = new ArrayList<>();
    }

    public void dadeGol(Igrac poenter){
        if(doma.getIgraci().contains(poenter)){
            poenterDoma.add(poenter);

        } else {
            poenterGosti.add(poenter);

        }
    }

    public void print() {
        if(isZavrshen){
            if(poenterDoma.size() > poenterGosti.size()){
                System.out.println(doma.getIme().toUpperCase() + " " + poenterDoma.size() + ":" + poenterGosti.size() + " " + gosti.getIme().toLowerCase() + " - finished");
            } else if (poenterGosti.size() > poenterDoma.size()){
                System.out.println(doma.getIme().toLowerCase() + " " + poenterDoma.size() + ":" + poenterGosti.size() + " " + gosti.getIme().toUpperCase() + " - finished");
            } else {
                System.out.println(doma.getIme().toLowerCase() + " " + poenterDoma.size() + ":" + poenterGosti.size() + " " + gosti.getIme().toLowerCase() + " - finished");
            }
        } else {
                System.out.println(doma.getIme().toLowerCase() + " " + poenterDoma.size() + ":" + poenterGosti.size() + " " + gosti.getIme().toLowerCase() + " - ongoing");
        }
        if(!poenterDoma.isEmpty()){
            System.out.print("Home scorers: ");
            for (int i = 0; i < poenterDoma.size(); i++) {
                poenterDoma.get(i).print();
            }
            System.out.println();
        }
        if(!poenterGosti.isEmpty()){
            System.out.print("Away scorers: ");
            for (int i = 0; i < poenterGosti.size(); i++) {
                poenterGosti.get(i).print();
            }
            System.out.println();
        }
    }
}
