package Animals;

import java.util.Objects;

public abstract class Mammals extends Аnimals {
    private String livingEnvironment; // среда проживания
    private int speed; // скорость перемещения

    public Mammals(String animalsNickname, int years, String livingEnvironment, int speed) {
        super(animalsNickname, years);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
        this.speed = speed;
    }

    public abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }
}
