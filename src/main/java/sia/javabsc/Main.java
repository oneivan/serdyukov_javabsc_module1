package sia.javabsc;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
/*
Описание/Пошаговая инструкция выполнения домашнего задания:

Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
ФИО: фамилия имя отчество
Год рождения: год рождения
e-mail: email
В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.

Попробуйте реализовать класс по его описания:
    объекты класса Коробка должны иметь размеры и цвет.
    Коробку можно открывать и закрывать.
    Коробку можно перекрашивать.
    Изменить размер коробки после создания нельзя.
    У коробки должен быть метод, печатающий информацию о ней в консоль.
    В коробку можно складывать предмет (если в ней нет предмета),
    или выкидывать его оттуда (только если предмет в ней есть),
    только при условии что коробка открыта (предметом читаем просто строку).
    Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */

        User[] users = {
                new User("Лебедева","Милана","Евгеньевна",1961, "m6hFgVvHrIO@mail.ru")
                , new User("Константинова ","Элина ","Андреевна",1993, "m7MrTwQHR@msn.com")
                , new User("Дементьева ","Мия ","Фёдоровна",1950, "LDKpHSoagI@live.com")
                , new User("Волошин ","Павел ","Ибрагимович",1945, "TFtfWIQ4d2Ah@aol.com")
                , new User("Виноградов ","Тимур ","Андреевич",1980, "zCuXthwiYW@live.com")
                , new User("Агеев ","Роман ","Алексеевич",1948, "U3DVq7dcgKk@live.com")
                , new User("Шмелев ","Леонид ","Михайлович",1983, "sby95NcT@msn.com")
                , new User("Голубев ","Семён ","Артёмович",1974, "huW0YC2nrM7@rocketmail.com")
                , new User("Маркова ","Милана ","Данииловна",1956, "osQndupgA@gmail.com")
                , new User("Данилов ","Кирилл ","Алексеевич",1953, "yrbci@gmail.com")
        };
        for (int i = 0; i < users.length; i++) {
            if ( (Calendar.getInstance().get(Calendar.YEAR) - users[i].getBDY()) > 40) //
                users[i].getInfo();
        } // 9 of 10

        System.out.println("=====");

        Box bx = new Box("XXL", "BLACK");
        bx.showInfo();
        System.out.println("-----");
        bx.setCollor("GREEN");
        bx.putIn();
        bx.showInfo();
        System.out.println("-----");
        bx.setCollor("YELLOW");
        bx.showInfo();
    }
}