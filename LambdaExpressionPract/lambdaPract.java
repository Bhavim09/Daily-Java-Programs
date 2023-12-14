package LambdaExpressionPract;

import java.util.function.BiFunction;

public class lambdaPract {
    public static void main(String[] args) {
        BiFunction<String,String,String> bi = (str1,str2)-> str1+str2;
        String result = bi.apply("Hello", "df");
        System.out.println(result);
    }
}
