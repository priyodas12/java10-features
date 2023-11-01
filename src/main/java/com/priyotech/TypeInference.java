package com.priyotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TypeInference {

    public static void main(String[] args) {
        /** compiler looks as right hand side type automatically evaluated as String from Java 7*/
        List<String> stringList=new ArrayList<>();

        /** compiler looks as right hand side type automatically evaluated as String*/
        Predicate<String> isValidString= s-> s.length()>=10;

        String name1="Priyo_Das";

        /** compiler looks as left hand side type automatically evaluated as String*/
        var name2="priya_das";

        System.out.println(name2.getClass()); //class java.lang.String
        /**Java Still statically typed language*/

        displayNames();

        /**var cannot be used like below
         *
         *  Fields
         *  Method parameter and return type
         *  Catch block
         *
         *  public class Test{
         *      var f_name;
         *      var l_name
         *
         *      public var getFullName(var s1,var s2){
         *
         *      }
         *  }
         *
         *
         * */
    }

    public static void displayNames(){
        var listOfClubs= Arrays.asList("ATK FC", "GOA FC", "Bengaluru FC",null);

        for(var club:listOfClubs){
            System.out.println(club);
        }
    }

}
