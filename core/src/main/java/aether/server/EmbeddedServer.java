package aether.server;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/** Runs the authoritative game server inside the game process. */
public final class EmbeddedServer implements GameApi, AutoCloseable {
    private final ServerConfig config;
    private final AtomicBoolean running = new AtomicBoolean(false);

    public EmbeddedServer(ServerConfig config) {
        this.config = Objects.requireNonNull(config, "config");
    }

    public ServerConfig getConfig() { return config; }

    public void start() {
        if (!running.compareAndSet(false, true)) return;
        // Network transport, simulation, and persistence are initialized by their modules.
    }

    public void stop() {
        if (!running.compareAndSet(true, false)) return;
        // Flush persistence and close network transports here.
    }

    @Override
    public void submit(GameCommand command) {
        Objects.requireNonNull(command, "command");
        if (!running.get()) throw new IllegalStateException("Server is not running");
        // Commands must be validated and applied by the authoritative simulation.
    }

    @Override
    public void save() {
        if (!running.get()) return;
        // Persistence service will write the authoritative state.
    }

    @Override
    public boolean isRunning() { return running.get(); }

    @Override
    public void close() { stop(); }
}
