import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        //1) scrieti o functie care primeste un sir de numere intregi
        // si returneaza suma lor
        int[] array = {2, 7, 10, 10, 7, 8};
        System.out.println(sumOfIntegers(array));

        //2) scrieti o functie care primeste un sir de numere intregi
        // si returneaza numarul de elemente impare
        int[] array2 = {3, 10, 10, 7, 6};
        System.out.println(numberOfOdds(array2));

        //3) scrieti o functie care primeste un sir de numere intregi si
        // un alt numar intreg. Returnati toate numerele mai mari decat numarul primit
        int[] array4 = {121, 4, 7, 8, 10, 3, 55};
        int number4 = 5;
        System.out.println(greaterThan(array4, number4));

        //4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
        // Donatiile se vor face cu ajutorul obiectului Random.
        // Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.
        int target = 300;
        System.out.println(donations(target));

        //5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii.
        // Cand acesta se termina, campania se va incheia
        int limitNumber = 5;
        System.out.println(donations2(limitNumber));

        // Exercitiul 6 nu mi-a iesit.


    }
    public static int sumOfIntegers (int[] array){
        //Exercitiul 1/Functia 1
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int numberOfOdds(int[] array){
        //Exercitiul 2/Functia 2
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> greaterThan(int[] array, int givenNumber){
        //Exercitiul 3/Functia 3
        ArrayList<Integer> largerNumbers = new ArrayList<Integer>();
        for (int num: array){
            if (num > givenNumber){
                largerNumbers.add(num);
            }
        }
        return largerNumbers;
    }

    public static int donations(int target){
        //Exercitiul 4/Functia 4
        Random randomNumber = new Random();
        int sum = 0;

        while (sum <= target){
            int randomNum = randomNumber.nextInt(100);
            sum += randomNum;
            System.out.println("You have received " + randomNum + "$");
            }

        System.out.println("You have reached your desired amount of money:");
        return sum;
    }

    public static int donations2(int limitNumber){
        //Exercitiul 5/Functia 5
        Random randomNumber = new Random();
        int sum = 0;

        for (int i = 0; i <= limitNumber; i++){
            int random = randomNumber.nextInt(200);
            sum += random;
            System.out.println("You have received " + random + "$");
        }
        System.out.println("Your total amount of money is:");
        return sum;

    }
}