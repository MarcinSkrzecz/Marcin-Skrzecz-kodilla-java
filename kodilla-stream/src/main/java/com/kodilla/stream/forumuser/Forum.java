package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum() {
        theForumUsers.add(new ForumUser(1, "Maruuu", 'M', 26,11,1991, 100));
        theForumUsers.add(new ForumUser(2, "Ona", 'S', 01, 02, 2000, 30));
        theForumUsers.add(new ForumUser(3, "ABC", 'M', 11, 12, 2010, 29));
        theForumUsers.add(new ForumUser(4, "DEF", 'M', 01, 01, 1999, 0));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsers);
    }
}
