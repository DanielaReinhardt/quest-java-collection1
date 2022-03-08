import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        
        // TODO 1 : Create an empty heroes list

        Hero widow = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero("Iron Man", 48);
        Hero scarlet = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor = new Hero("Doctor Strange", 42);

        // TODO 2 : Add those heroes to the list

        ArrayList<Hero> heros = new ArrayList<>();        
        heros.add(widow);
        heros.add(captain);
        heros.add(vision);
        heros.add(iron);
        heros.add(scarlet);
        heros.add(thor);
        heros.add(hulk);
        heros.add(doctor);

        thor.setAge(1501);

        Collections.shuffle(heros);

        heros.remove(0);
        heros.remove(1);
        heros.remove(2);
        heros.remove(3);

       

        for (Hero people : heros) { 
          System.out.println(people.getName() + " , " + people.getAge());
    }

        

       

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        // TODO 4 : Shuffle the heroes list

        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}
