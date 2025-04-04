import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Proxy Pattern
public class AgentAuth {
    private static final Set<String> registeredAgents = new HashSet<>(Arrays.asList(
            "Kristina", "Aziz", "Baubek"
    ));

    public static boolean isLoggedIn(String agentName) {
        return registeredAgents.contains(agentName);
    }

    public static void registerAgent(String agentName) {
        registeredAgents.add(agentName);
    }

}

