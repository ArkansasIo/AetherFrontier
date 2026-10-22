package aether.server;

/** Minimal command envelope. Concrete gameplay commands can be added without changing the API boundary. */
public record GameCommand(String type, long playerId, String payload) {
    public GameCommand {
        if (type == null || type.isBlank()) throw new IllegalArgumentException("type is required");
        if (payload == null) payload = "";
    }
}
