import java.util.ArrayList;
/**
 * 
 * @author: Michiel Jansen 
 * @version 30/10/2017
 * 
 * Gemiddelde lidmaatschapsjaren            (double aantal jaren)
 * Het jongste lid moet worden getoont      (String”naam jongste lid”)

 */
public class SportClub
{
    private ArrayList<Member> members;

    /**
     * Constructor for objects of class Sportvereniging
     */
    public SportClub(){
        members = new ArrayList<>();
    }
    
    /**
     * Add a new member to the club
     */
    public void join(Member member){
        members.add(member);
    }
    
    /**
     * return The number of members (Membership objects) in the sports club.
     */
    public int numberOfMembers(){
        return members.size();
    }
    /**
     * contributions total
     */
    public double contributionTotal(){
        double count = 0;
        for(Member member : members){
            count = count + member.contributionCalculation();
        }
        return count;
    }
    
    /**
     * The avarage number of membershipyears
     */
    public double avarageMembershipYears(){
        double count = 0;
        for(Member member : members){
           count = count + member.NumberOfYearsMembershipCalculator();
        }
        return count/numberOfMembers();
    }
    
    /**
     * returns the name of the youngest member
     */
    public String getYoungestMember(){
        long count = 0;
        String returnValue = "";
        for(Member member : members){
            if(count == 0){
                count = member.unixTimeDifference();
                returnValue = member.getName();
            }
            if(member.unixTimeDifference() < count){
                returnValue = member.getName();
                count = member.unixTimeDifference();
            }
        }
        return returnValue;
    }
}
