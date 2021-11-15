package org.gb.sealed;

/**
 * Every permitted subclass must use a modifier to describe how it propagates
 * the sealing initiated by its superclass:
 * • final – to prevent further extending
 * • sealed – to restrict extending
 * • non-sealed – to be open for extension – sealed class cannot force its subclasses
 * to not be open
 */
public non-sealed class Rectangle extends Shape {
}

