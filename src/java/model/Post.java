/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Afik
 */
public class Post {

    /**
     * Creates a new instance of Post
     */
    private String Judul;
    private String Konten;
    private String Date;
    
    public Post() {
        
    }

    /**
     * @return the Judul
     */
    public String getJudul() {
        return Judul;
    }

    /**
     * @param Judul the Judul to set
     */
    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    /**
     * @return the Konten
     */
    public String getKonten() {
        return Konten;
    }

    /**
     * @param Konten the Konten to set
     */
    public void setKonten(String Konten) {
        this.Konten = Konten;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
    
    
}
