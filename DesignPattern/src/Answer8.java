interface DbFunctionality {
    
    void access();
}

class User {
    
    private String role;
    
    public User(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}

class Application implements DbFunctionality{
    
    User user;
    
    public Application(User user) {
        this.user = user;
    }
    
    @Override
    public void access() {
        System.out.println("access to the student records");
    }
}

class ApplicationProxy extends Application {
    
    
    public ApplicationProxy(User user) {
        super(user);
    }
    
    @Override
    public void access() {
        if (user.getRole() == "admin") {
            System.out.println("you can access the students records..");
            super.access();
        }
        else
            System.out.println("ACCESS DENIED !!");
    }
}


public class Answer8 {
    public static void main(String[] args) {
        User gagan = new User("admin");
        DbFunctionality app = new ApplicationProxy(gagan);
        app.access();
    }
}
