package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatClass {
    Statistics statistics;
    public StatClass(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {
        getUsersCount();
        getPostsCount();
        getCommentsCount();
        getPostAveragePerUser();
        getCommentAveragePerUser();
        getCommentAveragePerPost();
    }


        public int getUsersCount () {

            return statistics.usersNames().size();
        }
    public int getPostsCount () {
        return statistics.postsCount();
    }
    public int getCommentsCount () {
        return statistics.commentsCount();
    }
    public int getPostAveragePerUser () {
        return statistics.postsCount()/statistics.usersNames().size();
    }
    public int getCommentAveragePerUser () {
        return (statistics.commentsCount()/statistics.usersNames().size());
    }
        public int getCommentAveragePerPost () {
            return statistics.commentsCount()/statistics.postsCount();        }
            public List<String> usersNames () {
            return statistics.usersNames();
        }
    void showStatistics() {
        System.out.println("Comment average per post: " + getCommentAveragePerPost() + ". Comment average per user: "
                + getCommentAveragePerUser() + ". Post average per user: " + getPostAveragePerUser() + ". Total amount of users: "
                + getUsersCount() + ". Total amount of posts: " + getPostsCount() + ". Total amount of comments: " + getCommentsCount());
    }
}
