package aether.server.database;

import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Local persistence for offline and player-hosted sessions. */
public final class SQLiteDatabase implements Database {
    private final Path file;
    private Connection connection;

    public SQLiteDatabase(Path file) { this.file = file; }

    @Override
    public void open() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + file.toAbsolutePath());
        } catch (SQLException e) {
            throw new IllegalStateException("Unable to open SQLite database", e);
        }
    }

    @Override
    public void migrate() {
        if (!isOpen()) throw new IllegalStateException("Database is not open");
        // Migration runner will execute versioned SQL from database/sqlite/migrations.
    }

    @Override
    public boolean isOpen() { return connection != null; }

    @Override
    public void close() {
        if (connection == null) return;
        try { connection.close(); }
        catch (SQLException e) { throw new IllegalStateException("Unable to close SQLite database", e); }
        finally { connection = null; }
    }
}
