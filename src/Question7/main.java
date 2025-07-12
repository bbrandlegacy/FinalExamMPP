package Question7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class main {


    static boolean parser(String bevValue){
        try{
            Integer.parseInt(bevValue);
            return true;
        } catch(NumberFormatException e){
            System.out.println(bevValue + " is N/A");
        }
        return false;
    }

    static Comparator<Integer> sugarContent = (Integer::compare);
    static Comparator<String> alphabetically = (String::compareToIgnoreCase);

    public static void main(String[] args) {
        Map<String, String> beverageSugarMap = Map.ofEntries(
                Map.entry("Cold Brew Coffee", "0"),
                Map.entry("Iced Green Tea", "12"),
                Map.entry("Sparkling Water", "N/A"),
                Map.entry("Lemonade", "28"),
                Map.entry("Berry Smoothie", "N/A"),
                Map.entry("Chai Latte", "22"),
                Map.entry("Coconut Water", "15"),
                Map.entry("Apple Juice", "34"),
                Map.entry("Classic Soda", "40"),
                Map.entry("Orange Juice", "23"),
                Map.entry("Detox Green Smoothie", "16")
        );

        beverageSugarMap.entrySet().stream()
                .filter((x)->{
                    return parser(x.getValue()) &&
                            (x.getKey().contains("Juice") || x.getKey().contains("Smoothie")) &&
                            Integer.parseInt(x.getValue()) < 12;
                })
                .sorted((x,y)-> sugarContent.compare(Integer.parseInt(x.getValue()),Integer.parseInt(y.getValue())))
                .sorted((x,y) -> alphabetically.compare(x.getKey(),y.getKey()))
                .forEach((x)->{
                    System.out.println(x.getKey()+": "+x.getValue());
                });


    }
}
