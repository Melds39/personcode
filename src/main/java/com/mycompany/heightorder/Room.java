
package com.mycompany.heightorder;
import java.util.ArrayList;

public class Room {
    
private ArrayList<Person> person;
    
    //Empty constructor - only used to initialize Arraylist to be used on future ADD method.
    public Room(){
       this.person = new ArrayList<>();
    }
    
    //Add person object to person ArrayList - Person object as method parameter 
    public void add(Person p){
        this.person.add(p);
    }
    //Returns true if ArrayList is empty
    public boolean isEmpty(){
        return this.person.isEmpty();
    }
    
    //Returns current person object
    public ArrayList<Person> getPersons(){
        return this.person;
    }
    
    //Method to return shorterst person on list
    public Person shortest(){
        //return null if empty
        if (this.person.isEmpty()){
            return null;
        }
        //Reference object set as first person on list to compare with rest of list
        Person shortestPerson = this.person.get(0);
        //for simplified object loop to go through list
        for (Person p: this.person){
            //If statement to compare height of our current shortestPerson object every loop. 
            //If if we find taller person, we set it as our new shortestPerson
            
            if(shortestPerson.getHeight() > p.getHeight()){
                shortestPerson = p;
            }
            
        }
        return shortestPerson;
    }
    //Takes shortest person from the room and return taken object
    public Person take(){
       if (this.person.isEmpty()){
            return null;
        } 
       
       //Create new object to hold as reference to return later 
       Person shortestRemoved = this.shortest();
       
       //removes shortest object from list
       this.person.remove(this.shortest());
       
       //use our reference object to return shortest removed (since shortest was removed we needed the helper object to hold its value to be returned
       return shortestRemoved;
       
       
    }
    
}
