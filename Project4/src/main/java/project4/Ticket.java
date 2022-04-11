package project4;

public class Ticket {
    private String guestName;
    private int ticketNumber;
    private int confirmationCode;

    public Ticket(String guestName, int ticketNumber, int confirmationCode) {
        this.guestName = guestName;
        this.ticketNumber = ticketNumber;
        this.confirmationCode = confirmationCode;
    }

    public String getStringForFile(){
        return guestName + "|" + ticketNumber + "|" + confirmationCode;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getConfirmationCode() {
        return confirmationCode;
    }

    public int generateConfirmationCode(){
        confirmationCode = (int)( Math.random() * 900000 ) + 100000;
        return confirmationCode;
    }

    public void setConfirmationCode(int confirmationCode) {
        this.confirmationCode = confirmationCode;
    }
}
