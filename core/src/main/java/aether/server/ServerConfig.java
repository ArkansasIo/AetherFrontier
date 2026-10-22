package aether.server;

/** Configuration shared by embedded and dedicated server modes. */
public final class ServerConfig {
    private ServerMode mode = ServerMode.OFFLINE;
    private int port = 25565;
    private int maxPlayers = 4;
    private boolean authoritative = true;
    private boolean persistenceEnabled = true;
    private String database = "sqlite";

    public ServerMode getMode() { return mode; }
    public void setMode(ServerMode mode) { this.mode = mode; }
    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }
    public int getMaxPlayers() { return maxPlayers; }
    public void setMaxPlayers(int maxPlayers) { this.maxPlayers = maxPlayers; }
    public boolean isAuthoritative() { return authoritative; }
    public void setAuthoritative(boolean authoritative) { this.authoritative = authoritative; }
    public boolean isPersistenceEnabled() { return persistenceEnabled; }
    public void setPersistenceEnabled(boolean persistenceEnabled) { this.persistenceEnabled = persistenceEnabled; }
    public String getDatabase() { return database; }
    public void setDatabase(String database) { this.database = database; }
}
