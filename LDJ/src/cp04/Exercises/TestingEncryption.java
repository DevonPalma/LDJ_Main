package cp04.Exercises;

public class TestingEncryption {
	public static void main(String[] args) {
		int data = 2312;
		int encryptedData = Encryption.encrypt(data);
		System.out.println(encryptedData);
		System.out.print(Encryption.decrypt(encryptedData));
	}
}
