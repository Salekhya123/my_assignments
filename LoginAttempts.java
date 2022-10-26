package com.company;
import java.util.*;
 class Login
{
    String userid="max", password="password";
    //int loginattempts=3;
    public String loginuser(String user,String pass){
        if(userid.equals(user) &&password.equals(pass) )
        {
            return "yes";
        }
        else
        {
            return "no";
        }
    }

}
public class LoginAttempts {
    public static void main(String[] args) {
        String user,password;
        Login login=new Login();
int loginattempts=0;
        while(true){
        Scanner s=new Scanner(System.in);
        System.out.println("enter user name");
        user=s.next();
        System.out.println("enter password");
        password=s.next();
        String res=login.loginuser(user,password);
        if(res.equals("yes"))
        {
            System.out.println("Login succeeded welconme "+user);
            break;
        }
        else
        {
            loginattempts++;
            if(loginattempts==3){
                System.out.println("you have entered wrong credentials");
                System.out.println("pls contact admin");
                 break;
            }System.out.println("wrong credentials pls re enter");
        }
        }
    }
}
