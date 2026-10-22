package aether.server;

/** Stable gameplay boundary used by clients, AetherScript, and server implementations. */
public interface GameApi {
    void submit(GameCommand command);
    void save();
    boolean isRunning();
}
