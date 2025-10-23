import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is One?", "One", "Two", "Three", "Four", "One");
        questions[1] = new Question(2, "What is Two?", "One", "Two", "Three", "Four", "Two");
        questions[2] = new Question(3, "What is Three?", "One", "Two", "Three", "Four", "Three");
        questions[3] = new Question(4, "What is Four?", "One", "Two", "Three", "Four", "Four");
        questions[4] = new Question(5, "What is 1?", "One", "Two", "Three", "Four", "One");
    }

    public void playQuiz() {
        int i = 0;
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("Question no.  : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            selection[i] = sc.nextLine();
            i++;
        }

        // ✅ This must be inside playQuiz()
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
