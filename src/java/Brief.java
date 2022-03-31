
import javax.persistence.Entity;

/**
 *
 * @author hartlden
 */
@Entity
public class Brief extends Sendung {

    private int myint;

    public int getMyint() {
        return myint;
    }

    public void setMyint(int myint) {
        this.myint = myint;
    }
}
