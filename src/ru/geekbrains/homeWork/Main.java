package ru.geekbrains.homeWork;

public class Main {

    public static void main(String[] args) {
	Worker[] workers = new  Worker[5];
	workers [0] = new Worker("Васильев Валерий Степанович", "Водитель", "vodila777@mail.ru", "89110586432", "35 000", 33);
	workers [1] = new Worker("Печкин Василий Иванович", "Почтальен", "dokemtntOFF@yandex.ru", "89186666666", "40 000", 60);
	workers [2] = new Worker("Пушкин Александр Сергеевич", "Копирайтер", "duel_fail@gmail.com", "89651836536", "100 000", 36);
	workers [3] = new Worker("Расскольников Родион Романович", "Мастер топорных дел", "moneymaker123@rambler.ru", "89995642378", "60 000", 23);
	workers [4] = new Worker("Дубровский Владимир Андреевич", "Менеджер", "bunD@mail.ru", "89999999999", "70 000", 41);


	for (int i = 0;i<workers.length;i++) {
		if (workers[i].age>40) workers[i].printInfo();
	}




    }

}
