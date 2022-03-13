/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Arun.John
 *
 */
public class Admin implements User {

	@Override
	public String getEntitlements() {
		return "Admin user";
	}

}
