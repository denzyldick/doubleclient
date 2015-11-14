package doubleclient.denzyldick.doubleclient.model;

/**
 * Created by denzyl on 11/11/15.
 */
public class Credential {

    public String email,password;

    public Credential(String email,String password)
    {
        this.email = email;
        this.password = password;
    }

    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
}
