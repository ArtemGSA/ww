public class Main {
    public static void main(String[] args) {
        tusk1();
    }
    //public static int[] generateRandomArray() {
    //  java.util.Random random = new java.util.Random();
    //int[] arr = new int[5];
    //for (int i = 0; i < arr.length; i++) {
    //  arr[i] = random.nextInt(100_000) + 100_000;
    //}
    //return arr;
    //}

    public static void tusk1() {
        //ЗАДАЧА1
        System.out.println("ЗАДАЧА1");
        int[] arr1 = {1,2,3,4,5};
        int summ = 0;
        for (int i : arr1){
            summ+=i;
        }
        System.out.println("Cумма трат за месяц составила " + summ + " рублей");
        //ЗАДАЧА2
        System.out.println("ЗАДАЧА2");
        int min = 2000000;
        int max = -1;
        for (int i : arr1){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+min+ " рублей. Максимальная сумма трат за неделю составила "+max+" рублей");
        //ЗАДАЧА3
        System.out.println("ЗАДАЧА3");
        int kolvoDney = 30;
        int sredTrat = summ/kolvoDney;
        System.out.println("Средняя сумма трат за месяц составила " + sredTrat+ " рублей ");
        //ЗАДАЧА4
        System.out.println("ЗАДАЧА4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}