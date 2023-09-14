import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String[] userAnswers = new String[5];
    public QuestionService(){
        questions[0] = new Questions(1, "size of int in bytes", "4", "2", "4", "6", "8");
        questions[1] = new Questions(2, "size of long in bytes", "8", "2", "4", "6", "8");
        questions[2] = new Questions(3, "size of double in bytes", "8", "2", "4", "6", "8");
        questions[3] = new Questions(4, "size of float in bytes", "4", "2", "4", "6", "8");
        questions[4] = new Questions(5, "size of char in bytes", "2", "2", "4", "6", "8");
    }

    public void playQuiz(){
        int i = 0;
        for(Questions q: questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1: "+q.getOption1());
            System.out.println("Option 2: "+q.getOption2());
            System.out.println("Option 3: "+q.getOption3());
            System.out.println("Option 4: "+q.getOption4());
            Scanner scn = new Scanner(System.in);
            userAnswers[i] = scn.nextLine();
            i++;
        }
        i=0;
        for(String userAnswer : userAnswers){
            System.out.println("User given answer for question number "+ i +" : "+userAnswer);
            i++;
        }
    }

    public void printScore() {
        int score = 0;
        for(int i=0; i<questions.length; i++){
            if(userAnswers[i].equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("Your Score is " + score);
    }
}
