public class Main {
    public static void main(String[] args) {
        task1and2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static void task6(){
        int age = 19;//возраст клиента
        double salary = 58_000;//зарплата клиента
        double sumAge=0;//сумма кредита по возрасту
        double sumSalary=0;//сумма кредита по зарплате
        double sum=0;

        if(age>=23){
            sumAge=salary*3;
        }else{
            sumAge=salary*2;
        }

        if(salary>=50000){
            sumSalary=salary*1.2;
        }else if(salary>=80000){
            sumSalary=salary*1.5;
        }

        if(sumSalary>sumAge){sum=sumSalary;}
        else{sum=sumAge;}

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+sum+" рублеЙ");
    }
    public static void task7(){
        int age = 40;//25
        double salary = 60_000;
        double wantedSum =1_000_000;//330_000;
        double payment = 0.0;
        double maxPayment = 0.0;
        int period = 24;
        double percent=10.0;

        if(age<23){percent+=1;}
        else if(age<30){percent+=0.5;}

        if(salary>80_000){percent-=0.7;}

        payment= (wantedSum+(((wantedSum*percent/100)/12)*period))/period;
        maxPayment=salary/2;

        if(maxPayment>=payment) {

            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено!");
        }else{
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
        }
    }
}


