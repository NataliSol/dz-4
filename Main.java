public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(); //створити екземпляр другого класу
        System.out.printf("~~~ <%d> \"~~~%n", cat.printInfo()); // викликати метод та вивести
        // у консоль “~~~ <повернене значення> “~~~”.
    }
}
