package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood; // тип пищи

    public Predators(String animalsNickname, int years, String livingEnvironment, int speed, String typeOfFood) {
        super(animalsNickname, years, livingEnvironment, speed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }
    public void eat() {
        System.out.println("I'm trying small insects");
    }

    public void go() {
        System.out.println("I move at a speed of const");
    }

    public void walk() {
        System.out.println("I like to walk");
    }

    public void hunt() {
        System.out.println("I like to hunt");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Животное - " + getAnimalsNickname() +
                ". Количество лет - " + getYears() +
                ". Среда проживания - " + getLivingEnvironment() +
                ". Скорость перемещения - " + getSpeed() +
                " км/ч. Тип пищи - " + getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }
}
