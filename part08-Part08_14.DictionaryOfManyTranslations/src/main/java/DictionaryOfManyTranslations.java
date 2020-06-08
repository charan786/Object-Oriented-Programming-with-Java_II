import java.util.HashMap;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> x;
    
    public DictionaryOfManyTranslations(){
        x = new HashMap<>();
    }
    public void add(String word, String translation){
        x.putIfAbsent(word, new ArrayList<>());
        x.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(!(x.get(word) == null)){
            return x.get(word);
        }
        return new ArrayList<String>();
    }
    
    
    public void remove(String word){
        x.remove(word);
    }
}
