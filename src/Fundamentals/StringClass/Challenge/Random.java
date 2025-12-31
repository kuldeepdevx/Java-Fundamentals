package Fundamentals.StringClass.Challenge;

class Dice{

     int rollDice(){
        return (int)Math.ceil(Math.random()*6);
    }

    public static void main(String[] args){

         Dice roll=new Dice();
         for(int i=0;i<100;i++)
             if(roll.rollDice()==0)
        System.out.println(roll.rollDice());
    }
}
