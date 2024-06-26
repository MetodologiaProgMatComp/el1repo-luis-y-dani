package Cuaderno2.Ejercicio1.AuthorBook;

public class Author {
    private String name;
    private String email;

    public Author(String n, String e) {
        name = n;
        email = e;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String toString(){
        return "Author[name="+name+",email="+email+"]";
    }
}
