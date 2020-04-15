package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTests {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //gdy liczba postów = 0,
    @Test
    public void testCalculateAdvStatistics_Mock_1() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 0;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 1000;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, mockStatistics.usersNames().size());
        Assert.assertEquals(0, mockStatistics.postsCount());
        Assert.assertEquals(1000, mockStatistics.commentsCount());
        Assert.assertEquals(0, averageCommentsPerPost, 0.5);
        Assert.assertEquals(100, averageCommentsPerUser, 0.5);
        Assert.assertEquals(0, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba postów = 1000,
    @Test
    public void testCalculateAdvStatistics_Mock_2() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 1000;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 1000;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, mockStatistics.usersNames().size());
        Assert.assertEquals(1000, mockStatistics.postsCount());
        Assert.assertEquals(1000, mockStatistics.commentsCount());
        Assert.assertEquals(1, averageCommentsPerPost, 0.5);
        Assert.assertEquals(100, averageCommentsPerUser, 0.5);
        Assert.assertEquals(100, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba komentarzy = 0,
    @Test
    public void testCalculateAdvStatistics_Mock_3() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 100;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 0;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, mockStatistics.usersNames().size());
        Assert.assertEquals(100, mockStatistics.postsCount());
        Assert.assertEquals(0, mockStatistics.commentsCount());
        Assert.assertEquals(0, averageCommentsPerPost, 0.5);
        Assert.assertEquals(0, averageCommentsPerUser, 0.5);
        Assert.assertEquals(10, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba komentarzy < liczba postów,
    @Test
    public void testCalculateAdvStatistics_Mock_4() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 100;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 10;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, mockStatistics.usersNames().size());
        Assert.assertEquals(100, mockStatistics.postsCount());
        Assert.assertEquals(10, mockStatistics.commentsCount());
        Assert.assertEquals(0.1, averageCommentsPerPost, 0.5);
        Assert.assertEquals(1, averageCommentsPerUser, 0.5);
        Assert.assertEquals(10, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba komentarzy > liczba postów,
    @Test
    public void testCalculateAdvStatistics_Mock_5() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 100;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 1000;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10, mockStatistics.usersNames().size());
        Assert.assertEquals(100, mockStatistics.postsCount());
        Assert.assertEquals(1000, mockStatistics.commentsCount());
        Assert.assertEquals(10, averageCommentsPerPost, 0.5);
        Assert.assertEquals(100, averageCommentsPerUser, 0.5);
        Assert.assertEquals(10, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba użytkowników = 0,
    @Test
    public void testCalculateAdvStatistics_Mock_6() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 100;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 1000;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, mockStatistics.usersNames().size());
        Assert.assertEquals(100, mockStatistics.postsCount());
        Assert.assertEquals(1000, mockStatistics.commentsCount());
        Assert.assertEquals(10, averageCommentsPerPost, 0.5);
        Assert.assertEquals(0, averageCommentsPerUser, 0.5);
        Assert.assertEquals(0, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }

    //gdy liczba użytkowników = 100.
    @Test
    public void testCalculateAdvStatistics_Mock_7() {
        //Given
        Statistics_Forum forumStatistics = new Statistics_Forum();
        Statistics mockStatistics = mock(Statistics.class);

        List<String> userQuantityMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userQuantityMock.add("Marcin");
        }
        when(mockStatistics.usersNames()).thenReturn(userQuantityMock);

        int postsQuantityMock = 100;
        when(mockStatistics.postsCount()).thenReturn(postsQuantityMock);

        int commentsQuantityMock = 1000;
        when(mockStatistics.commentsCount()).thenReturn(commentsQuantityMock);

        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100, mockStatistics.usersNames().size());
        Assert.assertEquals(100, mockStatistics.postsCount());
        Assert.assertEquals(1000, mockStatistics.commentsCount());
        Assert.assertEquals(10, averageCommentsPerPost, 0.5);
        Assert.assertEquals(10, averageCommentsPerUser, 0.5);
        Assert.assertEquals(1, averagePostsPerUser, 0.5);

        forumStatistics.showStatistics();
    }
}