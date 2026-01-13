package OOPS.Abstract.InterfacesExample;

interface Edible {

    default void isEdible(){
        System.out.println("If i am fruit then i am Edible");
    }

   void eat();
}
