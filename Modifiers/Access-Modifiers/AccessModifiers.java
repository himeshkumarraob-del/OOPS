
public class AccessModifiers {
    public String publicVar = "I am Public";
    private String privateVar = "I am Private";
    protected String protectedVar = "I am Protected";
    String defaultVar = "I am Default";

    public void showPublic() {
        System.out.println(publicVar);
    }

    private void showPrivate() {
        System.out.println(privateVar);
    }

    protected void showProtected() {
        System.out.println(protectedVar);
    }

    void showDefault() {
        System.out.println(defaultVar);
    }

    public void accessPrivateInsideClass() {
        showPrivate(); // Allowed here
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        obj.showPublic();

        obj.accessPrivateInsideClass();

        obj.showProtected();

        obj.showDefault();
    }
}
