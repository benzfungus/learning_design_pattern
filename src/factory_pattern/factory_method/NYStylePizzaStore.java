package factory_pattern.factory_method;



public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }

}
