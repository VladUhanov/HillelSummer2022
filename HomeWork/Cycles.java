package HomeWork;

public class Cycles {

    public static void main(String[] args) {

        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);

        }

        System.out.println("Дано число n при помощи цикла for посчитать факториал n!");
        int sum1 = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 * i;
        }
        System.out.println(sum1);

        System.out.println("Перепишите программу 1 с использованием цикла while");
        int i1 = 1;
        while (i1 < 100) {
            System.out.println(i1);
            i1 = i1 + 2;

        }
        System.out.println("Перепишите программу 2 с использованием цикла while");
        int sum2 = 1;
        int i2 = 1;
        while (i2 <= n) {
            sum2 = sum2 * i2;
            i2++;
        }
        System.out.println(sum2);
        System.out.println("Перепишите программу 1 с использованием цикла do - while");

        int i3 = 1;
        do {
            System.out.println(i3);
            i3 += 2;
        } while (i3 < 100);

        System.out.println("Перепишите программу 2 с использованием цикла do - while");
        int sum3 = 1;
        int i4 = 1;

        do {
            sum3 = sum3 * i4;
            i4++;

        } while (i4 < n + 1);
        System.out.println(sum3);


        System.out.println("Даны переменные x и n вычислить x^n");
        int x1=5;
        int n1=6;
        System.out.println(Math.pow(x1,n1));


        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        int i5=0;
        for (int i = 0; i <10 ; i++) {
            System.out.println(i5);
            i5=i5-5;
        }

        System.out.println("Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");

        int i6 = (int) (Math.random() * 10);
        System.out.println("Multiplication table of " + i6);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i6);
        }

        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел." +
                " Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        int[] array1=new int[10];
        int i7=1;
        for (int i = 0; i <=array1.length-1; i++) {
            array1[i]=i7;
            System.out.println(array1[i]);
            i7+=2;
        }
        System.out.println("Дан массив размерности N, найти наименьший элемент массива и вывести на консоль " +
                "(массив заполнить случайными числами из диапазона 0 .. 100)");

        int[] array2 = new int[10];


        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }

        int smallest = array2[0];
        for (int j : array2) {
            if (j < smallest) {
                smallest = j;
            }
            System.out.println(j);
        }
        System.out.println("Smallest = " + smallest);

        System.out.println("В массиве из задания 9. найти наибольший элемент");
int largest=array2[0];
        for (int j : array2) {
            if (j > largest) {
                largest = j;
            }

        }
        System.out.println("Largest = "+largest);
        System.out.println("Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}." +
                " После замены будет выглядеть {4, 8, 0, 6, -5}.");
        int[] array3={4,-5,0,6,8};

        int smallest1=array3[0];
        int largest1=array3[0];
        int smallestInd=0;
        int largestInd=0;

        for (int k : array3) {
            System.out.print(k + ",");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {

            if (array3[i]<smallest1){
                smallest1=array3[i];
                smallestInd=i;
            }else if (array3[i]>largest1){
                largest1=array3[i];
                largestInd=i;
            }
        }
           int temp=array3[smallestInd];
        array3[smallestInd]=array3[largestInd];
        array3[largestInd]=temp;
        for (int j : array3) {
            System.out.print(j + ",");
        }
        System.out.println();

        System.out.println("Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");
        String[][] array=new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j)%2==0){
                    array[i][j]="W";
                }else {array[i][j]="B";}
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }


}



