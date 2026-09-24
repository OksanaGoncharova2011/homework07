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



    //task3
    System.out.println( "task 3" );


}
