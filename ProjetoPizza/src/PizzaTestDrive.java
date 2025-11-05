public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println(pizza);


        Pizza pizza2 = nyStore.orderPizza("mariscos");
        System.out.println(pizza2);
    }
}