package  src.main.java.com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if(livros.size() < MAX_LIVROS){
            for(Livro i : livros){
                if( i.getTitulo() == livro.getTitulo()){
                    System.out.println("Título Duplicado");
                    return false;
                }
            }
            
            livros.add(livro);
            
            return true;
        }
        return false;
    }

    public boolean removerLivro(String titulo) {
        for(Livro i : livros){
            if( i.getTitulo() == titulo){
                livros.remove(i);
                return true;
            }
        }
        
        return false;
    }

    public void listarLivros() {
        for(Livro i : livros){
            System.out.println("Titulo: " + i.getTitulo() + " |Autor: " + i.getAutor() + " |Ano: " + i.getAno());
        }
    }
}
