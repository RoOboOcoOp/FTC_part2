package br.ufop.controller;

import java.util.ArrayList;

/** Classe que contem as estruturas e metodos para dividir a entrada do usuario
 * passando um arrayList como parametro
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class DividirTags {

    /**
     *
     * @param entrada
     * @return
     */
    @SuppressWarnings("ImplicitArrayToString")
    public String divideTags(String entrada){
        String erro = "Não informou TAG.";
        if(entrada.contains(":")){
            String[] arr = entrada.split("[:]",2);
            return arr.toString();
        }else
        return erro;
        
    }
    public String divideTagsArquivo(String entrada){
        String erro = "Não informou TAG.";
        if(entrada.contains(":")){
            String[] arr = entrada.split("[:]",2);
            return arr.toString();
        }else
        return erro;
    }
    
}
