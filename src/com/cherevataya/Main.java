package com.cherevataya;

/*
2*) Задана строка из английских слов через пробел.
Написать метод который возвращает те же слова в обратном порядке.
При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.


 */
public class Main {

    public static void main(String[] args) {

        String s = "hello world";
        System.out.println(s);
        int stringLength = s.length();
        String letter1 = s.substring(0, 1);
        String lastLetter = s.substring((stringLength - 1), (stringLength));
        String newWord = letter1.toUpperCase()
                + s.substring(1, s.length() - 1)
                + lastLetter.toUpperCase();
        System.out.println(newWord);
        reverse(newWord);
    }

    private static void reverse(String newWord) {
        //function capitalized(s){
        for (int i = newWord.length() - 1; i >= 0; i--) {
            System.out.print(newWord.charAt(i));
        }

    }
}








