package com.javasm.demo.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月07日 17:19
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {


    }

//    private static void test9() {
//        List<Double> list = new ArrayList<>();
//        Collections.addAll(list, 10D, 20D, 30D);
//        Optional<Double> optional = list.stream().reduce((a,b)->{return a+b;});
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
//    }

//    private static void test8() {
//        List<Double> list = new ArrayList<>();
//        Collections.addAll(list, 10D, 20D, 30D);
//        Optional<Double> optional = list.stream().reduce(Math::max);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }
//    }

//    private static void test7() {
//        List<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,2,3,4);
//        list.stream().skip(3).collect(Collectors.toList()).forEach(System.out::println);
//
//    }
//
//    private static void test6() {
//        List<User> list = new ArrayList<>();
//        Collections.addAll(list, new User(1, "hhhhhh", 10), new User(2, "qwe", 20), new User(3, "qqqqqqn", 30));
//        list.stream().map(user -> user.getName().toUpperCase()).filter(name -> name.contains("H")).collect(Collectors.toList()).forEach(System.out::println);
//    }

//    private static void test5() {
//          List<User> list = new ArrayList<>();
//          Collections.addAll(list, new User(1, "hhhhhh", 10), new User(2, "qwe", 20), new User(3, "qqqqqqn", 30));
//          list.stream().peek(user -> user.setName(user.getName().toUpperCase())).collect(Collectors.toList()).forEach(System.out::println);
//    }

//    private static void test4() {
//        List<User> list = new ArrayList<>();
//        Collections.addAll(list, new User(1, "hhhhhh", 10), new User(2, "qwe", 20), new User(3, "qqqqqqn", 30));
//        list.stream().map((user -> {
//            user.setName(user.getName().toUpperCase());
//            return user;
//        })).collect(Collectors.toList()).forEach(System.out::println);
//    }


    //    private static void test3() {
//        List<User> list = new ArrayList<>();
//        Collections.addAll(list,new User(1,"hhhhhh",10),new User(2,"qwe",20),new User(3,"qqqqqqn",30));
//        list.stream().filter(user->user.getAge()>20).collect(Collectors.toList()).forEach(System.out::println);
//    }

//    private static void test2() {
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, "ml", "qe", "asdml");
//        list.parallelStream().filter(str->
//         str.contains("m")
//        ).collect(Collectors.toList()).forEach(System.out::println);
//
//    }

//    private static void test1() {
//        List<Integer> list =new ArrayList<>();
//        Collections.addAll(list,1,2,2,4,5);
//        List<Integer> collect = list.stream().sorted().distinct().collect(Collectors.toList());
//        collect.forEach(System.out::println);
//    }
}
