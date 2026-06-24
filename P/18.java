1 MAIN.java
import context.DeliveryContext;
import strategy.CourierDelivery;
import strategy.PostDelivery;

public class Main {

    public static void main(String[] args) {

        DeliveryContext context = new DeliveryContext();

        double weight = 5;

        context.setStrategy(new CourierDelivery());
        System.out.println("??????: " + context.calculate(weight));

        context.setStrategy(new PostDelivery());
        System.out.println("?????: " + context.calculate(weight));
    }
}

2 context / CourierDelivery.java
package strategy;

public class CourierDelivery implements DeliveryStrategy {

    @Override
    public double calculateCost(double weight) {
        return 300 + weight * 50;
    }
}

3 context / DeliveryStrategy.java
package strategy;

public interface DeliveryStrategy {
    double calculateCost(double weight);
}

4 context / PostDelivery.java
package strategy;

public interface DeliveryStrategy {
    double calculateCost(double weight);
}

5 strategy / DeliveryContext.java
package strategy;

public interface DeliveryStrategy {
    double calculateCost(double weight);
}

