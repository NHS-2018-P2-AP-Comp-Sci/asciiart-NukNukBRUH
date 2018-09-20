/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


public class ASCIIArt {
	public static void main(String[] args) {
		sun();
		sun();
		sun();
		System.out.println("ON VERY BRIGHT SUNNY DAYS...\n");
		letterP();
		letterO();
		letterP();
		letterS();
		letterI();
		letterC();
		letterL();
		letterE();
		letterS();
		System.out.println("...ARE A GREAT CHOICE!\n");
		top();
		bottom();
		popsicle();
		popsicle();
		System.out.print("YUM!");
	}
	public static void top() {
		System.out.println(" -----     ---");
		System.out.println("/     \\    | |");
		System.out.println("|     |    | |");
		System.out.print("|     |    | |\n");
		System.out.println("|     |    | |");
		System.out.println("|     |   -----");
		
	}
	public static void bottom() {
		System.out.println("|     |  |     |");
		System.out.println(" -----   |     |");
		System.out.println("  | |    |     |");
		System.out.println("  | |    |     |");
		System.out.println("  | |    |     |");
		System.out.println("  | |    \\     /");
		System.out.println("  ---     -----\n");
	}
	
	public static void sun() {
		System.out.println("     \\   /");
		System.out.println("   --------");
		System.out.println("\\ /        \\ /");
		System.out.println("  | SUN :) |");
		System.out.println("/ \\        / \\");
		System.out.println("   --------");
		System.out.println("     /   \\");
		System.out.println();
	}
	
	public static void popsicle() {
		top();
		bottom();
	}
	
	public static void letterP() {
		System.out.println("PPPPP");
		System.out.println("P    P");
		System.out.println("PPPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println();
	}
	
	public static void letterO() {
		System.out.println(" OOOO");
		System.out.println("O    O");
		System.out.println("O    O");
		System.out.println("O    O");
		System.out.println(" OOOO");
		System.out.println();
	}
	
	public static void letterS() {
		System.out.println("SSSSSS");
		System.out.println("S");
		System.out.println("SSSSSS");
		System.out.println("     S");
		System.out.println("SSSSSS");
		System.out.println();
	}
	
	public static void letterI() {
		System.out.println("IIIII");
		System.out.println("  I  ");
		System.out.println("  I  ");
		System.out.println("  I  ");
		System.out.println("IIIII");
		System.out.println();
	}
	
	public static void letterL() {
		System.out.println("L");
		System.out.println("L");
		System.out.println("L");
		System.out.println("L");
		System.out.println("LLLLLL");
		System.out.println();
	}
	
	public static void letterE() {
		System.out.println("EEEEEE");
		System.out.println("E");
		System.out.println("EEEE");
		System.out.println("E");
		System.out.println("EEEEEE");
		System.out.println();
	}
	public static void letterC() {
		System.out.println("CCCCCC");
		System.out.println("C    ");
		System.out.println("C    ");
		System.out.println("C    ");
		System.out.println("CCCCCC");
		System.out.println();
	}
}
