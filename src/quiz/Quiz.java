package quiz;

import java.util.Scanner;

import static java.lang.System.*;

public class Quiz {
    public static String[] q = new String[10];
    public static String[] a = new String[10];
    public static void main(String... args) {
        q[0] = "1.Wer ist der Mann? Kennst du ____?\na.er\nb.ihm\nc.ein\nd.ihn";
        q[1] = "2.Ich trinke Saft. Und was __________ ?\na.du\nb.trinkst du\nc.hast du\nd.wirst du";
        q[2] = "3.Möchtest du heute Abend ____ Film sehen?\na.das\nb.eine\nc.einen\nd.dem";
        q[3] = "4.Ich gehe ____ Hause.\na.von\nb.nach\nc.zu\nd.in";
        q[4] = "5.Hans fährt ______ .\na.schnell\nb.fleißig\nc.grün\nd.groß";
        q[5] = "6.Ich mache ______ Hausaufgaben im Café.\na.meinem\nb.mein\nc.meine\nd.meinen";
        q[6] =  "7.Wie finden Sie meinen neuen Pullover?\na.Oh, der ist aber schön.\nb.Oh, den ist aber schön.\n" +
                "c.Oh, dem ist aber schön.\nd.Oh, des ist aber schön.";
        q[7] = "8.Kannst du _____ bitte das Buch geben?\na.mich\nb.mir\nc.ich\nd.mein";
        q[8] =  "9.Der Unterricht beginnt __ Montag um 10 Uhr.\na.am\nb.um\nc.im\nd.an";
        q[9] = "10.Woher kommen Sie?\na.Ich wohne in Berlin.\n" +
                "b.Ich komme bald nach Berlin.\nc.Regina kommt auch aus München.\nd.Aus Deutschland, aus Berlin.";
        String[] a = {"d", "b", "c", "b", "a", "c", "a", "b", "a", "d"};
        String welcome = "Hello! Welcome to our German quiz. If you want to beginn, press S, exit - press E.";
        out.println(welcome);
        Scanner read = new Scanner(in);
        String start = read.nextLine();
        switch (start){
            case "e":
                out.println("See you next time.");
                break;
            case "s":
                int i = 0;
                int y = 0;
                int scoore = 0;
                while (i < q.length && y < a.length) {
                    out.println(q[i]);
                    String answer = read.nextLine();
                    if (answer.equals(a[y])) {
                        System.out.println("Right");
                        scoore++;
                    } else {
                        System.out.println("False");
                    }i++;
                    y++;
                }System.out.println("You answered " + scoore + "/10 quetions.");
                break;
            default:
                out.println("Wrong choise");
                break;
        }
    }
}










