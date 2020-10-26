package ro.mta.facc.slab;

public class Carte implements Comparable<Carte> {
    private String titlul;
    private String autor;
    private int anAparitie;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
        if(this.nrPagini<o.nrPagini)
            return -1;
        if(this.nrPagini>o.nrPagini)
            return 1;

        return 0;
    }

    public Carte(String titlul, String autor, int anAparitie, int nrPagini) {
        this.titlul = titlul;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.nrPagini = nrPagini;
    }



    @Override
    public String toString() {
        return this.titlul+ " scrisa de " + this.autor +" a fost publicata in anul " +this.anAparitie ;
    }


}
