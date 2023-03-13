package StreamsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExer {

    Stream<String> cars = Stream.of("volvo", "MZ", "Honda", "Skoda" , "RR");
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();
        for(int i =4; i<12; i++ ){
            numbers.add(i);
        }
        Stream <Number> numberStream = numbers.stream();
        numberStream.forEach(o -> System.out.println(o));

        List<Product>productList = new ArrayList<>();

        productList.add(new Product(1,"laptop", "acer", 40000d));
        productList.add(new Product(2,"bat", "MRF", 1000d));
        productList.add(new Product(3,"apparel", "Crocodile", 2500d));
        productList.add(new Product(4,"Atta", "Achirwath", 146.5d));
        productList.add(new Product(5,"chair", "White color", 650d));
        productList.add(new Product(6,"mobile", "acer", 18000));
// intermediate Ops
        productList.stream()
                .filter((pl) -> pl.name.startsWith("A"))
                .forEach(PL-> System.out.println(PL.name));


        productList.stream().filter((l)-> l.name.startsWith("a"))
                .map(s->s.name.toUpperCase())
                .forEach(System.out::println);


        List<String>named = productList.stream().filter((Product product) -> Boolean.parseBoolean(product.name)).sorted()
                .map(s->s.name.toUpperCase())
                .collect(Collectors.toList());
        System.out.print("\n"+ named);

        productList.stream()
                .filter(pl -> pl.description == "acer")
                .forEach(product -> System.out.println(product.name));

//      Optional<String> prs = productList.stream()
//              .filter(pl -> "MRF".equals(pl.getDescription())).collect(Collectors.toList());
//        System.out.println("\n"+prs);


 StreamExer streamExer = new StreamExer();
//        Stream<String> cars = Stream.of("volvo", "MZ", "Honda", "Skoda" , "RR");
        streamExer.cars.forEach(c -> System.out.println(c));

        Stream<String>  bikes = Stream.of(new String[] {"Hero", "Pulsar", "Honda", "TVS" , "Hercules"});
        bikes.forEach(s -> System.out.println(s));

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<70; i = i+3){
            list.add(i);
        }
        Stream<Integer> num = list.stream();
        List<Integer>evenNums = num.filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(evenNums);
        List<Integer> lists = new ArrayList<>();
        for(int i = 1; i<70; i = i+3){
            lists.add(i);
        }
        Stream<Integer> nums = list.stream();
        Integer[] oddList = nums.filter(b-> b%2!=0).toArray(Integer[]::new);
        System.out.println(oddList);


        // Intermediate Ops : filter
        List<String> friends = Arrays.asList("Ross", "Chandler", "CSS",
                "Monica", "Joey", "Rachel");

        friends.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        friends.stream().sorted().map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name + " "));

        List<String>names = friends.stream().sorted()
                        .map(String::toUpperCase)
                                .collect(Collectors.toList());
        System.out.print("\n"+names );


    }
}
