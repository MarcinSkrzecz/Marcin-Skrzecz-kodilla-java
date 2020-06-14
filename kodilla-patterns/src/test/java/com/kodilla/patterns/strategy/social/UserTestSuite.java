package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Jan Kowalski");
        User yGen = new YGeneration("Barbara Kwarc");
        User zGen = new ZGeneration("Janusz Piotr");

        //When
        String millenialsChoice = millenials.sharePost();
        System.out.println("Millenials use: " + millenialsChoice);
        String YGenChoice = yGen.sharePost();
        System.out.println("YGen use: " + YGenChoice);
        String ZGenChoice = zGen.sharePost();
        System.out.println("ZGen use: " + ZGenChoice);

        //Then
        Assert.assertEquals("FB",millenialsChoice);
        Assert.assertEquals("Twitter",YGenChoice);
        Assert.assertEquals("Snap",ZGenChoice);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("X Y");

        //When
        String millenialsChoice = millenials.sharePost();
        System.out.println("Millenials use: " + millenialsChoice);
        millenials.setSocialMedia(new TwitterPublisher());
        millenialsChoice = millenials.sharePost();
        System.out.println("Millenials now use: " + millenialsChoice);

        //Then
        Assert.assertEquals("Twitter",millenialsChoice);

    }
}