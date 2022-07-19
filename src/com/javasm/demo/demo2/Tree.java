package com.javasm.demo.demo2;

import java.util.List;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月07日 19:56
 * @description
 */
public class Tree {
    private Integer id;
    private String name;
    private List<Tree> children;
    private Integer parentId;

    public Tree() {
    }

    public Tree(Integer id, String name, Integer parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                ", parentId=" + parentId +
                '}';
    }
}
