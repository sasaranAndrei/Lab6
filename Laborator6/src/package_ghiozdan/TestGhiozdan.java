package package_ghiozdan;

public class TestGhiozdan {
    public static void main (String args[]){
        Ghiozdan g = new Ghiozdan(6);
/*
        Caiet c1 = new Caiet ();
        Caiet c2 = new Caiet ();
        Manual m = new Manual ();
  */
        Caiet c1 = new Caiet ("Mate");
        Caiet c2 = new Caiet ("Romana");
        Caiet c3 = new Caiet ("Dictando");
        Manual m1 = new Manual ("Fizica");
        Manual m2 = new Manual ("Chimie");

        g.add(c1);
        g.add(c2);
        g.add(c3);
        g.add(m1);
        g.add(m2);

        int nrRechizite = g.getNrRechizite();
        int nrCaiete = g.getNrCaiete();
        int nrManuale = g.getNrManuale();

        System.out.println("Numarul de rechizite din ghiozdan este : " + nrRechizite);
        System.out.println("Numarul de caiete din ghiozdan este : " + nrCaiete);
        System.out.println("Numarul de manuale din ghiozdan este : " + nrManuale);

        g.listItems();
        System.out.println();
        g.listManual();
        System.out.println();
        g.listCaiet();
        System.out.println();


    }
}
