package com.example.lec_12.homework.task_1;

public class ConverterDigitToString {
    public static void main(String[] args) {
        Function<Integer, String> Converter = x -> {
            return String.valueOf(x);
        };
        System.out.println(Converter.apply(66) + " рупий");
    }
}

@FunctionalInterface
interface Function<T, R> {
    R apply(T t);

    default void sayHi() {
    }
}