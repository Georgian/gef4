package org.eclipse.gef4.graphics;

/**
 * <p>
 * The LineCap specifies how to display unconnected end points of displayed
 * lines. A displayed line does always have a width. That's why you are
 * really dealing with two parallel lines, filled with some color.
 * </p>
 * <p>
 * The different LineCaps are:
 * <ul>
 * <li>{@link #FLAT}</li>
 * <li>{@link #SQUARE}</li>
 * <li>{@link #ROUND}</li>
 * </ul>
 * </p>
 */
public enum LineCap {
	/**
	 * A FLAT {@link LineCap} will not extend a drawn line beyond its
	 * unconnected end points.
	 * 
	 * @see #SQUARE
	 * @see #ROUND
	 */
	FLAT,

	/**
	 * A ROUND {@link LineCap} will draw a semi-circle at the unconnected
	 * end points of a displayed line.
	 * 
	 * @see #FLAT
	 * @see #SQUARE
	 */
	ROUND,

	/**
	 * A SQUARE {@link LineCap} will extend a drawn line beyond its
	 * unconnected end points by half the line's width.
	 * 
	 * @see #FLAT
	 * @see #ROUND
	 */
	SQUARE
}