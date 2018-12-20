import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SportClubTest.
 *
 * Michiel Jansen
 * 01/11/2017
 */
public class SportClubTest
{
   @Test
    public void test13(){
        SportClub club1 = new SportClub();
        
        Member erik = new Member("Erik", "10/06/1987", "14/07/2015", true);
        Member klaas = new Member("Klaas", "15/08/2007", "20/03/2015", false);
        Member piet = new Member("Piet", "16/04/2007", "05/04/2010", true);
        Member henk = new Member("Henk", "23/01/1977", "05/04/2007", false);
        Member hans = new Member("Hans", "19/10/1999", "16/02/2015", false);
        Member gert = new Member("Gert", "18/10/1999", "08/01/2015", false);
        Member egbert = new Member("Egbert", "17/10/1999", "05/03/2015", false);
        Member harry = new Member("Harry", "23/04/1981", "19/10/2010", false);
        Member jaap = new Member("Jaap", "08/06/1976", "18/10/2010", false);
        Member anton = new Member("Anton", "16/11/2001", "17/10/2010", false);
        
        club1.join(erik);
        club1.join(klaas);
        club1.join(piet);
        club1.join(henk);
        club1.join(hans);
        club1.join(gert);
        club1.join(egbert);
        club1.join(harry);
        club1.join(jaap);
        club1.join(anton);
        
        double contributionTotal = club1.contributionTotal();
        
        assertEquals(1335, contributionTotal,0);
    }
    
   @Test
    public void test14(){
        SportClub club1 = new SportClub();
        
        Member erik = new Member("Erik", "10/06/1987", "14/07/2015", true);
        Member klaas = new Member("Klaas", "15/08/2007", "20/03/2015", false);
        Member piet = new Member("Piet", "16/04/2007", "05/04/2010", true);
        Member henk = new Member("Henk", "23/01/1977", "05/04/2007", false);
        Member hans = new Member("Hans", "19/10/1999", "16/02/2015", false);
        Member gert = new Member("Gert", "18/10/1999", "08/01/2015", false);
        Member egbert = new Member("Egbert", "17/10/1999", "05/03/2015", false);
        Member harry = new Member("Harry", "23/04/1981", "19/10/2010", false);
        Member jaap = new Member("Jaap", "08/06/1976", "18/10/2010", false);
        Member anton = new Member("Anton", "16/11/2001", "17/10/2010", false);
        
        club1.join(erik);
        club1.join(klaas);
        club1.join(piet);
        club1.join(henk);
        club1.join(hans);
        club1.join(gert);
        club1.join(egbert);
        club1.join(harry);
        club1.join(jaap);
        club1.join(anton);
        
        double avarageMemberYears = club1.avarageMembershipYears();
        
        assertEquals(4.8, avarageMemberYears,0);
    }
   @Test
    public void test15(){
        SportClub club1 = new SportClub();
        
        Member erik = new Member("Erik", "10/06/1987", "14/07/2015", true);
        Member klaas = new Member("Klaas", "15/08/2007", "20/03/2015", false);
        Member piet = new Member("Piet", "16/04/2007", "05/04/2010", true);
        Member henk = new Member("Henk", "23/01/1977", "05/04/2007", false);
        Member hans = new Member("Hans", "19/10/1999", "16/02/2015", false);
        Member gert = new Member("Gert", "18/10/1999", "08/01/2015", false);
        Member egbert = new Member("Egbert", "17/10/1999", "05/03/2015", false);
        Member harry = new Member("Harry", "23/04/1981", "19/10/2010", false);
        Member jaap = new Member("Jaap", "08/06/1976", "18/10/2010", false);
        Member anton = new Member("Anton", "16/11/2001", "17/10/2010", false);
        
        club1.join(erik);
        club1.join(klaas);
        club1.join(piet);
        club1.join(henk);
        club1.join(hans);
        club1.join(gert);
        club1.join(egbert);
        club1.join(harry);
        club1.join(jaap);
        club1.join(anton);
        
        String youngestMember = club1.getYoungestMember();
        
        assertEquals("Klaas", youngestMember);
    }
}
