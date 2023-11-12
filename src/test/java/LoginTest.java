import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private inicio_sesion ini_sesion = new inicio_sesion();


    //Testing usuarios
    @Test
    public void usuarioValidoNoVacioTest(){
        boolean resultado = ini_sesion.corroborarUsuario("franco");
        assertTrue(resultado);
    }

    @Test
    public void usuarioInvalidoNoVacioNumerosTest(){
        boolean resultado = ini_sesion.corroborarUsuario("123");
        assertFalse(resultado);
    }

    @Test
    public void usuarioInvalidoConAlMenosUnDigitoTest(){
        boolean resultado = ini_sesion.corroborarUsuario("fr4nco");
        assertFalse(resultado);
    }

    @Test
    public void usuarioInvalidoVacioTest(){
        boolean resultado = ini_sesion.corroborarUsuario("");
        assertFalse(resultado);
    }

    @Test
    public void usuarioInvalidoEspacioTest(){
        boolean resultado = ini_sesion.corroborarUsuario(" ");
        assertFalse(resultado);
    }

    //Testing contraseña

    @Test
    public void contraseniaInvalidaVaciaTest(){
        char [] contra = new char[0];
        boolean resultado = ini_sesion.corroborarContrasenia(contra);
        assertFalse(resultado);
    }


    @Test
    public void contraseniaInvalidaSoloNumerosTest(){
        char [] contra = new char[10];
        contra[0] = '1';
        contra[1] = '2';
        contra[2] = '3';
        contra[3] = '4';
        contra[4] = '5';
        contra[5] = '6';
        contra[6] = '7';
        contra[7] = '8';
        contra[8] = '9';
        contra[9] = '0';
        boolean resultado = ini_sesion.corroborarContrasenia(contra);
        assertFalse(resultado);
    }

    @Test
    public void contraseniaInvalidaSoloLetrasTest(){
        char [] contra = new char[10];
        contra[0] = 'f';
        contra[1] = 'r';
        contra[2] = 'a';
        contra[3] = 'n';
        contra[4] = 'c';
        contra[5] = 'o';
        contra[6] = 'f';
        contra[7] = 'r';
        contra[8] = 'a';
        contra[9] = 'n';
        boolean resultado = ini_sesion.corroborarContrasenia(contra);
        assertFalse(resultado);
    }

    @Test
    public void contraseniaInvalidaDemasiadoCortaTest(){
        char [] contra = new char[8];
        contra[0] = 'f';
        contra[1] = 'r';
        contra[2] = 'a';
        contra[3] = 'n';
        contra[4] = '1';
        contra[5] = '2';
        contra[6] = '3';
        contra[7] = '!';
        boolean resultado = ini_sesion.corroborarContrasenia(contra);
        assertFalse(resultado);
    }

    @Test
    public void contraseniaValidaTest(){
        char [] contra = new char[10];
        contra[0] = 'f';
        contra[1] = 'r';
        contra[2] = 'a';
        contra[3] = 'n';
        contra[4] = 'c';
        contra[5] = 'o';
        contra[6] = '1';
        contra[7] = '2';
        contra[8] = '3';
        contra[9] = '!';
        boolean resultado = ini_sesion.corroborarContrasenia(contra);
        assertTrue(resultado);

    }

}
