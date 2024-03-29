/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.edu.gymspmkr.bike;

/**
 *
 * @author bracek
 */
public class Bicykel {
    // trieda Bicykel má tri vlastnosti
    public int tempo;
    public int prevod;
    public int rychlost;
    // trieda Bicykel má jeden konštruktor
    public Bicykel() {
        System.out.println(". constructor Bicykel .");
    }

    public Bicykel(final int zacTempo,
final  int zacRychlost,
final  int zacPrevod) {
        prevod = zacPrevod;
        tempo = zacTempo;
        rychlost = zacRychlost;
    }
    // trieda Bicykel má štyri metódy
    public void nastavTempo(final int novaHodnota) {
        tempo = novaHodnota;
    }

    public int getPrevod() {
        return prevod;
    }

    public void setPrevod(final int prevod) {
        this.prevod = prevod;
    }

    public int getRychlost() {
        return rychlost;
    }

    public void setRychlost(final int rychlost) {
        this.rychlost = rychlost;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(final int tempo) {
        this.tempo = tempo;
    }

    public void nastavPrevod(final int novaHodnota) {
        prevod = novaHodnota;
    }

    public void brzdi(final int spomalenie) {
        rychlost -= spomalenie;
    }

    public void pridaj(final int zrychlenie) {
        rychlost += zrychlenie;
    }
}
