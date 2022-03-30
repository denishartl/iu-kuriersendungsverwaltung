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
public class Brief extends Sendung {
    private int myint;

    public int getMyint() {
        return myint;
    }

    public void setMyint(int myint) {
        this.myint = myint;
    }
    
    
    
}