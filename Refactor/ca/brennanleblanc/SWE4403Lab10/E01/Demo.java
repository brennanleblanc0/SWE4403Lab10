package ca.brennanleblanc.SWE4403Lab10.E01;

public class Demo {
    public static void main(String[] args) {
        ChatClient context = new ChatClient();

        context.setEncryptionAlgorithm(new AES());
        context.send("This is a test");

        context.setEncryptionAlgorithm(new DES());
        context.send("This is also a test");
    }
}
