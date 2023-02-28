package com.kzy._17iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
        //  while loop
        //  Iterator iter = namesRepository.getIterator();
        //  while (iter.hasNext()) {
        //      String name = (String) iter.next();
        //      System.out.println("Name : " + name);
        //  }
    }
}