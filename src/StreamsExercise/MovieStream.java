package StreamsExercise;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.logging.StreamHandler;
//import java.util.stream.Stream;
//
//public class MovieStream {
//
//
//    public static void main(String[] args) {
//
//        List<Movie>movies = Arrays.asList(new Movie(Mad,2020,Arya),new Movie(Mass,2021,Vijay),
//                new Movie(Muilt,2022,Ajith));
////        Stream<Movie>movieList = movies.stream();
////        Stream<Movie>movieFilter = movieList.filter(m -> m.getReleaseYear().equals(2020));
////        Stream<String> movieMap = movieFilter.map(m -> m.getName());
////        movieMap.forEach(System.out::println);
//        movies.stream()
//                .filter(m->m.getReleaseYear()==2020)
//                .map(Movie::getName)
//                .forEach(System.out::println);
//
//    }
//}
