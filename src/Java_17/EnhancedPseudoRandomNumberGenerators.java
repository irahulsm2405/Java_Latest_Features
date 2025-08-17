package Java_17;

import java.util.random.RandomGenerator;

/*
Enhanced Pseudo-Random Number Generators (Non-preview)
Purpose: Introduces new interfaces and implementations for better and flexible random number generators (PRNGs).
Use case: When you need more than the old java.util.Random — better algorithms, streams of random numbers, or thread-local generators.
Benefit: More choices of PRNGs, better performance, and support for streams of random numbers.
 */

public class EnhancedPseudoRandomNumberGenerators {
	public static void main(String[] args) {
		RandomGenerator random = RandomGenerator.of("L64X128MixRandom");
		int randomInt = random.nextInt();
		System.out.println(randomInt);
	}
}
