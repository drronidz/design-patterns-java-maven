package baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 5:59 PM
*/

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {
    private final Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
