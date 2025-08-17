package Java_21;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/*
Key Encapsulation Mechanism API
What it does: Adds a modern cryptographic API for secure key exchange (post-quantum friendly).
Why it matters: If you’re building secure communication, you now have built-in KEM support.
 */

public class KeyEncapsulationMechanismAPI {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("X25519");
		kpg.initialize(255);
		KeyPair kp = kpg.generateKeyPair();
		System.out.println("Public key: " + kp.getPublic());
	}
}
