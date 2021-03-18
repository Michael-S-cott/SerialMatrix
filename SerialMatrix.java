//Input the tone row and the matrix is printed to Matrix.txt

import java.util.Scanner;
import java.io.*;

public class SerialMatrix {

	public static void main(String[] args) throws IOException{
			
		int[] toneRow, prime1, prime2, prime3, prime4, prime5, prime6, prime7, prime8, prime9, prime10, prime11;	
		toneRow = new int[12];
		prime1 = new int[12];
		prime2 = new int[12];
		prime3 = new int[12];
		prime4 = new int[12];
		prime5 = new int[12];
		prime6 = new int[12];
		prime7 = new int[12];
		prime8 = new int[12];
		prime9 = new int[12];
		prime10 = new int[12];
		prime11 = new int[12];
		
		int[] inv0, inv1, inv2, inv3, inv4, inv5, inv6, inv7, inv8, inv9, inv10, inv11;
		inv0 = new int[12];
		inv1 = new int[12];
		inv2 = new int[12];
		inv3 = new int[12];
		inv4 = new int[12];
		inv5 = new int[12];
		inv6 = new int[12];
		inv7 = new int[12];
		inv8 = new int[12];
		inv9 = new int[12];
		inv10 = new int[12];
		inv11 = new int[12];
		
		inv0[0] = toneRow[0];
		
		System.out.println("Choose method of input. 1 for numbers or 2 for letters");
		Scanner keyboard = new Scanner(System.in);
		
		//int inputMethod = 1;
		//int inputMethod = 2
		
		int inputMethod = keyboard.nextInt();
		
		if (inputMethod == 2) {
			System.out.println("Please enter tone row using letters. Separate each note with one space.");
			
			for(int count = 0; count<12; count ++) {
				toneRow[count] = convert(keyboard.next());			
			}		
		}
		
		if(inputMethod == 1 ) {
			
			System.out.println("Please enter tone row using pitch class (Numbers). Separate each number with one space.");
			
			for(int count = 0; count<12; count ++) {
				toneRow[count] = keyboard.nextInt();
			}
		}
		inv0[0] = toneRow[0];		
			
		//calculate table
			
		for(int Count = 0; Count < 12; Count++) {
			prime1[Count] = toneRow[Count]+1;
			if (prime1[Count] >= 12)
				prime1[Count] = prime1[Count]-12;
		}
		
		for(int Count = 0; Count < 12; Count++) {
			prime2[Count] = prime1[Count]+1;
			if (prime2[Count] >= 12)
				prime2[Count] = prime2[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime3[Count] = prime2[Count]+1;
			if (prime3[Count] >= 12)
				prime3[Count] = prime3[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime4[Count] = prime3[Count]+1;
			if (prime4[Count] >= 12)
				prime4[Count] = prime4[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime5[Count] = prime4[Count]+1;
			if (prime5[Count] >= 12)
				prime5[Count] = prime5[Count]-12;
		}
		
		for(int Count = 0; Count < 12; Count++) {
			prime6[Count] = prime5[Count]+1;
			if (prime6[Count] >= 12)
				prime6[Count] = prime6[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime7[Count] = prime6[Count]+1;
			if (prime7[Count] >= 12)
				prime7[Count] = prime7[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime8[Count] = prime7[Count]+1;
			if (prime8[Count] >= 12)
				prime8[Count] = prime8[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime9[Count] = prime8[Count]+1;
			if (prime9[Count] >= 12)
				prime9[Count] = prime9[Count]-12;
		}
						
		for(int Count = 0; Count < 12; Count++) {
			prime10[Count] = prime9[Count]+1;
			if (prime10[Count] >= 12)
				prime10[Count] = prime10[Count]-12;
		}
			
		for(int Count = 0; Count < 12; Count++) {
			prime11[Count] = prime10[Count]+1;
			if (prime11[Count] >= 12)
				prime11[Count] = prime11[Count]-12;
		}
			
		for(int count=0;count<11;count+= 1) {
			int difference = toneRow[count]-toneRow[count+1];
			int temporary = inv0[count]+difference;
			while (temporary<0)
				temporary+=12;
			while (temporary>=12)
				temporary = temporary - 12;
			inv0[count+1] = temporary;
			//System.out.print(inv0[count+1]+" ");
		}
			
		for (int count=0;count<12;count++) {//calculates all inversion arrays
			inv1[count] = inv0[count]+1;
			if(inv1[count]>=12)
				inv1[count] -= 12;
			inv2[count] = inv1[count]+1;
			if(inv2[count]>=12)
				inv2[count] -= 12;
			inv3[count] = inv2[count]+1;
			if(inv3[count]>=12)
				inv3[count] -= 12;
			inv4[count] = inv3[count]+1;
			if(inv4[count]>=12)
				inv4[count] -= 12;
			inv5[count] = inv4[count]+1;
			if(inv5[count]>=12)
				inv5[count] -= 12;
			inv6[count] = inv5[count]+1;
			if(inv6[count]>=12)
				inv6[count] -= 12;
			inv7[count] = inv6[count]+1;
			if(inv7[count]>=12)
				inv7[count] -= 12;
			inv8[count] = inv7[count]+1;
			if(inv8[count]>=12)
				inv8[count] -= 12;
			inv9[count] = inv8[count]+1;
			if(inv9[count]>=12)
				inv9[count] -= 12;
			inv10[count] = inv9[count]+1;
			if(inv10[count]>=12)
				inv10[count] -= 12;
			inv11[count] = inv10[count]+1;
			if(inv11[count]>=12)
				inv11[count] -= 12;
	
		}
			
			//for (int count=0;count<12;count++) {
				//System.out.print(inv7[count]+" ");
			
		
		
		/*if(inputMethod == 2) {
			String[] toneRow;
			toneRow = new String[12];
		}
		
		*/
		
		int II0=0, II1=0, II2=0, II3=0, II4=0, II5=0, II6=0, II7=0, II8=0, II9=0, II10=0, II11=0 ;//Inversion index = list along the top of the matrix
		//int PI0=0, PI1, PI2, PI3, PI4, PI5, PI6, PI7, PI8, PI9, PI10, PI11;//prime index
		//int RI0, RI1, RI2, RI3, RI4, RI5, RI6, RI7, RI8, RI9, RI10 ,RI11;//retrograde index
		//int RII0, RII1, RII2, RII3, RII4, RII5, RII6, RII7, RII8, RII9, RII10, RII11;//retrograde inversion index
		
		II1 = toneRow[1]-toneRow[0];
		if (II1>12)
			II1 = II1 - 12;
		if (II1<0)
			II1 +=12;
		
		II2 = toneRow[2]-toneRow[0];
		if (II2>12)
			II2 -= 12;
		if (II2<0)
			II2 +=12;
		
		II3 = toneRow[3]-toneRow[0];
		if (II3>12)
			II3 -= 12;
		if (II3<0)
			II3 +=12;
		
		II4 = toneRow[4]-toneRow[0];
		if (II4>12)
			II4 -= 12;
		if (II4<0)
			II4 +=12;
		
		II5 = toneRow[5]-toneRow[0];
		if (II5>12)
			II5 -= 12;
		if (II5<0)
			II5 +=12;
		
		II6 = toneRow[6]-toneRow[0];
		if (II6>12)
			II6 -= 12;
		if (II6<0)
			II6 +=12;
		
		II7 = toneRow[7]-toneRow[0];
		if (II7>12)
			II7 -= 12;
		if (II7<0)
			II7 +=12;
		
		II8 = toneRow[8]-toneRow[0];
		if (II8>12)
			II8 -= 12;
		if (II8<0)
			II8 +=12;
		
		II9 = toneRow[9]-toneRow[0];
		if (II9>12)
			II9 -= 12;
		if (II9<0)
			II9 +=12;
		
		II10 = toneRow[10]-toneRow[0];
		if (II10>12)
			II10 -= 12;
		if (II10<0)
			II10 +=12;
		
		II11 = toneRow[11]-toneRow[0];
		if (II11>12)
			II11 -= 12;
		if (II11<0)
			II11 +=12;
		
		
		
		
		
		//assign values to all those^
		PrintWriter File2 = new PrintWriter("SonicPiInput.txt");
		for(int count2a = 0; count2a < 12; count2a ++) {
			int var1;
			var1 = toneRow[count2a] + 60;
			File2.print(var1 + " ");
			// if(toneRow[count2a] < 10)
			// 	File2.print(",");
		}
		File2.close();
		
		PrintWriter File = new PrintWriter("Matrix.txt");//printing to file
		//File.println("___I"+II0+"___I"+II1+"___I"+II2+"___I"+II3+"___I"+II4+"___I"+II5+"___I"+II6+"___I"+II7+"___I"+II8+"___I"+II9+"___I"+II10+"___I"+II11);

		File.println("____I"+II0+"___I"+II1+"___I"+II2+"___I"+II3+"___I"+II4+"___I"+II5+"___I"+II6+"___I"+II7+"___I"+II8+"___I"+II9+"___I"+II10+"___I"+II11+"___");
		File.print("P0 | ");
		for(int count2 = 0; count2 < 12; count2 ++) {
			File.print(toneRow[count2] + "   ");
			if(toneRow[count2] < 10)
				File.print(" ");			
		}
		File.println("|R0");
		
		for (int count=1; count<12;count++) {
			if (inv0[count] == prime1[0]) {
				File.print("P1 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime1[count3] + "   ");
					if(prime1[count3] < 10)
						File.print(" ");			
				}
				File.println("|R1");
			}
			
			if (inv0[count]== prime2[0]) {
				File.print("P2 | ");
				for(int count4 = 0; count4 < 12; count4++) {
					File.print(prime2[count4] + "   ");
					if(prime2[count4] < 10)
						File.print(" ");			
				}
				File.println("|R2");
			}
			
			if (inv0[count]== prime3[0]) {
				File.print("P3 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime3[count3] + "   ");
					if(prime3[count3] < 10)
						File.print(" ");			
				}
				File.println("|R3");
			}
			
			if (inv0[count]==prime4[0]) {
				File.print("P4 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime4[count3] + "   ");
					if(prime4[count3] < 10)
						File.print(" ");			
				}
				File.println("|R4");
			}
			
			if (inv0[count] == prime5[0]) {
				File.print("P5 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime5[count3] + "   ");
					if(prime5[count3] < 10)
						File.print(" ");			
				}
				File.println("|R5");
			}
			
			if (inv0[count] == prime6[0]) {
				File.print("P6 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime6[count3] + "   ");
					if(prime6[count3] < 10)
						File.print(" ");			
				}
				File.println("|R6");
			}
			
			if (inv0[count] == prime7[0]) {
				File.print("P7 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime7[count3] + "   ");
					if(prime7[count3] < 10)
						File.print(" ");			
				}
				File.println("|R7");
			}
			
			if (inv0[count] == prime8[0]) {
				File.print("P8 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime8[count3] + "   ");
					if(prime8[count3] < 10)
						File.print(" ");			
				}
				File.println("|R8");
			}
			
			if (inv0[count] ==  prime9[0]) {
				File.print("P9 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime9[count3] + "   ");
					if(prime9[count3] < 10)
						File.print(" ");			
				}
				File.println("|R9");
			}
			
			if (inv0[count] == prime10[0]) {
				File.print("P10| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime10[count3] + "   ");
					if(prime10[count3] < 10)
						File.print(" ");			
				}
				File.println("|R10");	
			}
			
			if (inv0[count] == prime11[0]) {
				File.print("P11| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(prime11[count3] + "   ");
					if(prime11[count3] < 10)
						File.print(" ");			
				}
				File.println("|R11");
			}
		}
		File.println("   _______________________________________________________________");
		File.println("   RI"+II0+"  RI"+II1+"  RI"+II2+"  RI"+II3+"  RI"+II4+"  RI"+II5+"  RI"+II6+"  RI"+II7+"  RI"+II8+"  RI"+II9+"  RI"+II10+"  RI"+II11);
	
		//____________________________________________________________________
		//____________________________________________________________________
		//____________________________________________________________________
		
		File.println(" ");
		File.println(" ");
		File.println(" ");
		
		//Prints sharp version
		File.println("____I"+II0+"___I"+II1+"___I"+II2+"___I"+II3+"___I"+II4+"___I"+II5+"___I"+II6+"___I"+II7+"___I"+II8+"___I"+II9+"___I"+II10+"___I"+II11+"___");
		File.print("P0 | ");
		for(int count2 = 0; count2 < 12; count2 ++) {
			File.print(convertSharp(toneRow[count2]) + "   ");			
		}
		File.println("|R0");
		
		for (int count=1; count<12;count++) {
			if (inv0[count] == prime1[0]) {
				File.print("P1 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime1[count3]) + "   ");			
				}
				File.println("|R1");
			}
			
			if (inv0[count]== prime2[0]) {
				File.print("P2 | ");
				for(int count4 = 0; count4 < 12; count4++) {
					File.print(convertSharp(prime2[count4]) + "   ");	
				}
				File.println("|R2");
			}
			
			if (inv0[count]== prime3[0]) {
				File.print("P3 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime3[count3]) + "   ");			
				}
				File.println("|R3");
			}
			
			if (inv0[count]==prime4[0]) {
				File.print("P4 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime4[count3]) + "   ");		
				}
				File.println("|R4");
			}
			
			if (inv0[count] == prime5[0]) {
				File.print("P5 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime5[count3]) + "   ");		
				}
				File.println("|R5");
			}
			
			if (inv0[count] == prime6[0]) {
				File.print("P6 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime6[count3]) + "   ");
				}
				File.println("|R6");
			}
			
			if (inv0[count] == prime7[0]) {
				File.print("P7 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime7[count3]) + "   ");		
				}
				File.println("|R7");
			}
			
			if (inv0[count] == prime8[0]) {
				File.print("P8 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime8[count3]) + "   ");		
				}
				File.println("|R8");
			}
			
			if (inv0[count] ==  prime9[0]) {
				File.print("P9 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime9[count3]) + "   ");			
				}
				File.println("|R9");
			}
			
			if (inv0[count] == prime10[0]) {
				File.print("P10| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime10[count3]) + "   ");		
				}
				File.println("|R10");	
			}
			
			if (inv0[count] == prime11[0]) {
				File.print("P11| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertSharp(prime11[count3]) + "   ");			
				}
				File.println("|R11");
			}
		}
		File.println("   _______________________________________________________________");
		File.println("   RI"+II0+"  RI"+II1+"  RI"+II2+"  RI"+II3+"  RI"+II4+"  RI"+II5+"  RI"+II6+"  RI"+II7+"  RI"+II8+"  RI"+II9+"  RI"+II10+"  RI"+II11);
		

		//____________________________________________________________________
		//____________________________________________________________________
		//____________________________________________________________________
		
		File.println(" ");
		File.println(" ");
		File.println(" ");

		File.println("____I"+II0+"___I"+II1+"___I"+II2+"___I"+II3+"___I"+II4+"___I"+II5+"___I"+II6+"___I"+II7+"___I"+II8+"___I"+II9+"___I"+II10+"___I"+II11+"___");
		File.print("P0 | ");
		for(int count2 = 0; count2 < 12; count2 ++) {
			File.print(convertFlat(toneRow[count2]) + "   ");			
		}
		File.println("|R0");
		
		for (int count=1; count<12;count++) {
			if (inv0[count] == prime1[0]) {
				File.print("P1 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime1[count3]) + "   ");			
				}
				File.println("|R1");
			}
			
			if (inv0[count]== prime2[0]) {
				File.print("P2 | ");
				for(int count4 = 0; count4 < 12; count4++) {
					File.print(convertFlat(prime2[count4]) + "   ");	
				}
				File.println("|R2");
			}
			
			if (inv0[count]== prime3[0]) {
				File.print("P3 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime3[count3]) + "   ");			
				}
				File.println("|R3");
			}
			
			if (inv0[count]==prime4[0]) {
				File.print("P4 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime4[count3]) + "   ");		
				}
				File.println("|R4");
			}
			
			if (inv0[count] == prime5[0]) {
				File.print("P5 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime5[count3]) + "   ");		
				}
				File.println("|R5");
			}
			
			if (inv0[count] == prime6[0]) {
				File.print("P6 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime6[count3]) + "   ");
				}
				File.println("|R6");
			}
			
			if (inv0[count] == prime7[0]) {
				File.print("P7 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime7[count3]) + "   ");		
				}
				File.println("|R7");
			}
			
			if (inv0[count] == prime8[0]) {
				File.print("P8 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime8[count3]) + "   ");		
				}
				File.println("|R8");
			}
			
			if (inv0[count] ==  prime9[0]) {
				File.print("P9 | ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime9[count3]) + "   ");			
				}
				File.println("|R9");
			}
			
			if (inv0[count] == prime10[0]) {
				File.print("P10| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime10[count3]) + "   ");		
				}
				File.println("|R10");	
			}
			
			if (inv0[count] == prime11[0]) {
				File.print("P11| ");
				for(int count3 = 0; count3 < 12; count3++) {
					File.print(convertFlat(prime11[count3]) + "   ");			
				}
				File.println("|R11");
			}
		}
		File.println("   _______________________________________________________________");
		File.println("   RI"+II0+"  RI"+II1+"  RI"+II2+"  RI"+II3+"  RI"+II4+"  RI"+II5+"  RI"+II6+"  RI"+II7+"  RI"+II8+"  RI"+II9+"  RI"+II10+"  RI"+II11);
		
		
		
		File.close();
		keyboard.close();

	}
public static int convert(String a) {
		
		if ((a.equals("C")||a.equals("B#")||a.equals("c")||a.equals("b#"))) 
			return 0;
			
		else if ((a.equals("C#")||a.equals("Db")||a.equals("c#")||a.equals("db")))
			return 1;
		
		else if ((a.equals("D")||a.equals("d"))) 
			return 2;
		
		else if ((a.equals("D#")||a.equals("Eb")||a.equals("eb")||a.equals("d#"))) 
			return 3;
		
		else if ((a.equals("E")||a.equals("Fb")||a.equals("e")||a.equals("fb"))) 
			return 4;
		
		else if ((a.equals("F")||a.equals("E#")||a.equals("f")||a.equals("e#"))) 
			return 5;
		
		else if ((a.equals("F#")||a.equals("Gb")||a.equals("f#")||a.equals("gb"))) 
			return 6;
		
		else if ((a.equals("G")||a.equals("g"))) 
			return 7;
		
		else if ((a.equals("G#")||a.equals("Ab")||a.equals("g#")||a.equals("ab"))) 
			return 8;
		
		else if ((a.equals("A")||a.equals("a"))) 
			return 9;
		
		else if ((a.equals("A#")||a.equals("Bb")||a.equals("a#")||a.equals("bb"))) 
			return 10;
		
		else if ((a.equals("B")||a.equals("Cb")||a.equals("b")||a.equals("cb"))) 
			return 11;
		
		else
			return 0;	
		
	}

public static String convertSharp(int a) {
	String[] HurrayArray = {"C ", "C#", "D ", "D#", "E ", "F ", "F#", "G ", "G#", "A ", "A#", "B ", "C "};
	return HurrayArray[a];
	}

public static String convertFlat(int a) {
	String[] HurrayArray = {"C ", "Db", "D ", "Eb", "E ", "F ", "Gb", "G ", "Ab", "A ", "Bb", "B ", "C "};
	return HurrayArray[a];
	}
}
//1 0 2 3 7 9 8 6 11 10 4 5
