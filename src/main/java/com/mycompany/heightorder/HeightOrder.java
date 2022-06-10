

package com.mycompany.heightorder;


public class HeightOrder {

    public static void main(String[] args) {
       Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        //Prints all person in order my taking out shortest using take() method we created.
        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
}
    
}
