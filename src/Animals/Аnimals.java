package Animals;

import java.util.Objects;

public abstract class Аnimals {
    private String animalsNickname; // кличка животного
    private int years; // количество лет

    public Аnimals(String animalsNickname, int years) {
        if (animalsNickname != null && !animalsNickname.isEmpty() && !animalsNickname.isBlank()) {
            this.animalsNickname = animalsNickname;
        }
        this.years = years;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("I sleep at least 6 hours");
    }

    public abstract void go();

    public String getAnimalsNickname() {
        return animalsNickname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Аnimals)) return false;
        Аnimals аnimals = (Аnimals) o;
        return years == аnimals.years && Objects.equals(animalsNickname, аnimals.animalsNickname);
    }
}

