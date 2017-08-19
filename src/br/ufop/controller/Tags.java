package br.ufop.controller;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

import java.util.Arrays;

//import  java.util.regex.PatternSyntaxException:


/** Classe para linguagem de definição das tags, implementa classe regex para construção das expressões regulares
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class Tags {
    //Estruturas com os padroes de expressão regular, classes regex
   private final String INT = "[0-9][9-0]*";
   private final String VAR = "[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*";
   private final String EQUALS = "[=]";
   private final String SPACE = "[ ]";
   private final String COMMENT = "[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*";
   
    /**
     *
     * @param inicial
     * @return
     */
    /*public String[] tag(String inicial){
       String[] fim = null;
        
       String[] arr = inicial.split(":");
         
       int i;
       for ( i = 0; i < arr.length; i++){   
            fim[i] += arr[i];   
       }
       
       //System.out.println(result);
       //fim = arr;
       //System.out.println(arr);
       //arr = entrada.split(":", 2);
       /*for(int i = 0; i < entrada.length(); i++){
           arr[i] = String.valueOf(entrada.charAt(i));
       }*/
       //return fim;
        
        /*else{
            return veTags=erro;
        }
        */
    //return veTags;
}






