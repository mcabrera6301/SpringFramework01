import implementation.Mentor;
import service.MentorAccount;
import service.fullTimeMentor;
import service.partTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {
        partTimeMentor partTime = new partTimeMentor();
        MentorAccount mentor = new MentorAccount((partTime));


        fullTimeMentor fullTime = new fullTimeMentor();
        MentorAccount Mentor = new MentorAccount(fullTime);
        mentor.manageAccount();
         {


    }
    }
}