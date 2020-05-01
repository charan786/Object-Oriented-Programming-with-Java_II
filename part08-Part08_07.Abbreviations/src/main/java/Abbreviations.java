
import java.util.HashMap;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Abbreviations {
    private HashMap<String, String> translations;
    
    public Abbreviations(){
        translations = new HashMap<>();
    }
    
    
    public void addAbbreviation(String abbreviation, String explanation){
        translations.put(abbreviation,explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.translations.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.translations.get(abbreviation);
    }
    
}
