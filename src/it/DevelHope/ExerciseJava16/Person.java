package it.DevelHope.ExerciseJava16;

public class Person {

    public int age;

    public Person(){
        double randomValue = Math.floor(Math.random()*(80-5+1)+5);
        int age = (int) randomValue;
        this.age = age;
        System.out.println(age);
    }

    public String getLifeStage(){
        if (age <=12){
            return ("The person is in the 'Child' stage of life.");
        } else if (age >=13 && age <=19){
            return ("The person is in the 'Teen' stage of life.");
        } else if (age >=20 && age <=59){
            return ("The person is in the 'Adult' stage of life.");
        } else if (age >60){
            return ("The person is in the 'Senior Adult' stage of life.");
        }
        return null;
    }
}
