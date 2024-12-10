package com.example;
public class SmileExpression implements Expression {
    @Override
    public String interpret(String context) {
        return context.replace("\\s", ":)");
    }
}
