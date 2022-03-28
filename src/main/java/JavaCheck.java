public class JavaCheck {

    private static final String[] KEYS = { "os.arch", "java.version", "java.vendor" };

    public static void main(String... args) {
        byte status = 0;

        for (final String key : KEYS) {
            String property = System.getProperty(key);
            if (property == null) status = 1;
            else {
                property = property.replaceAll("aarch", "x86_"); // lol
                System.out.println(key + "=" + property);
            }
        }

        System.exit(status);
    }
}
