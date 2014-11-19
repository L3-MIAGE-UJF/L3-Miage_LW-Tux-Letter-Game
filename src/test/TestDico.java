/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import management.Dico;

/**
 *
 * @author douchetm
 */
public class TestDico {
    public static void main(String[] args) {
        Dico doci = new Dico("/tmp/lol");
        
        System.out.println(doci.addWordToDico(1, "truc"));
        System.out.println(doci.addWordToDico(1, "lol"));
        System.out.println(doci.addWordToDico(1, "lol2"));
        System.out.println(doci.addWordToDico(1, "lol3"));
        System.out.println(doci.addWordToDico(1, "lol4"));
        System.out.println(doci.addWordToDico(2, "dur"));
        
        System.out.println(doci.getPathToDicoFile());
        
        System.out.println(doci.getWordFromListLevel(1));

        System.out.println(doci.getWordFromListLevel(1));
        System.out.println(doci.getWordFromListLevel(1));
        System.out.println(doci.getWordFromListLevel(1));
        
        System.out.println("2"+doci.getWordFromListLevel(2));
    }
}