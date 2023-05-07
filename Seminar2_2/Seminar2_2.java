package Seminar2_2;

public class Seminar2_2 {
    
    public static void main(String[] args) {

        String poem = """
            Я узнал, что у меня
        Есть огромная родня:
        И лесок, и лесок,
        В поле - каждый лесок""";

        String query = "лесок";
        long start = System.currentTimeMillis();
        System.out.println(poem);
        poem = poem.replace(query, "колосок");
        long end = System.currentTimeMillis();
        System.out.println(poem);
        System.out.printf("Занятое время: %d\n", end - start);

        StringBuilder poemDif =  new StringBuilder("""
            Я узнал, что у меня
        Есть огромная родня:
        И лесок, и лесок,
        В поле - каждый лесок""");

        long startDif = System.currentTimeMillis();
        System.out.println(poemDif);
        while (poemDif.indexOf(query) > 0) {
            poemDif = poemDif.replace(poemDif.indexOf(query), poemDif.indexOf(query) + query.length(), "колосок");
        }
        long endDif = System.currentTimeMillis();
        System.out.println(poemDif);
        System.out.printf("Занятое время: %d", endDif - startDif);
    }
}
