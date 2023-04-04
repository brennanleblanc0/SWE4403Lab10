package ca.brennanleblanc.SWE4403Lab10.E01;

public class ChatClient {
    private Algorithm encryptionAlgorithm;

    public void setEncryptionAlgorithm(Algorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        System.out.println(encryptionAlgorithm.execute());
        System.out.println("Sending the encrypted message...");
    }
}