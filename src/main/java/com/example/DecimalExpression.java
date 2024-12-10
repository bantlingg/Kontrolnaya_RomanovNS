package com.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalExpression implements Expression {
    @Override
    public String interpret(String context) {
        Pattern pattern = Pattern.compile("\\\\d(\\d+)");
        Matcher matcher = pattern.matcher(context);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            double value = Double.parseDouble(matcher.group(1));
            matcher.appendReplacement(result, String.format("%.2f", value));
        }
        matcher.appendTail(result);

        return result.toString();
    }
}
