package com.kodilla.patterns.strategy.social;

public class User {
    final private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}