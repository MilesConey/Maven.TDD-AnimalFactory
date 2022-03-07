package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Sparky";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String expectedDogName = "rockey";

        // When (a dog's name is set to the given name)
        Dog dog = new Dog("rockey", new Date(8), 9);
        dog.setName(expectedDogName);
        String actualDogName = dog.getName();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a dog exists)
        Date expectedBirthDate = new Date(6);

        // When (a dog's name is set to the given name)
        Dog dog = new Dog("rockey", new Date(8), 9);
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void setSpeakTest(){
        //Given
        String expectedSpeak = "bark!";
        //When
        Dog dog = new Dog("rocko", new Date(6), 2);
        dog.speak();
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void setEat(){
        //Given
        Food food = new Food();
        int numberOfMealsExpected = 1;

        //When
        Dog dog = new Dog("fluffy", new Date(8), 3);
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(numberOfMealsExpected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        int idExpected = 3;

        //When
       Dog dog = new Dog("fluffy", new Date(8), 3);
        int actual = (3);

        //Then
        Assert.assertEquals(idExpected, actual);
    }

    @Test
    public void AnimalInheritanceTest() {
        //Given

        //When
        Dog dog = new Dog("fluffy", new Date(8), 3);

        //Then
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void MammalInheritanceTest(){
        Dog dog = new Dog ("jasper", new Date(3), 2);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
