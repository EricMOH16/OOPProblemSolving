package ProblemSolving9.ExerciseA;
//Interface Class
//Abstract method has no bodies.
//Programming in a generic sense
public interface Game {
    public abstract void setRules(String[] rules);
    public abstract void setPlayersPerTeam(int playersPerTeam);
    public abstract String[] getRules();
    public abstract int getPlayersPerTeam();
}
