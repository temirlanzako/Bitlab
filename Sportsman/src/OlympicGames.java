public class OlympicGames {
    protected String city;
    protected int year;
    protected Sportsman[] sportsmanList;

     public OlympicGames(String city, int year, Sportsman[] sportsmanList) {
        this.city = city;
        this.year = year;
        this.sportsmanList = sportsmanList;
     }
     public void play() {
         System.out.println("City: " + city + ",Year: " + year + "is playing");
         for(int i = 0; i < sportsmanList.length; i++) {
             sportsmanList[i].play();
         }
     }

     public String toString(){
        return "City: " + city + ",Year: " + year + ",SportsManList: " + sportsmanList;
     }
}
