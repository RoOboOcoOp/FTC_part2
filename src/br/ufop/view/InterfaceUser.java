package br.ufop.view;

import static br.ufop.model.GerArquivo.Read;
import static br.ufop.model.GerArquivo.ReadTag;
import static br.ufop.model.GerArquivo.WriteTag;
import static br.ufop.model.GerArquivo.WriteTagVet;
import java.io.IOException;
import java.lang.*;
import java.util.Arrays;
import static java.util.Date.parse;
import java.util.Scanner;

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
                    String[] fim = null;
        
                    String[] arr = inicial.split(":",2);
         
                    int i;
                    for ( i = 0; i < arr.length; i++){   
                        fim[i] += arr[i];   
                    }
                   
                    System.out.println("------\t Realiza a divisão em tags da STRING informada \t-------");
                    for(i=0; i<fim.length;i++){
                        System.out.println(fim[i]);
                    }
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
    
}

   

