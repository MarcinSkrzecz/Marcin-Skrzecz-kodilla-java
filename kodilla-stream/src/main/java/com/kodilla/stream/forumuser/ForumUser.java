package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int countOfUserPosts;

    public ForumUser(int userId, String username, char sex, int dayOfBirth, int monthOfBirth, int yearOfBirth, int countOfUserPosts) {
        this.userId = userId;
        this.userName = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(dayOfBirth, monthOfBirth, yearOfBirth);
        this.countOfUserPosts = countOfUserPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getCountOfUserPosts() {
        return countOfUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", countOfUserPosts=" + countOfUserPosts +
                '}';
    }
}
