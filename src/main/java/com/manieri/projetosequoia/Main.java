package com.manieri.projetosequoia;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) {
       try {
           String certo = "deu certo";
           System.out.println(20/0);
       }catch (Exception error){
           String certo = "deu errado";
           System.out.println("tá errado");
       }finally {
           System.out.println("sei la");
       }



    }


}

class Pessoa {
    int idade;
    String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
}