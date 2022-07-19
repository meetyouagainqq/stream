package com.javasm.demo.demo2;

import org.w3c.dom.Node;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月07日 19:58
 * @description
 */
public class TreeTest {
    private static List<Tree> treeList;

    public static void main(String[] args) {
        System.out.println("请输入要查询的父节点id:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        List<Tree> objectList = treeList.stream().filter(tree -> tree.getId().equals(value))
                .peek(children -> children.setChildren(findChildren(children))).collect(Collectors.toList());
        objectList.forEach(System.out::println);
    }

    static {
        treeList = new ArrayList<>(10);
        treeList.add(new Tree(1, "tree1", 0));
        treeList.add(new Tree(2, "tree2", 1));
        treeList.add(new Tree(3, "tree3", 1));
        treeList.add(new Tree(4, "tree4", 2));
    }

    private static List<Tree> findChildren(Tree children) {
        List<Tree> collect = treeList.stream().filter(tree -> children.getId().equals(tree.getParentId()))
                .peek(parentNode -> parentNode.setChildren(findChildren(parentNode))).collect(Collectors.toList());
        return collect;
    }
}
