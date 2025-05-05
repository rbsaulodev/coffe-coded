package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class ListasDeAssistidos {
    ArrayList<Titulo> assistidos = new ArrayList<>();

    public void addTitulo(Titulo titulo){
        assistidos.add(titulo);
    }

    public void mostraTitulos(){
        Collections.sort(assistidos);
        for (Titulo e : assistidos){
            System.out.print(e.getNome() + " ");
        }
        System.out.println();
    }
}
