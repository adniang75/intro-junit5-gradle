package com.alassaneniang;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass () {
        System.out.println( "Before - I am only being called ONCE!!!" );
    }

    @AfterAll
    public static void afterClass () {
        System.out.println( "After - I am only being called ONCE!!!" );
    }

    @BeforeEach
    void setUp () {
        System.out.println( "\t" + "In Before Each" );
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown () {
        System.out.println( "\t" + "In After Each" );
    }

    @Test
    void testHelloWorld () {
        System.out.println( "\t\t" + greeting.helloWorld() );
    }

    @Test
    void testHelloWorldWithNameJohn () {
        System.out.println( "\t\t" + greeting.helloWorld( "John" ) );
    }

    @Test
    void testHelloWorldWithNameSam () {
        System.out.println( "\t\t" + greeting.helloWorld( "Sam" ) );
    }
}