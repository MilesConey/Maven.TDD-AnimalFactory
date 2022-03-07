package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @After
    //Had to add this because the expected and actual for the removal wasn't function properly based off add test. "Annotating a public void method with @After causes that method to be run after the Test method". source:http://junit.sourceforge.net/javadoc/org/junit/After.html#:~:text=Annotation%20Type%20After&text=If%20you%20allocate%20external%20resources,Test%20method%20throws%20an%20exception.
    public void tearDown() {
        DogHouse.clear();
    }

    @Test
    public void getNumberOfDogsTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);


        // When
        DogHouse.add(animal);

        // Then
        System.out.println(DogHouse.getNumberOfDogs());
    }

    @Test
    public void addDogTest(){
        //Given
        int expected = 1;

        //When
        Dog bibby = new Dog("bibby", new Date(4), 9);
        DogHouse.add(bibby);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals( expected, actual);

    }

    @Test
    public void removeDogTest(){
        //Given
        int expected = 1;

        //When
        Dog slick = new Dog("slick", new Date(2), 1);
        Dog bibby = new Dog("bibby", new Date(4), 9);
        DogHouse.add(bibby);
        DogHouse.add(slick);
        DogHouse.remove(slick);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals( expected, actual);

    }

    @Test
    public void removeDogIDTest(){
        //Given
        int expected = 1;

        //When
        Dog slick = new Dog("slick", new Date(2), 1);
        Dog bibby = new Dog("bibby", new Date(4), 9);
        DogHouse.add(bibby);
        DogHouse.add(slick);
        DogHouse.remove(1);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getDogByIDTest(){
        //Given
        Dog expected = new Dog("roxi", new Date(2),3);

        //When
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(3);

        //Then
        Assert.assertEquals( expected, actual);
    }
 }

