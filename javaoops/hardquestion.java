package javaoops;

import java.util.Scanner;

import Leetcode_Ds_from_scratch.day4assignment.transposeOfMatrix;

class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType,String matchType){
        this.playerId=playerId;
        this.playerName = playerName;
        this.runs=runs;
        this.playerType=playerType;
        this.matchType=matchType;

    }
    public int getPlayerId(){return playerId;}
    public String getPlayerName(){return playerName;}
    public int getRuns(){return runs;}
    public String getPlayerType(){return playerType;}
    public String getMatchType(){return matchType;}

}
public class hardquestion {

    public static Player[] findPlayerByMatchType(Player[]players, String MatchType){

        int count =0;
        for(Player p : players){
            if(p.getMatchType().equalsIgnoreCase(MatchType)){
                count++;
            }
        }
        if(count ==0)return null;
        Player[] res = new Player[count];
        int x=0;
        for(Player p : players){
            if(p.getMatchType().equalsIgnoreCase(MatchType)){
                res[x]=p;
                x++;
            }
        }
        //descending order sort by playerid
        for(int i=0;i<count-1;i++){
            for(int j=0;j<count-i-1;j++){
                
                if(res[j].getPlayerId()<res[j+1].getPlayerId()){
                    Player temp = res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                }
            }
        }
        return res;
        

    }
    public static int findPlayerWithLowRuns(Player[] players,String PlayerType){
        int leastRun = Integer.MAX_VALUE;
        Boolean hasplayer=false;
        for(Player p : players){
            if(p.getPlayerType().equalsIgnoreCase(PlayerType)){
                if(p.getRuns()<leastRun){
                    leastRun=p.getRuns();
                    hasplayer=true;
                }
            }
        }
        if(hasplayer){return leastRun;}
        else{return 0;}
    }
    public static void main(String[] args) {
        Player[] finres =new Player[4]; 
        Scanner sc  = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int playerId=sc.nextInt();
            sc.nextLine();
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String MatchType = sc.nextLine();
             
            finres [i]=new Player(playerId, playerName, runs, playerType, MatchType);
        }

        String PlayerType2= sc.nextLine();
        String MatchType2=sc.nextLine();

        int res1=findPlayerWithLowRuns(finres, PlayerType2);
        if(res1==0){
            System.out.println("No Such Player");
        }else{
            System.out.println(res1);
        }

        Player[] res2= findPlayerByMatchType(finres, MatchType2);
        if(res2==null){
            System.out.println("No player with given Match Type");
        }else{
            for(Player p : res2){
                System.out.println(p.getPlayerId());
            }
        }
    }
}
