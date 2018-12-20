import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat; // kan weg als ik de strings van de date objecten weg haal
/**
 * @author: Michiel Jansen 
 * @version 30/10/2017
 */
public class Member{
    private String name;
    private Date dateOfBirth;
    private Date StartDateMembership;
    private String memberType;
    private boolean playingMember;

    /**
     * Constructor for objects of class Lid
     * Correct input:
     * year - the year 0 to 8099
     * month - 1 tot 12
     * day - 1 to 31
     * example: 15/12/1997
     */
    public Member(String name, String dateOfBirthString, String StartDateMembershipString, boolean playingMember){
        this.name = name;
        this.playingMember = playingMember;
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
        //format() method Formats a Date into a date/time string.
        dateOfBirth = df.parse(dateOfBirthString);
        System.out.println("Datebirth: " + df.format(dateOfBirth));//dit mag weggehaald worden
        StartDateMembership = df.parse(StartDateMembershipString);
        System.out.println("Datemembership: " + df.format(StartDateMembership));//dit mag weggehaald worden
        }
        catch (Exception ex ){
          System.out.println(ex);
       }
    }
    
    
    
    /**Get start
     * <----------------------------->
     */
    /**
     * Returns name of the member.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Returns the date of birth of the memberv in string format.
     */
    public String getDateofBirthString(){//deze mag weggehaald worden
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(dateOfBirth);
    }
    
    /**
     * Returns date of start of the membership in string format.
     */
    public String getStartDateMembershipString(){//deze mag weggehaald worden
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(StartDateMembership);
    }
    
       /**
     * Returns the date of birth of the member in objec format.
     */
    public Date getDateofBirthObject(){
        return dateOfBirth;
    }
    
    /**
     * Returns date of start of the membership in object format.
     */
    public Date getStartDateMembershipObject(){
        return StartDateMembership;
    }
    
    /**
     * Returns wheter the player is senior of junior.
     */
    public String getMemberType(){
        if(memberAgeCalculator() >= 18){
            memberType = "senior";
        }
        else if(memberAgeCalculator() < 18){
            memberType = "junior";
        }
        return memberType;
    }
    
    /**
     * Returns wheter the member is playing or not.
     */
    public boolean getPlayingMember(){
        return playingMember;
    }
    
    /**
     * Returns a string of the current time.
     */
    public String getLocalDateString(){//deze mag weggehaald worden
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dateNow = new Date();
        return df.format(dateNow);
    }
    
    /**
     * Returns an object of the current time.
     */
    public Date getLocalDateObject(){
       // Date dateNow = new Date(); //deze word gebruikt om de exacte huidige datum te gebruiken
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dateNow = df.parse("18/10/2017");
            return dateNow;
        }
        catch (Exception ex ){
          System.out.println(ex);
       }
        return null;
        //return dateNow;
    }
     /**Get end
     * <----------------------------->
     */
    
    
    
    /**Calculations start
     * <----------------------------->
     * returns the amount of contribution that a member has to pay
     * senior = 150 euros or junior = 75 euros
     * if a player is a member for seven years or more they get a 5% discount on the contribution
     * if a member is a playing member they have to pay an additional 45 euros.
     */
    public double contributionCalculation(){
        double contributionCount = 0;
        if(getMemberType() == "senior"){
            contributionCount = contributionCount + 150;
        }
        else if(getMemberType() == "junior"){
            contributionCount = contributionCount + 75;
        }
        if(NumberOfYearsMembershipCalculator() >= 7){
            contributionCount = contributionCount/100*95;
        }
        if(getPlayingMember() == true){
            contributionCount = contributionCount + 45;
        }
        return contributionCount;
    }
    
    public long NumberOfYearsMembershipCalculator(){
       long newDate = getLocalDateObject().getTime();
       long membershipDate = getStartDateMembershipObject().getTime();
       long endCalc = newDate - membershipDate;
       long membershipYears = endCalc/1000/60/60/24/7/52;
       return membershipYears;
    }
    
    public int memberAgeCalculator(){
       long newDate = getLocalDateObject().getTime();
       long dateOfBirth = getDateofBirthObject().getTime();
       long endCalc = newDate - dateOfBirth;
       double endCalcSeconds = endCalc/1000;
       double endCalcMinutes = endCalcSeconds/60;
       double endCalcHours = endCalcMinutes/60;
       double endCalcDays = endCalcHours/24;
       double endCalcWeeks = endCalcDays/7;
       double endCalcYears = endCalcWeeks/52;
       return (int)endCalcYears;
    }
    
    public long unixTimeDifference(){
       long newDate = getLocalDateObject().getTime();
       long dateOfBirth = getDateofBirthObject().getTime();
       long endCalc = newDate - dateOfBirth;
       return endCalc;
    }
    /**Calculations end
     * <----------------------------->
     */
    
    
    
    /**Set methods start
     * <----------------------------->
     */
    public void setPlayingMemberTrue(){
       playingMember = true; 
    }
    public void setPlayingMemberFalse(){
        playingMember = false;
    }
     /**Set methods end
     * <----------------------------->
     */
}
