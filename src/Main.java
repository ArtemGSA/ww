public class Main {
    public static void main(String[] args) {


        //ЗАДАНИЕ1
        System.out.println("ЗАДАНИЕ1");
        int month = 1;
        int vklad = 29000;
        int summaNakopleniy =0;
        double procent = 1.12;
        while (summaNakopleniy<2459000){
            summaNakopleniy *= procent;
            summaNakopleniy += vklad;
            System.out.println("Месяц "+month+", сумма накоплений равна "+summaNakopleniy+" рублей");
            month+=1;
        }
        //ЗАДАНИЕ2
        System.out.println("ЗАДАНИЕ2");
        int number = 1;
        while (number<11) {
            System.out.print(number + " ");
            number+=1;
        }
        number -= 1;
        System.out.println("");
        for( ;number>0;number-=1){
            System.out.print(number + " ");
        }
        //ЗАДАНИЕ3
        System.out.println("ЗАДАНИЕ3");
        int chislY = 12000000;
        int rojdaemastY = 17;
        int smertnostY = 8;
        for(int year=1; year<11; year++){
            chislY += chislY/1000*rojdaemastY - chislY/1000*smertnostY;
            System.out.println("Год " + year + " численность населения составляет "+ chislY);
        }
        //ЗАДАНИЕ4
        System.out.println("ЗАДАНИЕ4");
        int mounth = 1;
        int itog = 12000000;
        int summaNakop = 15000;
        double pproc = 1.07;
        while(summaNakop<itog){
            summaNakop *= pproc;
            mounth += 1;
            System.out.println("Месяц " + mounth + " сумма накоплений составляет " + summaNakop);
        }
        //ЗАДАНИЕ5
        System.out.println("ЗАДАНИЕ5");
        mounth = 1;
        summaNakop = 15000;
        while(summaNakop<itog) {
            summaNakop += summaNakop / 100 * 7;
            mounth += 1;
            if (mounth % 6==0) {
                System.out.println("Месяц " + mounth + " сумма накоплений составляет " + summaNakop);
            }
        }
        //ЗАДАНИЕ6
        System.out.println("ЗАДАНИЕ6");
        mounth = 1;
        int vsegoLet = 9
        int year = 0;
        while(year<vsegoLet){
            mounth += 1;
            year = mounth/12;
            if(mounth % 6==0){
                System.out.println("Месяц " + mounth + " сумма накоплений составляет " + summaNakop);
            }
        }
        //ЗАДАНИЕ7
        System.out.println("ЗАДАНИЕ7");
        int firstFriday = 6;
        int currentDay = firstFriday;
        while(currentDay<=31){
            System.out.println("Сегодня пятница, " + currentDay + "-е число");
            currentDay += 7;
        }
        //ЗАДАНИЕ8
        System.out.println("ЗАДАНИЕ8");
        int currentYear = 2024;
        int yearOfComet = 0;
        int yearOfEnd = currentYear+100;
        int yearOfBegining = currentYear-200;
        int periodOfComet = 79;
        while(yearOfComet<yearOfEnd){
            if(yearOfComet>=yearOfBegining){
                System.out.println(yearOfComet);
            }
            yearOfComet += periodOfComet;

        }
    }
}