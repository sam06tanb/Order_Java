package itens;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private String Name;

    private String email;

    private Date BirthDate;

    public Client(){
    }

    public Client(String name, String email, Date birthDate) {
        this.Name = name;
        this.email = email;
        this.BirthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    @Override
    public String toString() {
        return Name + "(" + sdf.format(BirthDate) + ") -" + email;
    }
}
