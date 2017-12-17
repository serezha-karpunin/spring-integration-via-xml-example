package com.example.demo;

public class TransactionService {
    public String createTransaction(Object object){
        System.out.println(object);
        return "10";
    }

    public void validateTransaction(Object object){
        System.out.println(object);
    }
}
