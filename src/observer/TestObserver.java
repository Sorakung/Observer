/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author user
 */
public class TestObserver {
    public static void main(String[] args) {
	HeadQuater obj = new HeadQuater();
        Senior obj1 = new Senior();
	Marketing obj2 = new Marketing();              
	obj.addObserver(obj1);              
	obj.addObserver(obj2);              
	obj.setSData(6);
        obj.setSData(7);
    }
}
