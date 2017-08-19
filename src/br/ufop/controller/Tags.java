package br.ufop.controller;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import  java.util.regex.PatternSyntaxException:


/** Classe para linguagem de definição das tags, implementa classe regex para construção das expressões regulares
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class Tags {
    //Estruturas com os padroes de expressão regular, classes regex
   private String INT = "[0-9][9-0]*";
   private String VAR = "[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*";
   private String EQUALS = "[=]";
   private String SPACE = "[ ]";
   private String COMMENT = "[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*";
   
   public String[] tag(String entrada){
        String[] vetTags;
        vetTags = entrada.split(":", 2);
        System.out.println("Posicao 0 da TAG(NOME): "+vetTags[0]);
        System.out.println("Posicao 1 da TAG(ER): "+vetTags[1]);
        return vetTags;
    }
}




