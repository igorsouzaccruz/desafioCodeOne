import java.util.ArrayList;
import java.util.List;

public class Frutas {

    private String[] listFruitPromotion = {"banana", "maça", "abacaxi", "melão", "mamão"};
    private List<String> listFruits = new ArrayList<>(List.of(listFruitPromotion));
    private List<String> newListFruits = new ArrayList<>();

    public List<String> getListFruits() {
        return listFruits;
    }

    public void addFruitOnList(String fruit){
        newListFruits.add(fruit);
    }

    public List<String> getNewListFruits() {
        return newListFruits;
    }

    public String computeTip(){
        double tip = 0;
        List<String> listSliced = new ArrayList<>(List.of(listFruitPromotion));
        listSliced.retainAll(newListFruits);
        double purchasePercentage = (double) listSliced.size()/ listFruits.size();
        purchasePercentage *= 100;

        System.out.println(listSliced);
        System.out.println(purchasePercentage);

        if(purchasePercentage >= 50 && purchasePercentage < 75){
            tip = 3.0;
        }else if(purchasePercentage >= 75 && purchasePercentage < 90) {
            tip = 5.0;
        }else if(purchasePercentage >= 90) {
            tip = 10.0;
        }else {
            tip = 0.0;
        }
        return "Correspondência de " + purchasePercentage + "%, gorjeta de R$ " + tip;
    }
    public String priceFruitsInPromotionList(){
        double price = 0.0;
        for (String fruit:newListFruits) {
            switch (fruit){
                case "banana":
                    price += 3.0;
                    break;
                case "maça":
                    price += 4.0;
                    break;
                case "abacaxi":
                    price += 5.0;
                    break;
                case "melão":
                    price += 6.0;
                    break;
                case "mamão":
                    price += 7.0;
                    break;
                default:
                    price = price;
            }
        }    
        return "O valor a ser pago pelos items em promoção é: R$" + price + ".";
    }
}
