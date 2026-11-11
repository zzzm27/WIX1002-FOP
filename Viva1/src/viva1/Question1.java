/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author zhenming
 */
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //input
        System.out.print("Enter original file name: ");
        String OriFile = input.nextLine();

        char[] detector = new char[OriFile.length()];   //create array char
        for (int i = 0; i < OriFile.length(); i++) {
            detector[i] = OriFile.charAt(i);
        }

        System.out.print("Encoded Message: ");
        int positionLow, positionUp, shift, charcode, count = 1, num = 0, Encoded_count = 0;
        Whole:
        for (int j = 0; j < detector.length; j++) {
            if (Character.isLowerCase(detector[j])) {         //lower case test
                positionLow = detector[j] - 'a';             //formula position = char(b=98) - 'a'(97) [zero base]
                shift = (j % 5) + 1;
                charcode = (char) ((positionLow + shift) + 'a');    //+ 'a' because char code start from a
                while (true) {
                    if (charcode > 'z') {
                        charcode -= 26;
                    }
                    break;
                }
                detector[j] = (char) charcode;
                System.out.print(detector[j]);
                Encoded_count++;

            } else if (Character.isUpperCase(detector[j])) {        //upper case test
                positionUp = detector[j] - 'A' + 1;
                if (positionUp <= 12) {
                    shift = 24 - (2 * (positionUp - 1));
                    detector[j] = (char) (positionUp + shift + 'a');
                    Character.toLowerCase(detector[j]);
                    System.out.print("<" + detector[j] + ">");
                    Encoded_count+=3;
                } else {
                    shift = (2 * (positionUp - 1)) - 24;
                    detector[j] = (char) (positionUp - shift + 'a');
                    Character.toLowerCase(detector[j]);
                    System.out.print("<" + detector[j] + ">");
                    Encoded_count += 3;
                }

            } else if (detector[j] == ' ') {                     //test underscore
                space:
                while (true) {
                    if (j < detector.length - 1 && detector[j] == detector[j + 1]) {
                        j++;
                    } else {
                        break;
                    }
                }
                System.out.print("_");
                Encoded_count++;

            } else if (!((detector[j] < 59) && (detector[j] >= 48))) {    //test symbol
                switch (detector[j]) {
                    case '=':
                        detector[j] = '/';
                        break;
                    case '/':
                        detector[j] = '*';
                        break;
                    case '*':
                        detector[j] = '-';
                        break;
                    case '-':
                        detector[j] = '+';
                        break;
                    case '+':
                        detector[j] = '=';
                        break;
                }
                System.out.print(detector[j]);
                Encoded_count++;

            } else if (detector[j] < 59 && detector[j] >= 48) {          //test num
                num = 9 - detector[j] + 48;
                if (j != detector.length - 1) {
                    if (detector[j] == detector[j + 1]) {
                        Count:
                        while (j < detector.length - 1) {
                            if (detector[j] == detector[j + 1]) {
                                count++;
                                j++;
                            } else {
                                break;
                            }
                        }
                        System.out.print(num + "x" + count);
                        count = 1;
                        Encoded_count += 3;
                        continue;
                    } else {
                        System.out.print(num);
                        Encoded_count++;
                        continue;
                    }

                } else {
                    System.out.print(num);
                    Encoded_count++;
                    continue;
                }
            }
            else{
                Encoded_count++;
            }
        }
        System.out.println();
        System.out.println("Original Length: " + detector.length + " | Encoded Length: " + Encoded_count);
    }
}
