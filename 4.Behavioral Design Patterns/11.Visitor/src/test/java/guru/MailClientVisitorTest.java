package guru;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 12:00 AM
*/

class MailClientVisitorTest {

    private MacMailClientVisitor macVisitor;
    private LinuxMailClientVisitor linuxVisitor;
    private WindowsMailClientVisitor windowsVisitor;
    private OperaMailClient operaMailClient;
    private SquirrelMailClient squirrelMailClient;
    private ZimbraMailClient zimbraMailClient;


    @BeforeEach
    void setUp() {
        macVisitor = new MacMailClientVisitor();
        linuxVisitor = new LinuxMailClientVisitor();
        windowsVisitor = new WindowsMailClientVisitor();
        operaMailClient = new OperaMailClient();
        squirrelMailClient = new SquirrelMailClient();
        zimbraMailClient = new ZimbraMailClient();
    }

    @Test
    void testOperaMailClient() {
        System.out.println("-------------- TESTING Opera Mail Client for different environments");
        assertTrue(operaMailClient.accept(macVisitor));
        assertTrue(operaMailClient.accept(windowsVisitor));
        assertTrue(operaMailClient.accept(linuxVisitor));
    }

    @Test
    void testSquirrelMailClient() {
        System.out.println("-------------- TESTING Squirrel Mail Client for different environments");
        assertTrue(squirrelMailClient.accept(macVisitor));
        assertTrue(squirrelMailClient.accept(windowsVisitor));
        assertTrue(squirrelMailClient.accept(linuxVisitor));
    }

    @Test
    void testZimbraMailClient() {
        System.out.println("-------------- TESTING Zimbra Mail Client for different environments");
        assertTrue(zimbraMailClient.accept(macVisitor));
        assertTrue(zimbraMailClient.accept(windowsVisitor));
        assertTrue(zimbraMailClient.accept(linuxVisitor));
    }
}