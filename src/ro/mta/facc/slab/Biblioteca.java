package ro.mta.facc.slab;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public Biblioteca() {
        carti=new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> carti) {
        carti=new ArrayList<Carte>();

       for(Carte c :carti)
       {
           this.carti.add(c);
       }
    }

    @Override
    public String toString() {

        StringBuilder builder=new StringBuilder();
        builder.append("Biblioteca contine:\n");
        for(Carte c :carti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public void add(Carte c)
    {
        this.carti.add(c);
    }
    public void sort()
    {
        Collections.sort(carti);
    }

    public int nr_carti() {
        int nr=0;
        nr=this.carti.size();
        return nr;
    }


    public ArrayList<Carte> get_carti()
    {
        return this.carti;
    }


}
