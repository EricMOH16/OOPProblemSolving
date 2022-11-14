package ProblemSolving9.ExerciseA;

import java.util.Arrays;

//Concrete Instantiable Class
public class Soccer extends BallSport implements Game{
    private int gameDuration;
    private String[] surfaces;
    private String[] rules;
    private int playersPerTeam;

    public Soccer(String name, int yearEstablished, int gameDuration, String[] surfaces, String[] rules, int playersPerTeam) {
        super(name, yearEstablished);
        setGameDuration(gameDuration);
        setSurfaces(surfaces);
        setRules(rules);
        setPlayersPerTeam(playersPerTeam);
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public String[] getSurfaces() {
        return surfaces;
    }

    public void setSurfaces(String[] surfaces) {
        this.surfaces = surfaces;
    }

    @Override
    public String[] getRules() {
        return rules;
    }

    @Override
    public void setRules(String[] rules) {
        this.rules = rules;
    }

    @Override
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    @Override
    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    @Override
    public String toString() {
        return super.toString() + "gameDuration= " + getGameDuration()+
                "\n surfaces= " + Arrays.toString(surfaces) +
                "\nrules= " + Arrays.toString(rules) +
                "\n playersPerTeam= " +getPlayersPerTeam()
                ;
    }
}
