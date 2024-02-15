package king.allies;

public class AllyTrooper extends Ally{
    public AllyTrooper(int allycost, int allyhp, int allydmg){
        super(allycost, allyhp, allydmg);
        Ally.allycost =10;
        Ally.allyhp =15;
        Ally.allydmg =10;
    }
}
