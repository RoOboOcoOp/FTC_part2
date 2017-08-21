package br.ufop.view;

import br.ufop.controller.Tags;
import static br.ufop.model.GerArquivo.Read;
import static br.ufop.model.GerArquivo.ReadTag;
import static br.ufop.model.GerArquivo.WriteTag;
import static br.ufop.model.GerArquivo.WriteTagVet;
import java.io.IOException;
import java.lang.*;
import java.util.Arrays;
import static java.util.Date.parse;
import java.util.Scanner;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

/**
 * Interface gerenciadora com o usuario onde estão contidos as opções do menu.
 *
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class InterfaceUser {

    private static Scanner ler;

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //variaveis globais 
        boolean exit = false;
        String inicial;
        String[] divisaofinal;

        //entradas do usuário
        System.out.println("------\t Informe a STRING principal \t------");
        ler = new Scanner(System.in);
        inicial = ler.nextLine();

        System.out.println(inicial);
        
        
        do {
            
            String menu = null;
            System.out.println("------\t Analisador de Strings \t------");
            System.out.println(":f - Realizar divisão em tags da string do arquivo informado;");
            System.out.println(":l - Carregar um arquivo com definições de tags;");
            System.out.println(":o - Especificar o caminho do arquivo de saída para a divisão em tags;");
            System.out.println(":p - Realizar divisão em tags da entrada informada;");
            System.out.println(":s - Salvar as tags.");
            System.out.println(":q - Sair do programa.\n");

            while (menu == null) {
                System.out.print("\nEntre com o comando:\n");
                menu = ler.next();
            }
            
            
            
            switch (menu) {
                case ":f": {
                    /**
                     * Realiza a divisão em tags da string do arquivo informado
                     *
                     */
                    String caminho;

                    System.out.println("------\t Realizando divisão em tags da string do arquivo informado \t------");
                    System.out.println("Informe o caminho do arquivo:");
                    caminho = ler.next();

                    /*
                     Passa o caminho do arquivo com a string como parametro para o metodo de divisão das tags.
                     */
                    String arq = ("\\input.txt");
                    
                    if (!WriteTag(caminho + arq, inicial)) {
                        System.out.println("Erro ao salvar o arquivo!");
                    } else {
                        System.out.println("Arquivo salvo com sucesso!");
                    }
                }
                break;
                case ":l": {
                    /**
                     * Carrega um arquivo "tags.lex" com definições de tags
                     */
                    String caminho;

                    System.out.println("------\t Carregar um arquivo \"tags.lex\" com definições de tags \t------");
                    System.out.println("Informe o caminho do arquivo:");
                    caminho = ler.next();

                    String arq;
                    arq = ReadTag(caminho);
                    if(arq==null){
                        System.out.println("[INFO] As definições de tags não foram carregadas");
                    }
                    System.out.println(arq);

                }
                break;
                case ":o": {
                    /**
                     * Especifica o caminho do arquivo de saída "output.txt"
                     * para a divisão em tags;
                     */
                    String caminho;

                    System.out.println("------\t Especifica o caminho do arquivo de saída \"output.txt\" para a divisão em tags \t------");
                    System.out.println("Informe o caminho do arquivo:");
                    caminho = ler.next();

                    /*
                     Implementar o método que cria as tags.
                     */
                    if (WriteTag(caminho + "\\output.txt", "Ohhhhhh")) {
                        System.out.println("Arquivo foi salvo com sucesso!");
                    } else {
                        System.out.println("Erro ao salvar o arquivo!");
                    }

                }
                break;
                case ":p": {
                    /**
                     * Realiza a divisão em tags da STRING informada, metodo
                     * implementado pelo Controler (Gerenciador) metodo
                     * responsável comparaTags(string);
                     */
                    String INT = "[0-9]+"; //[\\d\\d]*, [0-9][9-0]*
                    String VAR = "[a-zA-Z0-9]+";
                    String EQUALS = "[=]+";
                    String SPACE = "[ ]+";
                    String COMMENT = "[\\/*[a-zA-Z0-9]+\\*/]*";
                    
                                    
                    System.out.println("------\t Realiza a divisão em tags da STRING informada \t-------");
                    Pattern pat1 = Pattern.compile(INT);
                    java.util.regex.Matcher mat1 = pat1.matcher(inicial);                 
                    Pattern pat2 = Pattern.compile(VAR);
                    java.util.regex.Matcher mat2 = pat2.matcher(inicial);
                    Pattern pat3 = Pattern.compile(EQUALS);
                    java.util.regex.Matcher mat3 = pat3.matcher(inicial);
                    Pattern pat4 = Pattern.compile(SPACE);
                    java.util.regex.Matcher mat4 = pat4.matcher(inicial);
                    Pattern pat5 = Pattern.compile(COMMENT);
                    java.util.regex.Matcher mat5 = pat5.matcher(inicial);
                    
                    String[] resultado = null;
                    int i = inicial.length();
                    do{
                        if(mat4.find()){
                            System.out.println("ER: "+SPACE);
                            System.out.print("SPACE"+mat4.start()+" ");
                        }else if(mat2.find()){
                            System.out.println("ER: "+EQUALS);
                            System.out.print("EQUALS"+mat2.start()+" ");
                        }else if(mat5.find()){
                            System.out.println("ER: "+COMMENT);
                            System.out.print("COMMENT"+mat5.start()+" ");
                        }else if(mat2.find()){
                            System.out.println("ER: "+VAR);
                            System.out.print("VAR"+mat2.start()+" ");
                        }else if(mat1.find()){
                            System.out.println("ER: "+INT);
                            System.out.print("INT"+mat1.start()+" ");
                        }
                    
                        
                        i--;
                    }while(i!=0);
                    
                   
                    System.out.println("String dividida com sucesso!!!\n");
                }
                break;
                case ":q": {
                    /**
                     * Realiza a saída do programa
                     */
                }
                System.out.println("Saindo do programa, obrigado pela visita!!!!");
                exit = true;
                break;
                case ":s": {
                    /**
                     * Salva as tags no arquivo "file.txt"
                     */
                    int tags_qtde = 0;
                    Scanner tag = new Scanner(System.in);
                    String caminho;
                    String[] tagVet;

                    System.out.println("------\t Salva as tags no arquivo \"file.txt\" \t-------");
                    System.out.println("Informe a quantidade de tags");
                    tags_qtde = ler.nextInt();

                    System.out.println("Informe o caminho do arquivo");
                    caminho = ler.next();

                    tagVet = new String[tags_qtde];
                    
                    
                    
                    for (int i = 0; i < tags_qtde; i++) {
                        System.out.println("Informe a " + (i + 1) + " tag :\t");
                        tagVet[i] = tag.nextLine();
                        if(tagVet[i].contains(":")){
                            continue;
                        }
                        else{
                            tagVet[i]=null;
                            System.out.println("Não fora informada uma TAG.");
                            System.out.println("Informe a " + (i + 1) + " tag :\t");
                            tagVet[i] = tag.nextLine();
                        }
                    }
                            
                    System.out.println(Arrays.toString(tagVet));

                    if (WriteTagVet(caminho + "\\file.txt", tagVet, tags_qtde)) {
                        System.out.println("Arquivo salvo com sucesso!");
                    } else {
                        System.out.println("Erro ao salvar o arquivo!");
                    }
                }
                break;
                default:
                    System.out.println("O comando não pode ser reconhecido pelo menu!");
                    break;
            }

        } while (exit == false);
    }

    private static String[] tag(String inicial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String divideTags(String inicial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

   

