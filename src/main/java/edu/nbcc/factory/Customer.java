/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Arun.John
 *
 */
public class Customer implements User {

	@Override
	public String getEntitlements() {
		return "Customer user";
	}

}
