
public class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName() );
    }
    public static void main(String[] args) {
        Soccer s = new Soccer();
        s.getNumberOfTeamMembers();
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName() );
    }
}