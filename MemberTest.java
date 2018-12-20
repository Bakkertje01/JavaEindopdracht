import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MemberTest.
 *
 * @author  Michiel Jansen
 * @version 01/11/2017
 */
public class MemberTest
{

    @Test
    public void test1(){
        Member erik = new Member("Erik", "10/06/1987", "14/07/2015", false);
        
        String name = erik.getName();
        int age = erik.memberAgeCalculator();
        String memberType = erik.getMemberType();
        long membershipYears = erik.NumberOfYearsMembershipCalculator();
        double contribution = erik.contributionCalculation();
        
        assertEquals("Erik", name);
        assertEquals(30, age);
        assertEquals("senior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(150, contribution,0);
    }
    
    @Test
    public void test2(){
        Member erik = new Member("Erik", "10/06/1987", "14/07/2015", true);
        
        String name = erik.getName();
        long age = erik.memberAgeCalculator();
        String memberType = erik.getMemberType();
        long membershipYears = erik.NumberOfYearsMembershipCalculator();
        double contribution = erik.contributionCalculation();
        
        assertEquals("Erik", name);
        assertEquals(30, age);
        assertEquals("senior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(195, contribution,0);
    }
    
    @Test
    public void test3(){
        Member klaas = new Member("Klaas", "15/08/2007", "20/03/2015", false);
        
        String name = klaas.getName();
        long age = klaas.memberAgeCalculator();
        String memberType = klaas.getMemberType();
        long membershipYears = klaas.NumberOfYearsMembershipCalculator();
        double contribution = klaas.contributionCalculation();
        
        assertEquals("Klaas", name);
        assertEquals(10, age);
        assertEquals("junior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(75, contribution,0);
    }
    
    @Test
    public void test4(){
        Member piet = new Member("Piet", "16/04/2007", "05/04/2010", false);
        
        String name = piet.getName();
        long age = piet.memberAgeCalculator();
        String memberType = piet.getMemberType();
        long membershipYears = piet.NumberOfYearsMembershipCalculator();
        double contribution = piet.contributionCalculation();
        
        assertEquals("Piet", name);
        assertEquals(10, age);
        assertEquals("junior", memberType);
        assertEquals(7, membershipYears);
        assertEquals(71.25, contribution,0);
    }
    
    @Test
    public void test5(){
        Member piet = new Member("Piet", "16/04/2007", "05/04/2010", true);
        
        String name = piet.getName();
        long age = piet.memberAgeCalculator();
        String memberType = piet.getMemberType();
        long membershipYears = piet.NumberOfYearsMembershipCalculator();
        double contribution = piet.contributionCalculation();
        
        assertEquals("Piet", name);
        assertEquals(10, age);
        assertEquals("junior", memberType);
        assertEquals(7, membershipYears);
        assertEquals(116.25, contribution,0);
    }
    
    @Test
    public void test6(){
        Member henk = new Member("Henk", "23/01/1977", "05/04/2007", false);
        
        String name = henk.getName();
        long age = henk.memberAgeCalculator();
        String memberType = henk.getMemberType();
        long membershipYears = henk.NumberOfYearsMembershipCalculator();
        double contribution = henk.contributionCalculation();
        
        assertEquals("Henk", name);
        assertEquals(40, age);
        assertEquals("senior", memberType);
        assertEquals(10, membershipYears);
        assertEquals(142.5, contribution,0);
    }
    
    @Test
    public void test7(){
        Member hans = new Member("Hans", "19/10/1999", "16/02/2015", false);
        
        String name = hans.getName();
        long age = hans.memberAgeCalculator();
        String memberType = hans.getMemberType();
        long membershipYears = hans.NumberOfYearsMembershipCalculator();
        double contribution = hans.contributionCalculation();
        
        assertEquals("Hans", name);
        assertEquals(17, age);
        assertEquals("junior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(75, contribution,0);
    }
    
    @Test
    public void test8(){
        Member gert = new Member("Gert", "18/10/1999", "08/01/2015", false);
        
        String name = gert.getName();
        long age = gert.memberAgeCalculator();
        String memberType = gert.getMemberType();
        long membershipYears = gert.NumberOfYearsMembershipCalculator();
        double contribution = gert.contributionCalculation();
        
        assertEquals("Gert", name);
        assertEquals(18, age);
        assertEquals("senior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(150, contribution,0);
    }
    
    @Test
    public void test9(){
        Member egbert = new Member("Egbert", "17/10/1999", "05/03/2015", false);
        
        String name = egbert.getName();
        long age = egbert.memberAgeCalculator();
        String memberType = egbert.getMemberType();
        long membershipYears = egbert.NumberOfYearsMembershipCalculator();
        double contribution = egbert.contributionCalculation();
        
        assertEquals("Egbert", name);
        assertEquals(18, age);
        assertEquals("senior", memberType);
        assertEquals(2, membershipYears);
        assertEquals(150, contribution,0);
    }
    
    @Test
    public void test10(){
        Member harry = new Member("Harry", "23/04/1981", "19/10/2010", false);
        
        String name = harry.getName();
        long age = harry.memberAgeCalculator();
        String memberType = harry.getMemberType();
        long membershipYears = harry.NumberOfYearsMembershipCalculator();
        double contribution = harry.contributionCalculation();
        
        assertEquals("Harry", name);
        assertEquals(36, age);
        assertEquals("senior", memberType);
        assertEquals(6, membershipYears);
        assertEquals(150, contribution,0);
    }
    
    @Test
    public void test11(){
        Member jaap = new Member("Jaap", "08/06/1976", "18/10/2010", false);
        
        String name = jaap.getName();
        long age = jaap.memberAgeCalculator();
        String memberType = jaap.getMemberType();
        long membershipYears = jaap.NumberOfYearsMembershipCalculator();
        double contribution = jaap.contributionCalculation();
        
        assertEquals("Jaap", name);
        assertEquals(41, age);
        assertEquals("senior", memberType);
        assertEquals(7, membershipYears);
        assertEquals(142.5, contribution,0);
    }
    
    @Test
    public void test12(){
        Member anton = new Member("Anton", "16/11/2001", "17/10/2010", false);
        
        String name = anton.getName();
        long age = anton.memberAgeCalculator();
        String memberType = anton.getMemberType();
        long membershipYears = anton.NumberOfYearsMembershipCalculator();
        double contribution = anton.contributionCalculation();
        
        assertEquals("Anton", name);
        assertEquals(15, age);
        assertEquals("junior", memberType);
        assertEquals(7, membershipYears);
        assertEquals(71.25, contribution,0);
    }
    
}