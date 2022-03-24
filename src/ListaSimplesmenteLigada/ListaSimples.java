package ListaSimplesmenteLigada;


public class ListaSimples<T extends Comparable<T>> {
    private No<T> inicioLista;
    private No<T> fim;
    private int tamanho;


    public ListaSimples() {
        this.inicioLista = null;
        this.tamanho = 0;
    }

    public No<T> getInicioLista() {
        return inicioLista;
    }

    public int getTamanho() {
        return tamanho;
    }

    public No<T> getFim() {
        return fim;
    }

    public void inserirInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.setInformacaoPrincipal(elemento);
        novoNo.setProximo(inicioLista);
        inicioLista = novoNo;
        tamanho++;
    }

    public void inserirPrimeiroNo(No<T> aux) {
        aux.setProximo(this.inicioLista);
        this.inicioLista = aux;
        tamanho++;
    }

    public void inserirFinal(T obj) {
        No<T> inicio = inicioLista;
        No<T> auxiliar = new No(obj);
        auxiliar.setInformacaoPrincipal(obj);
        auxiliar.setProximo(null);

        if (inicioLista == null) {
            inicioLista = auxiliar;

        } else {
            while (inicio.getProximo() != null) {
                inicio = inicio.getProximo();
            }
            inicio.setProximo(auxiliar);
        }
    }

    public boolean isEmpty() {
        if (inicioLista == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removerFinal() {
        //ok
        if (inicioLista == null) {
            System.out.println("Não há elementos para remover");
        } else {
            No auxiliar = inicioLista;
            while (auxiliar != null) {
                if (auxiliar.getProximo().getProximo() == null) {
                    No auxiliar2 = fim;
                    fim = auxiliar;
                    fim.setProximo(null);
                }

                auxiliar = auxiliar.getProximo();

            }
        }
    }

    public void printLista() {
        No aux = inicioLista;

        System.out.println("lista");
        while (aux != null) {

            System.out.println(aux.getInformacaoPrincipal());
            aux = aux.getProximo();
        }
    }

    public void insercaoOrdenada(T valor) {
        var aux = new No<>(valor, null);
        var ptr = this.inicioLista;
        No<T> anterior = null;

        while ((ptr != null) && (valor.compareTo(ptr.getInformacaoPrincipal()) > 0)) {
            anterior = ptr;
            ptr = ptr.getProximo();
        }

        if (anterior != null) {
            aux.setProximo(ptr);
            anterior.setProximo(aux);
        } else {
            inserirPrimeiroNo(aux);
        }
    }


    public void remove_Inicio() {
        if (inicioLista == null) {
            System.out.println((String) null);
        } else {
            No<T> sair = inicioLista;
            inicioLista = inicioLista.getProximo();
            if (tamanho > 0) {
                tamanho--;
            }
        }
    }

    public boolean buscar(T entrada) {
        boolean resultado = false;

        No<T> q = inicioLista;
        while (q != null) {
            if (q.getInformacaoPrincipal().equals(entrada)) {
                resultado = true;
            }
            q = q.getProximo();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Lista_Simples{" +
                "inicio_Lista=" + inicioLista +
                '}';
    }
}