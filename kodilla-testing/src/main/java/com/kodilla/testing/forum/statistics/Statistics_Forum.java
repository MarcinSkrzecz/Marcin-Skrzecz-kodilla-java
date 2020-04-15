package com.kodilla.testing.forum.statistics;

public class Statistics_Forum {
    int userQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        userQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if (userQuantity != 0) {
            averagePostsPerUser = postsQuantity / userQuantity;
            averageCommentsPerUser = commentsQuantity / userQuantity;
        } else {
            System.out.println("User Quantity <= 0 --> ERROR!!!");
            averagePostsPerUser = 0.0;
            averageCommentsPerUser = 0.0;
        }

        if (postsQuantity != 0) {
            averageCommentsPerPost = commentsQuantity / postsQuantity;
        } else {
            System.out.println("Posts Quantity <= 0 --> ERROR!!!");
            averageCommentsPerPost = 0.0;
        }
    }

    public void showStatistics() {
        System.out.println("Forum Statistics:");
        System.out.println("Quantity of forum users: " + userQuantity);
        System.out.println("Quantity of forum posts: " + postsQuantity);
        System.out.println("Quantity of forum comments: " + commentsQuantity);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}

