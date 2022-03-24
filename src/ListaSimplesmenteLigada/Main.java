package ListaSimplesmenteLigada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int escolha;
        ListaSimples lista = new ListaSimples<>();


        System.out.println( " 1- insere inicio | 2- insere final | 3- remove inicio |" +
        " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");


        do {
            escolha = Integer.parseInt(bf.readLine());

            switch (escolha) {
                case 1:
                    System.out.println("----------------Inserir no Inicio da Lista----------------");
                    lista.inserirInicio(bf.readLine());
                    System.out.println("                INSERIDO COM SUSSESSO!!! \n\n" +
                            " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                case 2:
                    System.out.println("----------------Inserir no Final da Lista----------------");
                    lista.inserirFinal(bf.readLine());
                    System.out.println("                INSERIDO COM SUSSESSO!!! \n\n" +
                            " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                case 5:
                    System.out.println("----------------Buscando Na Lista----------------");
                    if (lista.buscar(bf.readLine()) == true) {
                        System.out.println("Esta na Lista! \n" +
                                " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                                " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                        break;
                    } else {
                        System.out.println("Não Esta na Lista! \n" +
                                " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                                " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                        break;
                    }
                case 4:
                    System.out.println("----------------Removendo Ultimo Item----------------");
                    lista.removerFinal();
                    System.out.println(".....................................................\n" +
                            "                Removido Com Sucesso!                 \n" +
                            " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                case 6:
                    System.out.println("----------------Listar o Conteudo----------------");
                    lista.printLista();
                    System.out.println("\n 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                case 3:
                    System.out.println("----------------Remover Inicio----------------");
                    lista.remove_Inicio();
                    System.out.println(".....................................................\n" +
                            "                Removido Com Sucesso!                 \n" +
                            " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                case 7:
                    System.out.println("----------------Inserção Ordenada----------------");
                    lista.insercaoOrdenada(bf.readLine());
                    System.out.println("                INSERIDO COM SUSSESSO!!! \n\n" +
                            " 1- insere inicio | 2- insere final | 3- remove inicio |" +
                            " 4- remove final | 5- busca | 6- imprime lista | 7- Inserção Ordenada");
                    break;

                default:
                    throw new IllegalStateException("Opção Inexistente: " + escolha);
            }

        } while (true);


    }
}

