
import javax.persistence.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */
@Entity
public class Paket extends Sendung {
    private boolean sperrgut;

    public boolean isSperrgut() {
        return sperrgut;
    }

    public void setSperrgut(boolean sperrgut) {
        this.sperrgut = sperrgut;
    }
    
}
