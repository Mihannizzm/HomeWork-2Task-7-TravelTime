public class TravelTime {

    public static void main(String[] args) {

        final int distanceFromHomeToOffice = 2;
        System.out.println("Расстояние от дома до офиса в километрах: " + distanceFromHomeToOffice);

        final double speedTaxi = 20;
        System.out.println("Средняя скорость такси: " + speedTaxi + " км/ч");

        final double timeFromHomeToOffice = distanceFromHomeToOffice / speedTaxi;
        System.out.println("Время за которое тестировщик добирается от дома до офиса: " + timeFromHomeToOffice);

        final double coefficientSlowdownTransportTonight = 3.1;
        System.out.println("Коеффициент замедления транспорта вечером: " + coefficientSlowdownTransportTonight);

        final double timeFromOfficeToHome = timeFromHomeToOffice * coefficientSlowdownTransportTonight;
        System.out.println("Время за которое тестировщик добирается от офиса до дома: " + timeFromOfficeToHome);


    }


}


/*
Объявить целочисленную переменную, в которой расстояние в километрах от дома до офиса.
Объявить дробную переменную, в которой средняя скорость такси.
Объявить дробную переменную, в которой время за которое тестировщик добирается от дома до офиса. Для
вычисления времени нужно поделить расстояние на скорость.
Объявить дробную переменную, в которой коеффициент замедления транспорта вечером.
Объявить дробную переменную, в которой время, за которое тестировщик добирается на такси с работы
домой. Для вычисления этого времени нужно умножить время за которое тестировщик обычно добирается от
дома до офиса на коеффициент.
 */