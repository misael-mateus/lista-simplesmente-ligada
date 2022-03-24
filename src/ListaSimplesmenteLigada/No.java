package ListaSimplesmenteLigada;

import java.util.Objects;

public class No<T> {


    private T informacaoPrincipal;
    private No<T> proximo;

    public No(T novaInformacao, No<T> proximo) {
        this.informacaoPrincipal = novaInformacao;
        this.proximo = proximo;
    }

    public No(T informacaoPrincipal) {
        this(informacaoPrincipal, null);
    }


    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getInformacaoPrincipal() {
        return this.informacaoPrincipal;
    }

    public No<T> getProximo() {
        return this.proximo;
    }

    public void setInformacaoPrincipal(T elemento) {
        this.informacaoPrincipal = elemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No<?> no = (No<?>) o;
        return Objects.equals(informacaoPrincipal, no.informacaoPrincipal) && Objects.equals(proximo, no.proximo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(informacaoPrincipal, proximo);
    }

    @Override
    public String toString() {
        return "informacaoPrincipal=" + informacaoPrincipal + ", proximo=" + proximo + '}';
    }
}
