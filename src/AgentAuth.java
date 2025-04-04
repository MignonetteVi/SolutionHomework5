//Proxy Pattern
public class AgentAuth {
    public static boolean isLoggedIn(String agentName) {
        return agentName != null && !agentName.trim().isEmpty();
    }
}
