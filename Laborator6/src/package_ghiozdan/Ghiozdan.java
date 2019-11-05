package package_ghiozdan;

import java.util.ArrayList;
import java.util.List;

public class Ghiozdan {

    private Rechizita[] rechizite;
    private int size;
    private int pozitie;

    public Ghiozdan (int size) {

        rechizite = new Rechizita[size];
        pozitie = 0;
        this.size = size;
    }

    public void add (Caiet caiet) {
        if (pozitie < size){
            rechizite[pozitie] = caiet;
            pozitie++;
        }
    }

    public void add (Manual manual) {
        if (pozitie < size){
            rechizite[pozitie] = manual;
            pozitie++;
        }
    }

    public void listItems (){
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Rechizita)
            System.out.println(rechizite[i].getNume() + " ");
        }
    }

    public void listManual (){
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Manual)
                System.out.println(rechizite[i].getNume() + " ");
        }
    }

    public void listCaiet (){
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Caiet)
                System.out.println(rechizite[i].getNume() + " ");
        }
    }

    public int getNrRechizite (){
        int contor = 0;
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Rechizita)
                contor++;
        }
        return contor;
    }

    public int getNrManuale (){
        int contor = 0;
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Manual)
                contor++;
        }
        return contor;
    }

    public int getNrCaiete (){
        int contor = 0;
        for (int i = 0 ; i < size; i++){
            if (rechizite[i] instanceof Caiet)
                contor++;
        }
        return contor;
    }
}
