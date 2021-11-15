package org.gb.sealed;

/**
 * The sealed class and its permitted subclasses must belong to the same
 * module, and, if declared in an unnamed module, to the same package.
 *
 * Sealed class declares subclasses by a 'permits' keyword.
 *
 * Every permitted subclass must directly extend the sealed class.
 */
public abstract sealed class Shape permits Rectangle {

}

