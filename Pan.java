public class Pan {
    private String panNumber;
    private String aadharNumber;
    private String bankDetail;
    private String investments;

    public Pan(String panNumber, String aadharNumber, String bankDetail, String investments) {
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.bankDetail = bankDetail;
        this.investments = investments;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getBankDetail() {
        return bankDetail;
    }

    public void setBankDetail(String bankDetail) {
        this.bankDetail = bankDetail;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", bankDetail='" + bankDetail + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}
