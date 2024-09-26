package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Pessoa{
    Set<Conteudo> conteudosMinistrados = new HashSet<>();

    public void adicionarConteudoMinistrado(Conteudo conteudo){
        this.conteudosMinistrados.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo){
        if(!conteudosMinistrados.isEmpty()){
            conteudosMinistrados.remove(conteudo);
        }else {
            System.out.println("Conteúdo não ministrado por esse professor!");
        }
    }

    public Set<Conteudo> getConteudosMinistrados() {
        return conteudosMinistrados;
    }

    public void setConteudosMinistrados(Set<Conteudo> conteudosMinistrados) {
        this.conteudosMinistrados = conteudosMinistrados;
    }
}
