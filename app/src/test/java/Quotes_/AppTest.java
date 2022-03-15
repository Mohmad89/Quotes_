
package Quotes_;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;



class AppTest {

    @Test void GsonTest () {
        Parse pars = new Parse();
        pars.readFile();
        assertEquals( "Contact",pars.fileChooseQuote().getClass().getSimpleName() );
    }
    
    @Test 
    void APITest () throws IOException {
        Parse parse = new Parse ();

        assertEquals(true, parse.apiChooseQuote());


    }


}
