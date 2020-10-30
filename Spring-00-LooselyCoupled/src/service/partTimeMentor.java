package service;

import implementation.Mentor;

public class partTimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("Part time Mentor Account is created");
    }

}
