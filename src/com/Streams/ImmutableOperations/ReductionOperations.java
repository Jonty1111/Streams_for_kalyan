package com.Streams.ImmutableOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReductionOperations {
    //Reduce -> Collection of Objects -> Gives a single valued result which is Immutable

    //Identity -> Initial value of the Operation -> Default Result -> When your Stream is Empty

    //Accumulator -> a,b -> a[partial result] + b[next element of the stream]

    //Combiner -> Types of Accumulator Implementation.

    //1. Optional<T>reduce(BinaryOperator<T> accumulator)
    //Binary operator are those which Consist of two operands and getting manuplated
    public static void main(String[] args) {
        List<Person4> lst=new ArrayList<>();

        lst.add(new Person4("Jonty",12,20000));
        lst.add(new Person4("Jonty1",18,25000));
        lst.add(new Person4("Jonty2",24,30000));
        lst.add(new Person4("Jonty3",30,40000));
        lst.add(new Person4("Jonty4",36,48000));
        //1. Optional<T>reduce(BinaryOperator<T> accumulator)

        //Finding the total salary using reduce
        Optional<Integer> totalSalary= lst.stream().map(s->s.getSalary()).reduce((p,q)->p+q);

        if(totalSalary.isPresent())
        {
            System.out.println("Total Salary is : " + totalSalary);
        }
        else{
            System.out.println("No Records Found");
        }
        //Finding the salary using Sum()
        int totalSalary1= lst.stream().mapToInt(s->s.getSalary()).sum();
        System.out.println("Total Salary using sum is : " + totalSalary1);

        //String Concat using reduce
        Optional<String> totalname= lst.stream().map(s->s.getName()).reduce((p,q)->p+q);
        if(totalname.isPresent())
        {
            System.out.println(totalname);
        }







        List<Integer> lst2=new ArrayList<>();
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        //2.T reduce identity, BinaryOperator<T> accumulator
        int totalSalary2=lst2.stream().reduce(10,(partialSum,nextElement)->partialSum+nextElement);
        System.out.println("Total Sum of Integer is : "+totalSalary2);

        //3.
        // 1 stream -> 1.1 stream -> 1.2 stream -> 1.3 stream
        List<Integer> lst3=new ArrayList<>();
        lst3.add(1);
        lst3.add(2);
        lst3.add(3);
        lst3.add(4);
        lst3.add(5);
        lst3.add(6);
        //stream->payroll[jan+feb+mar]
        //SUb Streams->payroll->jan[sub]->Number of Days->feb[sub]->number of days->mar[sub]->number of days
        int totalsum2=lst3.parallelStream().reduce(2,(p,q)->p+q,Integer::sum);
        System.out.println("Total Sum of Integer is : "+totalsum2);

        //4.Max and Min

       Optional<Integer> maxNum=lst3.stream().max(Comparator.naturalOrder());
        //Optional<Integer> maxNum=lst3.stream().max(Comparator.reverseOrder());

        System.out.println("Max element is : "+maxNum);

        Optional<Integer> minNum=lst3.stream().min(Comparator.naturalOrder());
        System.out.println("Min element is : "+minNum);
        //using reverse order
        Optional<Integer> maxNumUsingReverse=lst3.stream().max(Comparator.reverseOrder());
        System.out.println(maxNumUsingReverse);

    }


}

class Person4 {

    String name;
    int age;
    int salary;
    Person4(String name)
    {
        this.name=name;
    }

    public Person4()
    {   }

    public Person4(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Person4{" + "name='" + name + '\'' + ", age=" + age + ", salary='" + salary + '\'' + '}';
    }


    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }




}
