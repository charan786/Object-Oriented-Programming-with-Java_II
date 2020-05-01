
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
        if(translations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        String meaning ="";
        meaning= translations.get(abbreviation);
        if(meaning != null){
            return meaning;
        }
        return null;
    }
    
}
