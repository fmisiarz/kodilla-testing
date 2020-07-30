package com.kodilla.testing.forum.statistics;
import java.util.List;

public class StatClass  {
    Statistics statistics;
    public StatClass(Statistics statistics){
        this.statistics=statistics;
    }

    void calculateAdvStatistics(Statistics statistics){
    usersCount=usersNames.size();

    CommentAveragePerPost=(commentsCount()/postsCount());
    CommentAveragePerUser=commentsCount()/usersNames.size();
    PostAveragePerUser=postsCount()/usersNames.size();
}
    void showStatistics(){
  System.out.println("Comment average per post: "+getCommentAveragePerPost()+". Comment average per user: "
          +getCommentAveragePerUser()+". Post average per user: "+getPostAveragePerUser()+". Total amount of users: "
  +getUsersCount()+". Total amount of posts: "+postsCount()+". Total amount of comments: "+commentsCount());
    }
    public List<String> usersNames;
   public int PostAveragePerUser;
   public int postsCount;
    private int CommentAveragePerUser;
    public int CommentAveragePerPost;
    public int CommentCount;
    public int usersCount;

    public int getUsersCount() {
        return usersCount;
    }

    public int getCommentAveragePerPost() {
        return CommentAveragePerPost;
    }


    public int getCommentAveragePerUser(){
        return CommentAveragePerUser;
    }
   public int getPostAveragePerUser(){
       return PostAveragePerUser;
   }
    public List<String> usersNames() {
        return this.usersNames;
    }
    public int postsCount() {
        return postsCount;
    }


    public int commentsCount() {
        return CommentCount;
    }
}
