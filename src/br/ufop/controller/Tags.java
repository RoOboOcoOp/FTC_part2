package br.ufop.controller;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

import static java.nio.file.Paths.get;
import java.util.Arrays;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
//import  java.util.regex.PatternSyntaxException:


/** Classe para linguagem de definição das tags, implementa classe regex para construção das expressões regulares
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class Tags {
    //Estruturas com os padroes de expressão regular, classes regex
       /*private String INT = "[0-9][9-0]*";
       private String VAR = "[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*";
       private String EQUALS = "[=]";
       private String SPACE = "[ ]";
       private String COMMENT = "[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*";
   */
    /**
     *
     * @param nomeTag
     * @param expressaoreg
     * @return
     */
       @SuppressWarnings("InfiniteRecursion")
   public Tags(String nomeTag, String expressaoreg){
      
       /*this.getINT(INT,"[0-9][9-0]*");
       this.getVAR(VAR,"[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*");
       this.getEQUALS(EQUALS,"[=]");
       this.getSPACE(SPACE,"[ ]");
       this.getCOMMENT(COMMENT,"[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*");
       */
   }
        //String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //([\\w\\.])+@([a-zA-Z])+(\.([a-zA-Z])+)+
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy

        //String regex = "proj([^,])*";
        //String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto"; // dd/MM/yyyy

//        System.out.println("Email valido? "+ "#@!abrao@mail.br".matches(regex));
        /*Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while(matcher.find()){
            System.out.println(matcher.start() +" "+ matcher.group());
        }*/
  
    
   public String tagComparator(String Tags, String entrada){
       /*String[] resultado = null;
       int[] posicoes = null;
       int i;
       for(i=0; i<entrada.length(); i++){
            Pattern pattern = Pattern.compile(Tags);
            java.util.regex.Matcher matcher = pattern.matcher(entrada);
            if(matcher.find()){
                resultado[i] += getTag();
            }
       }
       
//       for(i=0; i<entrada.length();i++){
//           resultado[i] =(String) posicoes[i];
//       }*/
       return Tags;
   }

    /**
     * @return the INT
     */
//    public String getINT() {
//        return INT;
//    }
//
//    /**
//     * @param INT the INT to set
//     */
//    public void setINT(String INT) {
//        this.INT = INT;
//    }
//
//    /**
//     * @return the VAR
//     */
//    public String getVAR() {
//        return VAR;
//    }
//
//    /**
//     * @param VAR the VAR to set
//     */
//    public void setVAR(String VAR) {
//        this.VAR = VAR;
//    }
//
//    /**
//     * @return the EQUALS
//     */
//    public String getEQUALS() {
//        return EQUALS;
//    }
//
//    /**
//     * @param EQUALS the EQUALS to set
//     */
//    public void setEQUALS(String EQUALS) {
//        this.EQUALS = EQUALS;
//    }
//
//    /**
//     * @return the SPACE
//     */
//    public String getSPACE() {
//        return SPACE;
//    }
//
//    /**
//     * @param SPACE the SPACE to set
//     */
//    public void setSPACE(String SPACE) {
//        this.SPACE = SPACE;
//    }
//
//    /**
//     * @return the COMMENT
//     */
//    public String getCOMMENT() {
//        return COMMENT;
//    }

    /**
     * @param COMMENT the COMMENT to set
     */
    /*public void setCOMMENT(String COMMENT) {
        this.COMMENT = COMMENT;
    }
*/
    private void getINT(String INT, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getVAR(String VAR, String azzaAZZA0990) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getEQUALS(String EQUALS, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSPACE(String SPACE, String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getCOMMENT(String COMMENT, String azzaAZZA0990) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
           
}






