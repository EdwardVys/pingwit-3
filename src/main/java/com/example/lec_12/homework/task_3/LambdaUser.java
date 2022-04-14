package com.example.lec_12.homework.task_3;

public class LambdaUser {
    String lambdauser;

    public LambdaUser(String name) {

    }

    public static void main(String[] args) {
        Consumer<String> lambdauser = x -> System.out.println("Совсем уж неожиданно" + x + "!!!!!");
        lambdauser.accept(" - Егорка"); //НЕ ОБСУЖДАЕТСЯ!!!!!!
    }
}


@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}