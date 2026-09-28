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

    int step = 500;
    int distens = 42195;
// Первая версия: цикл do-while
    int distansCovered = 0;
    System.out.println("Версия с циклом do-while:");
    do {
        int distanceLeft = distens - distansCovered;
        System.out.println( "Держитесь! Осталось " + distanceLeft + " метров" );
          distansCovered = distansCovered += step;
    } while (distansCovered < distens);

    // Вторая версия: цикл for
    System.out.println("Версия с циклом for:");

    for (distansCovered = 0;
         distansCovered < distens;
         distansCovered += step) {

        int distanceLeft = distens - distansCovered;

        System.out.println(
                "Держитесь! Осталось " + distanceLeft + " метров"
        );
    }


    int budgetWhile = 1000; // начальный бюджет
    int dayWhile = 1;       // начинаем с первого дня

    while (budgetWhile > 0) {

        // Каждый 5-й день бесплатный
        if (dayWhile % 5 == 0) {
            dayWhile++;
            continue;
        }

        // Обычный день стоит 100 рублей
        budgetWhile -= 100;
        dayWhile++;
    }

    // Количество дней = последний день - 1
    int daysWhile = dayWhile - 1;

    System.out.println("Версия while:");
    System.out.println("Бюджет: 1000 ₽");
    System.out.println("Автомобиль можно оставить на " + daysWhile + " дней.");

    // =========================================================
    // 2. Версия с циклом for
    // =========================================================

    int budgetFor = 10000; // начальный бюджет
    int dayFor;

    for (dayFor = 1; budgetFor > 0; dayFor++) {

        // Каждый 5-й день бесплатный
        if (dayFor % 5 == 0) {
            continue;
        }

        // Обычный день стоит 100 рублей
        budgetFor -= 100;
    }

    // Количество дней = последний день - 1
    int daysFor = dayFor - 1;

    System.out.println();
    System.out.println("Версия for:");
    System.out.println("Бюджет: 1000 ₽");
    System.out.println("Автомобиль можно оставить на " + daysFor + " дней.");

    // =========================================================
    // 3. Проверка одинакового результата
    // =========================================================

    System.out.println();

    if (daysWhile == daysFor) {
        System.out.println("Результат обеих версий одинаковый.");
    } else {
        System.out.println("Результаты отличаются.");
    }
    // zadanie 4
    int month = 0;
    double total = 0;

    while (true) {
        month++;

        total += 15000;

        if (month % 6 == 0) {
            total += total * 7 / 100;
        }

        System.out.println("Месяц " + month + ": " + total);

        if (total >= 12000000) {
            break;
        }
    }
    // zadanie 5
    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge < 100 && overheats <= 3) {

        minute++;

        if (minute % 10 == 0) {
            overheats++;

            System.out.println("Перегрев! Количество перегревов: " + overheats);

            if (overheats > 3) {
                break;


            }

            minute += 2;

            continue;
        }

        charge += 2;
    }
    if (overheats > 3) {
        System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
    } else {
        System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
    }

    System.out.println("Время зарядки составило " + minute + " минут");
}
