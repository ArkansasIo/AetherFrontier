package aether.server.database;

/** Persistence abstraction shared by SQLite and MySQL implementations. */
public interface Database extends AutoCloseable {
    void open();
    void migrate();
    boolean isOpen();

    @Override
    void close();
}
