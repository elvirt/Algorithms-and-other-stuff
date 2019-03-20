import java.util.*;

//speed comparison of set realizations
public class Test {
    public static void main(String[] args) {
        Random r = new Random();

        Set<Dog> hashSet = new HashSet<>();
        Set<Dog> treeSet = new TreeSet<>();
        Set<Dog> linkedHashSet = new LinkedHashSet<>();

        //start time
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Dog(x));
        }

        //end time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

        //start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Dog(x));
        }
        //end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);

        //start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            int x = r.nextInt(1000 - 10) + 10;
            linkedHashSet.add(new Dog(x));
        }
        //end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);


    }
}
