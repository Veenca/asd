
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UTENTE
 */
public class ProvaFinestre {

    static Finestraprincipale finestraprincipale;
    static int dim = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Finestra1.i=0;
        ArrayList<String> namesList = new ArrayList<String>();
        finestraprincipale = new Finestraprincipale();
        finestraprincipale.setSize(600, 500);
        finestraprincipale.setLocation(100, 100);
        finestraprincipale.setVisible(true);
        //  System.out.println("var " + Finestra1.variabilestatica);
        try{
        FileInputStream in = new FileInputStream("Prodotti");
        ObjectInputStream ois = new ObjectInputStream(in);

        ArrayList<Prodotto> woi = new ArrayList<>();
        woi = (ArrayList<Prodotto>) ois.readObject();
       ois.close();
       in.close();
        
    for(int i=0;i<woi.size();i++){
     //   System.out.println(woi.get(i).getDescrizione());
        int c,p,s,q;
        String d,cat;
        c=woi.get(i).getCodice();
        p=woi.get(i).getPrezzo();
        s=woi.get(i).getSottoscorta();
        q=woi.get(i).getQuantita();
        d=woi.get(i).getDescrizione();
        cat=woi.get(i).getCategoria();
        
        Finestra1.vet[Finestra1.i]=new Prodotto(c,q,p,s,d,cat);
        Finestra1.i++;
    }
        // System.out.println(s);
    }catch(IOException ex){
            System.out.println("elenco vuoto");}
}
}