package bankingSystem;

public class Bank {

    String Name;
    String headofficeAddress;
    String chairmanName;
    int branchCount;
    float fdInterestRate;
    float personalLoanInterestRate;
    float homeLoanInterestRate;

    public Bank() {
        System.out.println("Default Constructer");
    }

    public Bank(String name, String headofficeAddress, String chairmanName, int branchCount,
                float fdInterestRate, float personalLoanInterestRate, float homeLoanInterestRate) {
        Name = name;
        this.headofficeAddress = headofficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return Name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public float getFdInterestRate() {
        return fdInterestRate;
    }

    public float getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public float getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(float fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(float personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(float homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Sbi{" +'\n'+
                "Name='" + Name + '\n' +
                ", headofficeAddress='" + headofficeAddress + '\n' +
                ", chairmanName='" + chairmanName + '\n' +
                ", branchCount=" + branchCount +'\n'+
                ", fdInterestRate=" + fdInterestRate +'\n'+
                ", personalLoanInterestRate=" + personalLoanInterestRate +'\n'+
                ", homeLoanInterestRate=" + homeLoanInterestRate +'\n'+
                '}';
    }
}
