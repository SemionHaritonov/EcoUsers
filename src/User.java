public class User {
    private int ID;
    private String name;
    private int waterCount;
    private int gasCount1;
    private int gasCount2;
    private int electroCount1;
    private int electroCount2;
    private boolean isEco;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
    }

    public int getGasCount1() {
        return gasCount1;
    }

    public void setGasCount1(int gasCount1) {
        this.gasCount1 = gasCount1;
    }

    public int getGasCount2() {
        return gasCount2;
    }

    public void setGasCount2(int gasCount2) {
        this.gasCount2 = gasCount2;
    }

    public int getElectroCount1() {
        return electroCount1;
    }

    public void setElectroCount1(int electroCount1) {
        this.electroCount1 = electroCount1;
    }

    public int getElectroCount2() {
        return electroCount2;
    }

    public void setElectroCount2(int electroCount2) {
        this.electroCount2 = electroCount2;
    }

    public boolean isEco() {
        return isEco;
    }

    public void setEco(boolean eco) {
        isEco = eco;
    }


}
