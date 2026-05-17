import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		System.out.println("test plant:\n" + test + "\n\n");

		FileInputStream fileStream = null;
		Scanner fileScanner = null;

		ArrayList<Plant> plantList = new ArrayList<>();

		try {
			fileStream = new FileInputStream("Forage.csv");
			fileScanner = new Scanner(fileStream);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();

				System.out.println("Reading: " + line);
				try {
					Plant plant = new Plant(line);
					plantList.add(plant);
				} catch (IllegalArgumentException e) {
					System.out.println("Skipping invalid line: " + line);
				}
			}
			fileScanner.close();
			fileStream.close();

		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
		}
		catch (IOException e) {
			System.out.println("Error reading file.");
		}
		System.out.println("\n--- Plant Archive ---");
		for (Plant p : plantList) {
			System.out.println(p);
			System.out.println();
		}
	}
}
