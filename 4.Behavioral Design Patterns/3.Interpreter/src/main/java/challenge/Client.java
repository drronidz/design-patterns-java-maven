package challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 5:19 PM
*/

public class Client {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context context1 = new Context("John");
        System.out.println("John is male ? " + isMale.interpret(context1));

        Context context2 = new Context("Married Julie");
        System.out.println("Julie is married women ? " + isMarriedWoman.interpret(context2));

        Context context3 = new Context("Lucy");
        System.out.println("Lucy is male ? " + isMale.interpret(context3));

    }
}
