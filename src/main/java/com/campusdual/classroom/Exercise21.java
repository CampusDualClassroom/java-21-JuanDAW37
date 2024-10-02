package com.campusdual.classroom;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        HashSet<String> hash = new HashSet<String>();
        hash.add("ELEMENT KPRBC");
        hash.add("ELEMENT YPBTM");
        hash.add("ELEMENT AADXU");
        hash.add("ELEMENT RXCGJ");
        hash.add("ELEMENT WYMVD");
        hash.add("ELEMENT WFGEJ");
        hash.add("ELEMENT TYGBS");
        hash.add("ELEMENT MAPTK");
        hash.add("ELEMENT GJXVE");
        hash.add("ELEMENT BAFGL");
        return hash;
    }

    public static Set<String> createTreeSet() {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("ELEMENT KPRBC");
        tree.add("ELEMENT YPBTM");
        tree.add("ELEMENT AADXU");
        tree.add("ELEMENT RXCGJ");
        tree.add("ELEMENT WYMVD");
        tree.add("ELEMENT WFGEJ");
        tree.add("ELEMENT TYGBS");
        tree.add("ELEMENT MAPTK");
        tree.add("ELEMENT GJXVE");
        tree.add("ELEMENT BAFGL");
        return tree;
    }

    private static void printSet(Set<String> customSet) {
        Iterator it = customSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        boolean resultado = set.add(elementToAdd);
        return resultado;
    }

    public static void main(String[] args) {
        HashSet<String> hash;
        hash = new HashSet<String>(createHashSet());
        addElementToSet(hash, "ELEMENT AAA");
        TreeSet<String> tree;
        tree = new TreeSet<>(createTreeSet());
        addElementToSet(tree, "ELEMENT AAA");
        printSet(hash);
        printSet(tree);
    }

}
