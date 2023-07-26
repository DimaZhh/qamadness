package animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTests {

    @Test
    public void testLucky() {

        Cat cat = new Cat("name", 12);

        assertEquals("say may", cat.yourVoiceForTests());
    }
}
