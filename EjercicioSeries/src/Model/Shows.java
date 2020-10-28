/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author alepin
 */
public class Shows implements Serializable {
    
    private String tittle;
    private String scriptwriter;
    private int seasons;
    private String genre;
    private int views;

    public Shows(String tittle, String scriptwriter, int seasons, String genre, int views) {
        this.tittle = tittle;
        this.scriptwriter = scriptwriter;
        this.seasons = seasons;
        this.genre = genre;
        this.views = views;
    }

    
    public Shows() {
        this.tittle = "";
        this.scriptwriter = "";
        this.seasons = 0;
        this.genre = "";
        this.views = 0;
    }
    
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getScriptwriter() {
        return scriptwriter;
    }

    public void setScriptwriter(String scriptwriter) {
        this.scriptwriter = scriptwriter;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
    
    
    
    
}
