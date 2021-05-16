package clan.midnight.tyr;

/**
 * A class is identifiable by implementing the interface.
 *
 * @param <I> the type of Identity of the class implementing the interface
 */
public interface Identifiable<I extends Identifier> {
    I getId();
}
