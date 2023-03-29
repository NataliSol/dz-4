public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(); //створити екземпляр другого класу
        System.out.println(String.format("~~~ <%d> \"~~~", cat.printInfo())); // викликати метод та вивести
        // у консоль “~~~ <повернене значення> “~~~”.
    }
}
