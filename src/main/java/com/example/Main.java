package com.example;

public class Main {
    public static void main(String[] args) {

        String text = "Пример текста с \\nпереносом строки, числом \\d42 и смайликом \\s.";
        System.out.println(text);

        TextInterpreter interpreter = new TextInterpreter();
        interpreter.addExpression(new NewlineExpression());
        interpreter.addExpression(new DecimalExpression());
        interpreter.addExpression(new SmileExpression());


        String formattedText = interpreter.interpret(text);


        System.out.println(formattedText);
    }
}
