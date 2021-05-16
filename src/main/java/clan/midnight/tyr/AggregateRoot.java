package clan.midnight.tyr;

/**
 * Aggregate Root is the entity that is responsible for an Aggregate to interact and commune with other aggregate.
 *
 * @param <I> the type of Identity of the Aggregate Root
 */
public interface AggregateRoot<I extends Identifier> extends Entity<I> {
}
