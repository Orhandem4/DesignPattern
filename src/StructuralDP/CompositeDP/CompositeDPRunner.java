package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeDPRunner {

    public void compositeDemo(){

        // child departmanlarımı olusturuyorum
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department argeDepartment = new Arge();
        // GenelDepartman objeme child departmanları ekliyorum
        Department regionalDepartmat = new RegionalDepartment(Arrays.asList(financeDepartment,salesDepartment,argeDepartment));

        System.out.println(regionalDepartmat.getName());
        System.out.println("*******************************");
        System.out.println(regionalDepartmat.getEmployees());

    }

    public static void main(String[] args) {

        CompositeDPRunner composite = new CompositeDPRunner();
        composite.compositeDemo();

    }

}
