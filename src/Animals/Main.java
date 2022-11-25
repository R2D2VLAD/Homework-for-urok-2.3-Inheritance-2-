package Animals;

import Animals.Flightless;
import Animals.Flying;
import Animals.Herbivores;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Домашняя работа 3");

        Аmphibians frog = new Аmphibians("Лягушка", 5, "Болото.");
        System.out.println(frog);
        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();

        Аmphibians alreadyFreshwater = new Аmphibians("Уж пресноводный", 6, "Водоёмы.");
        System.out.println(alreadyFreshwater);
        alreadyFreshwater.eat();
        alreadyFreshwater.sleep();
        alreadyFreshwater.go();
        alreadyFreshwater.hunt();
        System.out.println();

        Herbivores gazelle = new Herbivores("Газель", 3, "Зелёные луга", 30, "Трава");
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();

        Herbivores giraffe = new Herbivores("Жираф", 10, "Зелёные луга", 20, "Трава");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.sleep();
        giraffe.go();
        giraffe.walk();
        giraffe.graze();

        Herbivores horse = new Herbivores("Лошадь", 7, "Зелёные луга", 60, "Трава");
        System.out.println(horse);
        horse.eat();
        horse.sleep();
        horse.go();
        horse.walk();
        horse.graze();
        System.out.println();

        Predators hyena = new Predators("Гиена", 2, "Пасбище", 60, "Мясо");
        System.out.println(hyena);
        hyena.eat();
        hyena.sleep();
        hyena.go();
        hyena.walk();
        hyena.hunt();

        Predators tiger = new Predators("Тигр", 8, "Джунгли", 75, "Мясо");
        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.go();
        tiger.walk();
        tiger.hunt();

        Predators bear = new Predators("Медведь", 12, "Лес", 25, "Мясо, Мёд");
        System.out.println(bear);
        bear.eat();
        bear.sleep();
        bear.go();
        bear.walk();
        bear.hunt();
        System.out.println();

        Flightless peacock = new Flightless("Павлин", 4, "Джунгли", "по земле");
        System.out.println(peacock);
        peacock.eat();
        peacock.sleep();
        peacock.go();
        peacock.hunt();
        peacock.walk();

        Flightless penguin = new Flightless("Пингвин", 5,
                "Открытое море Южного полушария", "по земле");
        System.out.println(penguin);
        penguin.eat();
        penguin.sleep();
        penguin.go();
        penguin.hunt();
        penguin.walk();

        Flightless dodoBird = new Flightless("Птица додо", 7, "Мадагаскар", "по земле");
        System.out.println(dodoBird);
        dodoBird.eat();
        dodoBird.sleep();
        dodoBird.go();
        dodoBird.hunt();
        dodoBird.walk();
        System.out.println();

        Flying seagull = new Flying("Чайка", 3, "Острава", "по воздуху");
        System.out.println(seagull);
        seagull.eat();
        seagull.sleep();
        seagull.go();
        seagull.hunt();
        seagull.toFly();

        Flying albatross = new Flying("Альбатрос", 9, "Острава", "по воздуху");
        System.out.println(albatross);
        albatross.eat();
        albatross.sleep();
        albatross.go();
        albatross.hunt();
        albatross.toFly();

        Flying falcon = new Flying("Сокол", 3, "Горы", "по воздуху");
        System.out.println(falcon);
        falcon.eat();
        falcon.sleep();
        falcon.go();
        falcon.hunt();
        falcon.toFly();

    }
}