package _03_Printing_Binary;

public class _01_BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method! Use the main method to test
	 * your methods.
	 */

	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place

		// Shift b seven bits to the right

		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1

		// Print the result using System.out.print (NOT System.out.println)

		// Use this method to print the remaining 7 bits of b
		// 01010101
		String bin = "";
		do {
			b >>>= 1;
			if (b % 2 == 0) {
				bin += "0";
			} else {
				bin += "1";
			}
		} while (b != 0);
		System.out.println(bin);
		System.out.println();

	}

	public static void printShortBinary(short s) {
		// Create 2 byte variables
		// byte a = 0b00000000;
		// byte b = 0b00000000;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		byte a = (byte) (s >> 8);
		byte b = (byte) ((s << 8) >> 8);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b);
		printByteBinary(a);
	}

	public void printIntBinary(int i) {
		// Create 2 short variables

		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short

		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order

	}

	public void printLongBinary(long l) {
		// Use the same method as before to complete this method

	}

	public static void main(String[] args) {
		// Test your methods here
		// printByteBinary((byte) 01010101);
		printShortBinary((short) 0b0011001010101010);

	}
}
