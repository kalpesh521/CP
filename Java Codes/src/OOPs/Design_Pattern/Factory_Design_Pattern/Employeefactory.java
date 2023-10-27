package OOPs.Design_Pattern.Factory_Design_Pattern;
public class Employeefactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
