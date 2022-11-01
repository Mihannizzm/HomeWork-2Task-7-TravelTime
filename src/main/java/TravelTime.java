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