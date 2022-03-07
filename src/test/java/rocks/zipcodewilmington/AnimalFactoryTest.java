package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        //Given
        String givenName = "Poppy";
        Date givenBirthdate = new Date();

        //When
        Dog dog = AnimalFactory.createDog(givenName,givenBirthdate);
        DogHouse.add(dog);

        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals( 1, actual);
    }

    @Test
    public void createCatTest() {
        //Given
        String givenName = "Munchkin";
        Date givenBirthdate = new Date();

        //When
        Cat cat = AnimalFactory.createCat(givenName,givenBirthdate);
        CatHouse.add(cat);

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals( 1, actual);
    }












}