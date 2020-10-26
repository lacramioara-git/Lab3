package ro.mta.facc.slab;
import java.util.ArrayList;

public class Biblioteci extends Biblioteca{

    private ArrayList<Carte> carti_b;

    public Biblioteci() {
        carti_b=new ArrayList<Carte>();
    }

    @Override
    public void add(Carte c) {
        carti_b.add(c);
    }

    public void combine(Biblioteca b1,Biblioteca b2){


            for(int j=0;j< b1.get_carti().size() ;j++)
            {
                carti_b.add(b1.get_carti().get(j));
            }
            for(int j=0;j<b2.get_carti().size();j++)
            {
                carti_b.add(b2.get_carti().get(j));
            }

    }


    @Override
    public String toString() {

        StringBuilder builder=new StringBuilder();
        builder.append("Biblioteca contine:\n");
        for(Carte c :carti_b)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
