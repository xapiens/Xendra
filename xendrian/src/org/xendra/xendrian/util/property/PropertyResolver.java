package org.xendra.xendrian.util.property;

/**
 * Properties resolver.
 *
 * @author Alin Dreghiciu
 * @since 0.5.0, January 16, 2008
 */
public interface PropertyResolver
{

    /**
     * Resolves a property based on it's name.
     *
     * @param propertyName property name to be resolved
     *
     * @return value of property or null if property is not set or is empty.
     */
    String get( String propertyName );

}
