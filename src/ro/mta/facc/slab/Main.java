package ro.mta.facc.slab;


import java.lang.reflect.Array;

public class Main {
        public static void main(String[] args)
        {
            //ex2
            Carte c = new Carte("Ultima speranta","J.A",2001,1000);
         //   System.out.println(c.toString());
            Biblioteca b1=new Biblioteca();
            b1.add(c);
            b1.add(new Carte("Printre straini","P.C",1999,569));
            b1.add(new Carte("Codul lui Davinci","L.C",1890,1200));
          //  System.out.println(b1.toString());


            Biblioteca b2=new Biblioteca();
            b2.add(c);
            b2.add(new Carte("Printre straini vol2","P.C",2010,1009));
          //  System.out.println(b2.toString());

            Biblioteci b=new Biblioteci();
            b.combine(b1,b2);
            System.out.println(b.toString());

             // b1.sort();
            // System.out.println(b1.toString());



           // System.out.println(Thread.currentThread().getName());

            /*Thread.currentThread().setName("MyThread");
            System.out.println(Thread.currentThread().getName());
            */


            /*
            MyThread[] myThreadArr=new MyThread[10];
            for(int i=0;i<10;i++)
            {
                MyThread t=new MyThread();
                t.setName("" +i);
                t.start();
            }

            for(int i=0;i<10;i++)
            {

                try {
                    myThreadArr[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

             */



        }


    }
