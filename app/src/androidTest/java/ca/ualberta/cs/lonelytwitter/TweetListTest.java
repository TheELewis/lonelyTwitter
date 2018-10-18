package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Erik Lewis on 2018-10-17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){

        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("doopy doop");
        tweets.addTweet(tweet);
        tweets.deleteTweet(tweet);
        assertTrue(tweets.deleteTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("doopy doop");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweet.equals(tweets.getTweet(0)));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet;
        String testString = "";
        int i = 10;
        while(i!=0){
            testString += String.valueOf(i);
            tweet = new NormalTweet(testString);
            tweets.addTweet(tweet);
            i--;
        }
        assertTrue(tweets.getCount().equals(10));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet;
        String testString = "";
        int i = 10;
        while(i!=0){
            testString += String.valueOf(i);
            tweet = new NormalTweet(testString);
            tweets.addTweet(tweet);
            i--;
        }
        assertTrue(tweets.getTweets().equals(tweets));
    }

}
