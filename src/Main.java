//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    

    //task 1
    System.out.println( "task 1" );
    int firstFriday = 2 ;// день недели
    for (int day = 1; day <= 31; day++) {  //если  день недели = 1, меньше 31, то к дню прибавляем
        if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет"
            );
        }
    }

    //task2
    System.out.println( "task 2" );
    int userWantsToСontinue = 1;
// Переменная, обозначающая, что юзер хочет продолжить игру
// 1 — хочет продолжить, 0 — не хочет продолжать играть
    int level = 1;
// Переменная со значением номера уровня
    do {
        System.out.println("Завершен уровень" + level);
        // Выводим текст с номером уровня игры
        System.out.println("Хотите продолжить?");
        // Спрашиваем, хочет ли пользователь продолжить игру
        level++;
        // К переменной level прибавляем 1, это следующий уровень
    }
    while (userWantsToСontinue == 1 && level < 5);
// Записываем условие: если пользователь хочет продолжить
// и номер уровня меньше или равен 5

    //task3
    int points = 5;

    do {
        System.out.println("Осталось " + points + " баллов.");
        points--;
    } while (points >= 0);

    System.out.println("Игра окончена!");

    //task4
    int salary = 65535;
    int total = 0;
    int i = 0;
    for (; total < 1_000_000; i++) {
        total = total + total/100;
        total = total + salary;
        if (i % 5 == 0) {
            System.out.println("Месяц " + i + " Итого " + total);
        }
        if (i == 12) {
            System.out.println("Окончание срока действия годового вклада!");
            break;
        }
    }
    System.out.println(total);
}
