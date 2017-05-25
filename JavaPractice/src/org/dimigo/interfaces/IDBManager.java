/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject (String database) {
		if("SYBASE".equals(database)) {
			return new SybaseDB();
		} else if("ORACLE".equals(database)) {
			return new OracleDB();
		}
		return null;
	}
}
