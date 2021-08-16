package baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 5:58 PM
*/



import java.util.List;

public class From implements Expression {
    private final String table;
    private Where where;

    public From(String table) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        if(where == null) {
            return context.search();
        }
        return where.interpret(context);
    }
}
