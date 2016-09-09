package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student(){ this.YearOfBirth = 1990;
                      this.name = "John Doe";
                      this.id = "560610000";
                      this.Active = false;

    }

    public Student(String n,String i,int y,boolean a) {
        // implement here
        this.YearOfBirth = (y>1989)?y:1990;
        this.id = isValidStudent_id(i)?i:"560610000";
        this.name = !n.equalsIgnoreCase("")?n:"John Doe";
        this.Active=a;
    }

    // implement all missing constructors here

    // implement all get and set methods here

    @Override
    public String toString() {
        String o = this.name + " ("
                + this.id + ") was born in "
                + this.YearOfBirth + " is an INACTIVE student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        return m.matches();
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    public boolean isActive(){
        return Active;
    }

    // declare your attributes here
    public  String getName(){
        return name;
    }
    public  String getStudent_id(){
        return id;
    }
    public int getYearOfBirth(){
        return YearOfBirth;
    }

    // attributes class "set".
    private static final String idREGEX = "5[6-9]061[0-2][0-9]{3}";
    public void setName(String name){
        if (name == ""){
        }
        else{
        this.name = name;}
    }
    public void setStudent_id(String id){
        if(isValidStudent_id(id))
        this.id = id;

        else{};

    }
    public void setYearOfBirth(int YearOfBirth){
        if(YearOfBirth <1989 ){}

        else{
        this.YearOfBirth = YearOfBirth;};
    }


    private String name;
    private String id;
    private int YearOfBirth;
    private boolean Active;

}
