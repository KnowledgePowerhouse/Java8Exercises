package kpower.function;

import java.util.function.Function;

public class EmployeeFunction {
    public static void main(String[] args) {
        Function<Integer,String> empExperienceFunction = (s)->{
            if (s < 3) {
                return "Employee with " + s + " years of experience is at Fresher level.";
            }else{
                return "Employee with " + s + " years of experience is at Senior level.";
            }
        };

        // Using apply() method in Function
        System.out.println(empExperienceFunction.apply(1));
        System.out.println(empExperienceFunction.apply(5));
    }

}
