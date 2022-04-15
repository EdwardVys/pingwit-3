/*package com.example.lec_11.homework.task_11;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


   public class TreeSetTask11 {
    public static void main(String[] args) {

        TreeSet<String> names; // TreeSet<String> names = new TreeSet<>(); в одну строку. Зачем здесь две?
        names = new TreeSet<String>();
        names.add("Jony");
        names.add("Piter");
        names.add("Ivan");
        names.add("Nik");
        names.add("Pall");
        names.add("Sid");
        names.add("Fedor");
        names.add("Haddy");
        System.out.println(names);
        /*
        вот так можно
        Pattern pattern = Pattern.compile("^[H | W]");
        names.removeIf(pattern.asPredicate());
        */
        Pattern pattern  = Pattern.compile ("H.-W."); // Pattern.compile("[H-W]"); без точек скорее всего отработает
        System.out.println(pattern);

    } //НЕ ОТРАБАЬАТЫВАЕТ PATERN!!!!....пока...
}
*/
