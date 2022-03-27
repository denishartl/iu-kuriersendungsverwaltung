
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
    private boolean Sperrgut;

    public boolean isSperrgut() {
        return Sperrgut;
    }

    public void setSperrgut(boolean Sperrgut) {
        this.Sperrgut = Sperrgut;
    }
    
    
}
