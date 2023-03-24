import java.util.Scanner;

/**
Dragons & Iek Delta
 */
public class Game
{
    public static void main(){
        int answer;
        System.out.println("Γιατι ηρθες στο ΙΕΚ ΔΕΛΤΑ της Πατρας. Εισαι στην κεντρικη εισοδο και βλεπεις μια κυρια να σου χαμογελαει.Τι Κανεις; ");
        System.out.println("1- Φευγω");
        System.out.println("2- Παω και της μιλαω");
        System.out.println("3- Την προσπερναω και παω στον 1ο οροφο");
        Scanner myObj= new Scanner(System.in);
        answer=myObj.nextInt();
        
        if(answer==1){
            System.out.println("Ζεις μια νορμαλ ζωη σαν φλωρος");
        }
        else if(answer==2){
            System.out.println("Σου μιλαει για το αν ενδιαφερεσε να γινεις σπουδαστης του ιεκ.Τι κανεις;");
            System.out.println("1- Φευγω");
            System.out.println("2- Ενδιαφερομαι");
            System.out.println("3- Αρχιζω και χορευω");
            answer=myObj.nextInt();
            while(answer<1||answer>3){
            System.out.println("Εισαι Γιαννος");
            answer=myObj.nextInt();
            }
            if(answer==1){
                System.out.println("Σε σβερκωνει");
            }
            else if(answer==2){
                System.out.println("Σου μιλαει για ωρες μεχρι που πεθαινεις");
            }
            else if(answer==3){
                System.out.println(" Σπαει το ματριξ ξυπνας κουμπομενος γυρω απο υπολογιστες.Τι κανεις;");
                System.out.println("1- Σπας τους υπολογιστες και ξεκινας μια επανασταση");
                System.out.println("2- Τρεχω να ξεφυγω");
                System.out.println("3- Αρχιζω και χορευω");
                answer=myObj.nextInt();
                while(answer<1||answer>3){
                System.out.println("Εισαι Γιαννος");
                answer=myObj.nextInt();
                }
                if(answer==1){
                    System.out.println("Περνεις πισω την ελευθερια σου μαζι με τα αδερφια σου");
                }
                else if(answer==2){
                    System.out.println("Σε πιανουν και Σε σκοτωνουν");
                }
                else if(answer==3){
                    System.out.println("Σταματα να προσπαθεις να χορευεις");
                }
            }
        }
        else if(answer==3){
            System.out.println("Βλεπεις την Κυρια Γκλωρια.Τι Κανεις");
            System.out.println("1- Φευγω");
            System.out.println("2- Αρχιζεις το μαθημα");
            System.out.println("3- Αρχιζω και χορευω");
            answer=myObj.nextInt();
            while(answer<1||answer>3){
            System.out.println("Εισαι Γιαννος");
            answer=myObj.nextInt();
            }
            if(answer==1){
                System.out.println("Γκλωρια");
            }
            else if(answer==2){
                System.out.println("Κανεις κατι με την ζωη σου, γινεσαι πλουσιος");
            }
            else if(answer==3){
                System.out.println("Αρχιζει και χωρευει και αυτη");
            }
        }
        else{
            System.out.println("Εισαι Γιαννος");
        }
    }
}

    
