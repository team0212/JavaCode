package com.visitor.manAndWoman;

import java.util.ArrayList;
import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ObjectStructure.java
//  @ Date : 2016/9/27
//  @ Author : 
//
//

public class ObjectStructure {
    public List<Human> humen = new ArrayList<>();

    public void accach(Human human) {
        humen.add(human);
    }

    public void detach(Human human) {
        humen.remove(human);
    }

    public void accept(Status status) {
        for (Human human : humen) {
            human.accept(status);
        }
    }
}
