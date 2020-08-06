package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    static ForumUser forumUser1=new ForumUser(1,"Dorota", 'F',2001,12,20,5);
    static ForumUser forumUser2=new ForumUser(2,"Maciej", 'M',2002,12,19,55);
    static ForumUser forumUser3=new ForumUser(3,"Piotr", 'M',1991,1,12,53);
    static ForumUser forumUser4=new ForumUser(4,"Bartek", 'M',1981,2,13,15);
    static ForumUser forumUser5=new ForumUser(5,"Karol", 'M',2005,5,29,13);
    static ForumUser forumUser6=new ForumUser(6,"Paulina", 'F',2000,6,5,12);
    static ForumUser forumUser7=new ForumUser(7,"Kamila", 'F',1995,3,5,22);
    static ForumUser forumUser8=new ForumUser(8,"Filip", 'M',1996,12,22,1);
    static ForumUser forumUser9=new ForumUser(9,"Monika", 'F',1992,11,15,0);
    static ForumUser forumUser10=new ForumUser(10,"Natalia", 'F',1997,11,23,78);

    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(forumUser1);
        theList.add(forumUser2);
        theList.add(forumUser3);
        theList.add(forumUser4);
        theList.add(forumUser5);
        theList.add(forumUser6);
        theList.add(forumUser7);
        theList.add(forumUser8);
        theList.add(forumUser9);
        theList.add(forumUser10);
        return new ArrayList<ForumUser>(theList);
    }
}
