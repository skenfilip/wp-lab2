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
        pizzaList.add(new Pizza("Margarita", "(tomato sauce, mozzarella)"));
        pizzaList.add(new Pizza("Carbonara", "(fresh cream, mozzarella, bacon)"));
        pizzaList.add(new Pizza("Vegetariana", "(tomato sauce, mushrooms)"));
        pizzaList.add(new Pizza("Calzone", "(Pizza dough, ricotta, pepperoni, pizza sauce, olive oil)"));
        pizzaList.add(new Pizza("Cheddar", "(cheddar, tomato sauce)"));
        pizzaList.add(new Pizza("Capricciosa", "(fresh cream, mozzarella, bacon)"));
        pizzaList.add(new Pizza("Burger Classic", "(barbecue sauce, beef, mozzarella, onions)"));
        pizzaList.add(new Pizza("Burger Barbecue", "(ham, chicken meat, onions)"));
        pizzaList.add(new Pizza("Pepperoni", "(tomato sauce, mozzarella, sausage)"));
        pizzaList.add(new Pizza("Quattro Formaggi", "(Taleggio, Mascarpone, Gorgonzola, Parmesan)"));
    }

    public List<Pizza> getAllPizzas() {
        return pizzaList;
    }
}
