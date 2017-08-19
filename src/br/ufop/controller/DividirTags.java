package br.ufop.controller;

import java.util.ArrayList;

/** Classe que contem as estruturas e metodos para dividir a entrada do usuario
 * passando um arrayList como parametro
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class DividirTags {
    public String divideTags(String entrada){
        // Recebe uma string ou arquivo cria estrutura de lista para receber cada TAG relativa a entrada do usuário em sua posição correspondente
        /*int i;
        ArrayList<String> copia_string;
        copia_string = new ArrayList<>(100);
        
        
        for(i=0;i<(entrada.length());i++){
            copia_string.add(i, entrada[i]);
        }
        return copia_string;*/
        return entrada;
    }
    public String divideTagsArquivo(String entrada){
        
        return entrada;
    }
    
}
