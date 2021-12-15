package sort;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 区分 comparable 和 comparator 和 lambda 表达式
 */

/**
 * comparable
 */


//class Person implements Comparable<Person>{
//    String Name;
//    int Age;
//    public Person(int age,String name){
//        Name=name;
//        Age=age;
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        if(this.Age>o.Age) return 1;
//        else if(this.Age<o.Age) return -1;
//        else return 0;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "Name='" + Name + '\'' +
//                ", Age=" + Age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Person[] people=new Person[]{new Person(10,"tomcat"),new Person(20,"java"),new Person(1,"golang")};
//        Arrays.sort(people);
//        for(int i=0;i< people.length;i++){
//            System.out.println(people[i].toString());
//        }
//
//    }
//}

/**
 * comparator
 */

//class Person {
//    String Name;
//    int Age;
//    public Person(int age,String name){
//        Name=name;
//        Age=age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "Name='" + Name + '\'' +
//                ", Age=" + Age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Person[] people=new Person[]{new Person(10,"tomcat"),new Person(20,"java"),new Person(1,"golang")};
//        Arrays.sort(people,new newComparator());
//        for(int i=0;i< people.length;i++){
//            System.out.println(people[i].toString());
//        }
//
//    }
//}
//
//class newComparator implements Comparator<Person>{
//    @Override
//    public int compare(Person o1, Person o2) {
//        if (o1.Age>o2.Age) return 1;
//        else if(o1.Age<o2.Age) return -1;
//        else return 0;
//    }
//}

/**
 * lambda
 */

class Person {
    String Name;
    int Age;
    public Person(int age,String name){
        Name=name;
        Age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public static void main(String[] args) {
        Person[] people=new Person[]{new Person(10,"tomcat"),new Person(20,"java"),new Person(1,"golang")};
        Arrays.sort(people,(p1,p2)->{
            return p1.Age-p2.Age;
        });
        for(int i=0;i< people.length;i++){
            System.out.println(people[i].toString());
        }

    }
}





















