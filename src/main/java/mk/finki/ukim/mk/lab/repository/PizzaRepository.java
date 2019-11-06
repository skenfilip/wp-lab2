package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Pizza;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class PizzaRepository {
    private List<Pizza> pizzaList;

    public PizzaRepository() {
        this.pizzaList = new LinkedList<Pizza>();
        for (int i = 0; i < 10; i++) {
            pizzaList.add(new Pizza());
        }
    }

    public List<Pizza> getAllPizzas() {
        return pizzaList;
    }
}
