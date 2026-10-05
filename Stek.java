package stek;

public class Stek {
    //Длинна стека
    private final int SPISOK = 10000;
    //Спавнится массив и переменная индекса стека (курсор стека тип)
    private char[] skobki = new char[SPISOK];
    public int kursor = 0;
    //Добавление в стек элементов и перемещение курсора. Если стек полон, то вызывать ошибку
    public void push(char skobka) {
    if (SPISOK == kursor){
        throw new StackOverflowError();
    }
    skobki[kursor++] = skobka;
    }
    //Отдавание самого верхнего элемента и избавление от него
    public char pop(){
        return skobki[--kursor];
    }
}
