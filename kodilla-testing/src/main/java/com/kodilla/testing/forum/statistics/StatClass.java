package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatClass {
    Statistics statistics;
    private int postsCount(){
        return statistics.postsCount();
    }
    private int usersCount(){
        return statistics.usersNames().size();
    }
    private int commentsCount(){
        return statistics.commentsCount();
    }
    private int postAveragePerUser(){
        return statistics.postsCount()/statistics.usersNames().size();
    }
    private int commentAveragePerUser(){
        return statistics.commentsCount()/statistics.usersNames().size();
    };
    private int commentAveragePerPost(){
        return statistics.commentsCount()/statistics.postsCount();
    };
    public StatClass(Statistics statistics) {
        this.statistics = statistics;
    }
        public int getUsersCount () {

            return usersCount();
        }
    public int getPostsCount () {
        return postsCount();
    }
    public int getCommentsCount () {
        return commentsCount();
    }
    public int getPostAveragePerUser () {
        return postAveragePerUser();
    }
    public int getCommentAveragePerUser () {
        return commentAveragePerUser();
    }
        public int getCommentAveragePerPost () {
            return commentAveragePerPost();        }
            public List<String> usersNames () {
            return statistics.usersNames();
        }
    void calculateAdvStatistics(Statistics statistics) {
        int calcUserCount=getUsersCount();
        int calcPostsCount=getPostsCount();
        int calcCommentsCount=getCommentsCount();
        int calcPostAveragePerUser=getPostAveragePerUser();
       int calcCommentAveragePerUser= getCommentAveragePerUser();
        int calcCommentAveragePerPost = getCommentAveragePerPost();
    }
    void showStatistics() {
        System.out.println("Comment average per post: " + getCommentAveragePerPost() + ". Comment average per user: "
                + getCommentAveragePerUser() + ". Post average per user: " + getPostAveragePerUser() + ". Total amount of users: "
                + getUsersCount() + ". Total amount of posts: " + getPostsCount() + ". Total amount of comments: " + getCommentsCount());
    }
}
