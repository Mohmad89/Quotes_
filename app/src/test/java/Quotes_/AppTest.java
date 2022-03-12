
package Quotes_;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class AppTest {

    @Test void GsonTest () {
        Parse pars = new Parse();
        pars.readFile();
        assertEquals( "Contact",pars.chooseQuote().getClass().getSimpleName() );
    }


}
