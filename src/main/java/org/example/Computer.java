package org.example;

/**
 * Computer interface used as an abstraction for different machine types.
 *
 * Theory:
 * - Programming to interfaces (not implementations) allows Spring to inject any
 *   suitable implementation. This decouples consumers from concrete classes and
 *   makes switching implementations trivial (e.g., Laptop vs Desktop).
 * - When Spring resolves a dependency of type Computer it will search the
 *   application context for a bean whose class implements this interface.
 */
public interface Computer {
    /** Perform compile action. Implementations should provide concrete behavior. */
    void compile();
}
