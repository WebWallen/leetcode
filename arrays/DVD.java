// DVD is the individual element inside the dvdCollection array which is set to hold 15 items
DVD[] dvdCollection = new DVD[15];

// The class definition determines what elements should be added to each DVD 
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    // Every DVD receives the "this dot" syntax common in OOP -- also, property types must be specified in the definition
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        System.out.println(
            this.name + ", directed by " + this.director + ", released in " + this.releaseYear
        );
    }
}

// Creating a DVD object
DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
// Placing it inside our array
dvdCollection[7] = avengersDVD;
//  Overwriting a DVD object (if you place an element in the same index, other is automatically removed)
DVD batmanDVD = new DVD("Dark Knight Returns", 2011, "Christopher Nolan");
dvdCollection[7] = batmanDVD;
// Printing an array element
System.out.println(dvdCollection[7]);

// The capacity (number of slots), defined by length, of an array can't be changed after being created
System.out.println("The array has " + dvdCollection.length + " slots");
// To find the number of elements inside those slots, we'd use a counter while adding elements with a for loop
int[] array = new int[6];
int length = 0;
for (int i = 0; i < 3; i++) {
    array[i] = i * i;
    length++;
}
System.out.println("There are " + length + " elements inside the array");