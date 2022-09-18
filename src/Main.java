import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Frutas fruit = new Frutas();
        Scanner sc = new Scanner(System.in);
        String newFruit = "";

        System.out.println("A lista de frutas em promoção é: " + fruit.getListFruits());

        while (!newFruit.equals("s")) {
            System.out.println("Qual a sua lista de compras para hoje? DIGITE 's' PARA SAIR");
            newFruit = sc.nextLine().toLowerCase();

            if (!newFruit.equals("s")) {fruit.addFruitOnList(newFruit);}
        }

        System.out.println(fruit.getNewListFruits());
        System.out.println(fruit.computeTip());
        System.out.println(fruit.priceFruitsInPromotionList());
    }
}