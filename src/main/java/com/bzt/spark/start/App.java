package com.bzt.spark.start;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        for(String arg : args){
            System.out.println("arg -->" + arg);
        }
        get("/hello", (req, res) -> "いらっしゃいませxxxxfdsafdsaffdfffffffffffffffffffffffhhhjdskahhjfkdsahkdhk");
    }
} 
