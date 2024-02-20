import java.util.*;
public class UVA10222 {
    public static void main(String arges[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                switch(s.charAt(i)){
                    case '`':
                        System.out.print("`");
                    break;
                    case ' ':
                        System.out.print(" ");
                    break;
                    case '\'':
                        System.out.print("l");
                    break;
                    case 'q':
                        System.out.print("q");
                    break;
                    case 'w':
                        System.out.print("q");
                    break;
                    case 'e':
                        System.out.print("q");
                    break;
                    case 'r':
                        System.out.print("w");
                    break;
                    case 't':
                        System.out.print("e");
                    break;
                    case 'y':
                        System.out.print("r");
                    break;
                    case 'u':
                        System.out.print("t");
                    break;
                    case 'i':
                        System.out.print("y");
                    break;
                    case 'o':
                        System.out.print("u");
                    break;
                    case 'p':
                        System.out.print("i");
                    break;
                    case '[':
                        System.out.print("o");
                    break;
                    case ']':
                        System.out.print("p");
                    break;

                    case 'a':
                        System.out.print("a");
                    break;
                    case 's':
                        System.out.print("a");
                    break;
                    case 'd':
                        System.out.print("a");
                    break;
                    case 'f':
                        System.out.print("s");
                    break;
                    case 'g':
                        System.out.print("d");
                    break;
                    case 'h':
                        System.out.print("f");
                    break;
                    case 'j':
                        System.out.print("g");
                    break;
                    case 'k':
                        System.out.print("h");
                    break;
                    case 'l':
                        System.out.print("j");
                    break;
                    case ';':
                        System.out.print("k");
                    break;
                    case '"':
                        System.out.print("l");
                    break;
                    case 'z':
                        System.out.print("z");
                    break;
                    case 'x':
                        System.out.print("z");
                    break;
                    case 'c':
                        System.out.print("z");
                    break;
                    case 'v':
                        System.out.print("x");
                    break;
                    case 'b':
                        System.out.print("c");
                    break;
                    case 'n':
                        System.out.print("v");
                    break;
                    case 'm':
                        System.out.print("b");
                    break;
                    case ',':
                        System.out.print("n");
                    break;
                    case '.':
                        System.out.print("m");
                    break;
                    case '1':
                        System.out.print("`");
                    break;
                    case '2':
                        System.out.print("`");
                    break;
                    case '3':
                        System.out.print("1");
                    break;
                    case '4':
                        System.out.print("2");
                    break;
                    case '5':
                        System.out.print("3");
                    break;
                    case '6':
                        System.out.print("4");
                    break;
                    case '7':
                        System.out.print("5");
                    break;
                    case '8':
                        System.out.print("6");
                    break;
                    case '9':
                        System.out.print("7");
                    break;
                    case '0':
                        System.out.print("8");
                    break;
                    case '-':
                        System.out.print("9");
                    break;
                    case '=':
                        System.out.print("0");
                    break;
                    case '/':
                        System.out.print(",");
                    break;
                }
            }
            System.out.println();
            }
        }
}