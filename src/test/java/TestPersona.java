import modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    @DisplayName("Prueba Metodos Set y Get")
    public void test1(){
        Persona p=new Persona();
        p.setNombre("Maria");
        try {
            p.setEdad(20);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assertions.assertAll(
                ()->Assertions.assertEquals("Maria", p.getNombre()),
                ()->Assertions.assertEquals(20, p.getEdad())
        );

        //Assertions.assertEquals("Maria", p.getNombre());
        //Assertions.assertEquals(21, p.getEdad());
    }

    @Test
    @DisplayName("Prueba Edad Negativa")
    public void test2() throws Exception {
        Persona p=new Persona();
        p.setNombre("Maria");
        Assertions.assertThrows(Exception.class, ()->p.setEdad(-1));

    }

}
