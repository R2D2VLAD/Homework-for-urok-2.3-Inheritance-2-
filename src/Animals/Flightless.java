package Animals;

import java.util.Objects;

public class Flightless extends Birds {
    private String typeOfMovement; // тип передвижения

    public Flightless(String animalsNickname, int years, String livingEnvironment, String typeOfMovement) {
        super(animalsNickname, years, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void eat() {
        System.out.println("I'm trying small insects");
    }

    public void go() {
        System.out.println("I move at a speed of const");
    }

    public void hunt() {
        System.out.println("I like to hunt");
    }

    public void walk() {
        System.out.println("I like to walk");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return "Животное - " + getAnimalsNickname() +
                ". Количество лет - " + getYears() +
                ". Среда проживания - " + getLivingEnvironment() +
                ". Тип передвижения - " + getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }
}
