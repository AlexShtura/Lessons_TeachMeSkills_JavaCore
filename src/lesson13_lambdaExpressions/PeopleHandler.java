package lesson13_lambdaExpressions;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class PeopleHandler {
    public List<Person> sortByAge(List<Person>people){
        List <Person> result = new ArrayList<Person>();
        LocalDate now = LocalDate.now();
        for (Person el: people){
            Period date = Period.between(now, el.getBirthday());
            date.getYears();
            if(date.getYears()>30){
                result.add(el);
            }
        }
        return result;


    }
}
