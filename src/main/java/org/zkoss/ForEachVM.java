/* ForEachVM.java

	Purpose:
		
	Description:
		
	History:
		3:56 PM 9/14/15, Created by jumperchen

Copyright (C) 2015 Potix Corporation. All Rights Reserved.
*/
package org.zkoss;

import java.util.Collections;
import java.util.List;

/**
 * @author jumperchen
 */
public class ForEachVM {
	private static List<Integer> array = Collections.nCopies(30, 30);
	public void setArray(List<Integer> array) {}
	public List<Integer> getArray() {
		return array;
	}
}
