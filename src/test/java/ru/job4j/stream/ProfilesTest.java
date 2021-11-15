package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
       List<Profile> profile = List.of(
               new Profile(new Address("Moscow", " Nikolskaya", 25, 1)),
               new Profile(new Address("Ekaterinburg", "Cosmonauts Avenue", 109, 58))
       );
       Profiles pr = new Profiles();
       List<Address> rsl = pr.collect(profile);
       List<Address> expected = List.of(
               new Address("Moscow", " Nikolskaya", 25, 1),
               new Address("Ekaterinburg", "Cosmonauts Avenue", 109, 58)
       );
        assertThat(rsl, is(expected));
    }
}