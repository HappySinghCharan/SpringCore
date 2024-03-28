package org.lifecycle;
import javax.annotation.*;
public class UsingAnnotations {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UsingAnnotations() {
        super();
    }

    @Override
    public String toString() {
        return "UsingAnnotations{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start()
    {
        System.out.println("Starting Method");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("Ending Method");
    }
}
