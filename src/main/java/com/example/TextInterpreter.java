package com.example;
import java.util.ArrayList;
import java.util.List;


public class TextInterpreter {
    private final List<Expression> expressions = new ArrayList<>();

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public String interpret(String text) {
        for (Expression expression : expressions) {
            text = expression.interpret(text);
        }
        return text;
    }
}
