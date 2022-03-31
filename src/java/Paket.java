
import javax.persistence.Entity;

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
