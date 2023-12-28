import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        Integer age = scanner.nextInt();

        //----------
        var firstName = "Pawel";
        firstName = "Kamil";
        //firstName = 10; --> not possible, because Java guessed type sting here
        //----------

        int firstNumber = 2;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        int modulo = secondNumber % firstNumber;

        if((!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba")) && !name.isEmpty()) {
            System.out.println("Hello " + name + ".");
            System.out.println("You're the man.");
        } else if((name.endsWith("a")) && !name.isEmpty()){
            System.out.println("Hello " + name + ".");
            System.out.println("You're the woman.");
        } else {
            System.out.println("You haven't entered anything!");
        }

        if (age >= 18) {
            System.out.println("You're adult.");
        } else {
            System.out.println("You're not an adult yet.");
        }

        System.out.println(result);
        System.out.println(modulo);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);

        boolean isSkyBlue = true;

        if(isSkyBlue) {
            System.out.println("the sky is blue");
        } else {
            System.out.println("the sky is not blue");
        }

        isSkyBlue = false;

        if(isSkyBlue) {
            System.out.println("the sky is blue");
        } else {
            System.out.println("the sky is not blue");
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for(int i = 0, j = 10; i < 10; i++, j--){
            System.out.println(i);
            System.out.println(j);
            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }

        //----- struktury danych -----

         //array
        String[] guests = new String[4];
        guests[0] = "Pawel";
        guests[1] = "Ola";
        guests[2] = "Kuba";
        guests[3] = "Aga";

        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i]);
        }

        for (String guest : guests) {
            System.out.println(guest);
        }

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Juli");
        names.add("Jonathan");

        for (String name2 : names) {
            System.out.println(name2);
        }

        names.remove("Juli");
        for (String name1 : names) {
            System.out.println(name1);
        }

        List<String> namesSecondPart = new ArrayList<>();
        namesSecondPart.add("Pawel");
        namesSecondPart.add("Aga");
        namesSecondPart.add("Ola");
        namesSecondPart.add("Kuba");

        names.addAll(namesSecondPart);
        Collections.sort(names);
        System.out.println();
        System.out.println("Merged lists: ");
        for (String name3:names) {
            System.out.println(name3);

        }


        names.clear();

        for (String name4:names) {
            System.out.println(name4);

        }
        System.out.println("Is names list empty: " + names.isEmpty());

        Set<String> meals = new HashSet<>();
        meals.add("Pizza");
        meals.add("Pasta");
        meals.add("Pizza");
        meals.add("Pierogi");

        for (String meal : meals) {
            System.out.println(meal);
        }

        Map<String, String> mealsToNames = new HashMap<>();
        mealsToNames.put("Pawel", "Pizza");
        mealsToNames.put("Aga", "Pasta");
        mealsToNames.put("Kuba", "Pizza");

        System.out.println(mealsToNames.get("Pawel"));
        mealsToNames.put("Pawel", "Golabki");
        System.out.println(mealsToNames.get("Pawel"));

        Set<String> keys = mealsToNames.keySet();
        Collection<String> values = mealsToNames.values();

        for (String key : keys) {
            System.out.println("key: " + key);
        }
        for (String value : values) {
            System.out.println("value: " + value);
        }


    }
    }