package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        b1.adicionarLivro(l1);
        
        Livro l2 = new Livro("Duna", "Frank Herbert", 1965);
        b1.adicionarLivro(l2);
        
        Livro l3 = new Livro("1984", "George Orwell", 1949);
        b1.adicionarLivro(l3);
        
        Livro l4 = new Livro("1984", "George Orwell", 1949);
        
        b1.listarLivros();
        
        b1.adicionarLivro(l4);
        
        b1.removerLivro("Duna");
        System.out.println("------------------------------------------------------------------------------");
        b1.listarLivros();
    }
}
