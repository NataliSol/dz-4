public class Cat {
    private int weight = 5;  //поле типу int із наданим значенням;

    public int printInfo() { //метод, який друкує в консоль "---<значення поля>---" і повертає його.
        System.out.println(String.format("---<%d>---", weight));
        return weight;
    }
}
