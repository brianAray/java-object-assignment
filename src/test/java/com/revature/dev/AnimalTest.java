package com.revature.dev;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.revature.dev.service.Animal;
import com.revature.dev.service.Diet;
/**
 * Unit test for simple App.
 */
public class AnimalTest {

    private Animal animal;
    private String name;
    private int age;
    private int legs;
    private Diet diet;

    @BeforeClass
    public void setup(){
        this.animal = new Animal(name, age, legs, diet);
    }

    @Test
    public void testValidAnimalCreated(){
        // This test is looking to make sure you have created a valid animal
        Assert.assertNotNull(animal.getName());
        Assert.assertNotNull(animal.getAge());
        Assert.assertNotNull(animal.getLegs());
        Assert.assertNotNull(animal.getDiet());
    }

    @Test
    public void testAnimalSpeakMethod(){
        // This test expects you to implement a method for the animal
        // Make a new animal to finish this test
        Animal animal2 = null;

        Assert.assertNotNull(animal2.speak());
    }

    @Test
    public void testDuplicateAnimalCheck(){
        // This test sees if you can put in a valid check to see if they are the same
        Animal copy1 = new Animal("animal", 2, 4, Diet.HERBIVORE);
        Animal copy2 = new Animal("animal", 2, 4, Diet.HERBIVORE);

        Assert.assertEquals(copy1, copy2);
    }

    @Test
    public void testMakeAMonkey(){
        // This test wants you to create a monkey with name George
        // George is 13 years old
        // He is missing a leg but has all his arms
        // George only eats plants
        Animal monkey = null;

        // Generate your own assert to make sure you have done it correctly
    }


    // Finally make 3 more methods for the animal class and add in 3 more tests
    // in this file

}
