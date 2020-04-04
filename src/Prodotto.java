
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Famiglia Luisi
 */
public class Prodotto implements Serializable{

    int codice, quantita, prezzo, sottoscorta;
    String descrizione, categoria;

    public Prodotto(int codice, int quantita, int prezzo, int sottoscorta, String descrizione, String categoria) {
        this.codice = codice;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.sottoscorta = sottoscorta;
        this.descrizione = descrizione;
        this.categoria = categoria;
    }

    public int getCodice() {
        return codice;
    }

    public int getQuantita() {
        return quantita;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getSottoscorta() {
        return sottoscorta;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setSottoscorta(int sottoscorta) {
        this.sottoscorta = sottoscorta;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

 public void reload(ArrayList arr,int i){
     arr.clear();
      for (int j = 0; j < i; j++) {
                arr.add(Finestra1.vet[j]);
                System.out.println("realoaded");
            }
 }
    
    public void delate() {
        descrizione = null;
        codice = 0;
        prezzo = 0;
        quantita = 0;
        sottoscorta = 0;
        categoria = null;

    }

}
