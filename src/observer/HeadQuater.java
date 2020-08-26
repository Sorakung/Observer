/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


import java.util.Observable;

/**
 *
 * @author sarun
 */
public class HeadQuater extends Observable {
    private int sData;

    public void setSData(int aData) {
	sData = aData;
        setChanged();
        notifyObservers();
    }
    public int getSData() {
	return sData;
    }
}
