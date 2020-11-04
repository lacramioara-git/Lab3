package ro.mta.facc.slab;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

    private ArrayList<Carte> listaCarti;

    public Biblioteca() {
        this.listaCarti =new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> listaCarti) {
        this.listaCarti =new ArrayList<Carte>();

       for(Carte c : listaCarti)
       {
           this.listaCarti.add(c);

       }
    }

    @Override
    public String toString() {

        StringBuilder builder=new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for(Carte c : listaCarti)

        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public void add(Carte c)
    {

        this.listaCarti.add(c);
    }
    public void sort()
    {
        Collections.sort(listaCarti);
    }

    public void remove_book(Carte c)
    {
        listaCarti.remove(c);

    }

    public int nr_carti() {
        int nr=0;

        nr=this.listaCarti.size();

        return nr;
    }


    public ArrayList<Carte> get_carti()
    {

        return this.listaCarti;

    }


}
