/**
 * 
 */
package es.lucatic.peliculaslee.com.utils;


/**
 * Una clase auxiliar para crear tuplas de 2 elementos
 * @author Jade Arkadian
 *
 */
public class Pair<T1,T2>
{
	private T1 value1;
	private T2 value2;	
	
	/**
	 * @param value1
	 * @param value2
	 */
	public Pair(T1 value1, T2 value2) 
	{
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	/**
	 * @return the value1
	 */
	public T1 getValue1() 
	{
		return value1;
	}
	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(T1 value1) 
	{
		this.value1 = value1;
	}
	/**
	 * @return the value2
	 */
	public T2 getValue2() 
	{
		return value2;
	}
	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(T2 value2) 
	{
		this.value2 = value2;
	}
	
	
	

}
