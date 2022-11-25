package Animals;

import java.util.Objects;

public class Аmphibians extends Аnimals {
    private String livingEnvironment; // среда проживания

    public Аmphibians(String animalsNickname, int years, String livingEnvironment) {
        super(animalsNickname, years);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunt() {
        System.out.println("I like to hunt");
    }

    public void eat() {
        System.out.println("I'm trying small insects");
    }

    public void go() {
        System.out.println("I move at a speed of const");
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return "Животное - " + getAnimalsNickname() +
                ". Количество лет - " + getYears() +
                ". Среда проживания - " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Аmphibians)) return false;
        if (!super.equals(o)) return false;
        Аmphibians that = (Аmphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }
}
