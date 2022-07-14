public class Main {
    public static void main(String[] args) {
        task1and2();
        task3();
        task4();
        task5();
    }

    public static void task1and2() {
        byte clientOS=0;//task1
        int clientDeviceYear=2014;//task2
        String laiteV="";
        if(clientDeviceYear<2015){laiteV=" облегченную";}
        if(clientOS==0) {
            System.out.println("Установите"+laiteV+" версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите"+laiteV+" версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int year=2022;
        if(year%100==0&&year%400!=0){System.out.println("«"+ year +" год не является високосным»");}
        else if(year%4==0||year%400==0){
            System.out.println("«"+ year +" год является високосным»");
        }
        else {
            System.out.println("«"+ year +" год не является високосным»");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryTime=1;
        int zone=0;

        if(deliveryDistance>20)
        {
            zone = (int) deliveryDistance / 40;
        }
        System.out.println("Потребуется дней: " + (deliveryTime+zone));
    }
    public static void task5() {
        int monthNumber = 12;
        if(monthNumber==0){System.out.println("Такого месяца не существует");}
        else if(monthNumber==12){System.out.println("Зима");}
        else
            switch ((int) (monthNumber/3)+1) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Весна");
                    break;
                case 3:
                    System.out.println("Лето");
                    break;
                case 4:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
    }
}

