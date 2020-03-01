import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Ronaldo", "ACF");
        Igrac igrac2 = new Igrac("Ronaldo", "ACF");
        Igrac igrac3 = new Igrac("Ronaldo", "ACF");
        Igrac igrac4 = new Igrac("Ronaldo", "ACF");
        Igrac igrac5 = new Igrac("Ronaldo", "ACF");
        Igrac igrac6 = new Igrac("Ronaldo", "ACF");
        List<Igrac> igraciReal = new ArrayList<>();
        igraciReal.add(igrac1);
        igraciReal.add(igrac2);
        igraciReal.add(igrac3);
        Tim real = new Tim("Real", igraciReal);
        Tim barca = new Tim("Barca");
        barca.addIgrac(igrac4);
        barca.addIgrac(igrac5);
        barca.addIgrac(igrac6);
        Natprevar elClasico = new Natprevar(real, barca);
        Natprevar nat1 = new Natprevar(real, barca);
        Natprevar nat2 = new Natprevar(real, barca);
        elClasico.dadeGol(igrac1);
        elClasico.dadeGol(igrac4);
        Kolo premierLiga = new Kolo("Premier");
        premierLiga.addNatprevar(elClasico);
        premierLiga.addNatprevar(nat1);
        premierLiga.addNatprevar(nat2);
        boolean sorted = false;
        while (true){
            System.out.println("Vnesi true/false");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.equals("true")){
                sorted = true;
                break;
            }
            if(input.equals("false")){
                sorted = false;
                break;
            }
        }


        premierLiga.print(sorted);


    }
}
