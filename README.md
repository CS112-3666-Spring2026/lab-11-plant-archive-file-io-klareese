[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23934127)
# Lab 11: File IO (Plant Archive)
![Urban Foraging](https://civileats.com/wp-content/uploads/2018/02/180222-urban-foraging-top3.jpg)

As a beginner urban forager, I want to keep a list of native plants that are edible and/or medicinal that are found in Southern California. I was given a text file with a list of plant names, along with, their average temperatures for planting, and their most common uses. This data is saved in a comma-seperated format.

Create a program that reads the text file, saves each line as a Plant object, and displays the objects to the console with labels. Example output:

![Example Output](https://i.ibb.co/hVr9R0p/Example-Output.png)

## Lab Summary
Each object is on its own line in the CSV text file. Read in the comma-separated values (CSV) text file using `Scanner` and `FileInputStream`. As each object gets read, use `String`'s `split()` method to separate each comma-separated value. Then load variables into a `Plant` object, which you'll add to an `ArrayList`. Display the foraging plants to the console to prove the file is being read and loaded correctly.

**Given:**
- `Forage.csv` with multiple lines (records) of plants, each line's values are seperated by commas (CSV file format).
- `Plant.java` completed model class, ready to be upgraded/used for File IO

## Steps
1. Familiarize yourself with the `Plant` class code that contains all required methods.
- Create a constructor that takes in a single parameter of type `String` that is in the CSV format (see any line from `Forage.csv` for examples). `split` the line and store each value into its corresponding instance variable
- Make sure to error check the whole string and the parts of the string (after the split)

2. Prepare the file input code in `Main`
- Follow the 5 steps needed to setup your method for file input:
  1. Import the necessary classes for text file input
  2. Declare variables you'll need to do the file input
  3. Initialize those variables, make sure to use `"Forage.csv"` for your text file name
  4. Create a loop that runs as long as there are lines of text in the file
  5. Close the input stream after the loop ends

3. Build the `Plant` objects and store into an `ArrayList`
- Create an `ArrayList` to store the `Plant` objects you'll build from the CSV file
- for each run of the loop that reads a line of CSV text, build the `Plant` object and add it to your `ArrayList` object
  - *TIP: before doing this part, just print the line of text read from the file to the console. If it matches `Forage.csv` that's proof that your loop is working! Then you can build the objects and add them to the `ArrayList`*
- To prove it runs, print out the `ArrayList` contents after you've closed the input stream.




---
This project was created by Jackie Walsh, GOALS in CS 112 intern Spring 2021.