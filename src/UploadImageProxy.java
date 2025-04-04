//Proxy Pattern
public class UploadImageProxy {
    private String agentName;

    public UploadImageProxy(String agentName) {
        this.agentName = agentName;
    }

    public void upload(String imageName) {
        if (AgentAuth.isLoggedIn(agentName)) {
            System.out.println("Загрузка! Агент '" + agentName + "' загрузил: " + imageName);
        } else {
            System.out.println("Ошибка! Неавторизованный пользователь не может загружать изображения.");
        }
    }
}
