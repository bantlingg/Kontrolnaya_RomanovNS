package com.example;
class NewlineExpression implements Expression {
    @Override
    public String interpret(String context) {
        return context.replace("\\n", "\n");
    }
}