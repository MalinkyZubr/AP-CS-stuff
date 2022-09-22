public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private String numUsers;
    
    public Website(String domainName, String topLevelDomainName, int users){
        domain = domainName;
        topLevelDomain = topLevelDomainName;
        numUsers = users;
        
    }
    public Website(){
        domain = "codehs";
        topLevelDomain = "com";
        numUsers = 1;
    }
    public Website(String domainName, String topLevelDomainName){
        domain = domainName;
        topLevelDomain = topLevelDomainName;
        numUsers = 10435;
    }
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
