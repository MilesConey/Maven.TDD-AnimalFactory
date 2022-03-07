package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Mario";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        //Given
        String expectedName = "Mario";

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);
        cat.setName(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setSpeakTest() {
        //Given
        String expected = "meow!";

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);
        cat.speak();
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        Food food = new Food();
        int numberOfMealsExpected = 1;

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(numberOfMealsExpected, actual);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Date birthDateExpected = new Date(6 - 10 - 2021);

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);
        cat.setBirthDate(birthDateExpected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(birthDateExpected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        int idExpected = 3;

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);
        int actual = cat.getId();

        //Then
        Assert.assertEquals(idExpected, actual);
    }

    // https://www.baeldung.com/java-instanceof

    @Test
    public void AnimalInheritanceTest() {
        //Given

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void MammalInheritanceTest() {
        //Given

        //When
        Cat cat = new Cat("fluffy", new Date(8), 3);

        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }
}